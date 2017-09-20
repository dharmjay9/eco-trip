package com.myecotrip.myecotrip.booking;

import android.app.ProgressDialog;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.myecotrip.myecotrip.R;
import com.myecotrip.myecotrip.base.BaseActivity;
import com.myecotrip.myecotrip.booking.rowData.BookingResponse;
import com.myecotrip.myecotrip.booking.rowData.BookingReuest;
import com.myecotrip.myecotrip.booking.rowData.CheckAvailibityRequest;
import com.myecotrip.myecotrip.network.ErrorCodes;
import com.myecotrip.myecotrip.network.MyEcoTripCallBack;
import com.myecotrip.myecotrip.orderSummary.OrderSummaryActivity;
import com.myecotrip.myecotrip.payment.Utility.AvenuesParams;
import com.myecotrip.myecotrip.payment.WebViewActivity;

import java.util.ArrayList;
import java.util.List;


public class ActivitySeatDetails extends BaseActivity {

    private int totalCount;
    private RecyclerView recyclerView;
    private Button btnPay;
    private List<BookingReuest.DetailBean> list;
    private  CheckAvailibityRequest checkAvailibityRequest;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setupToolBar();
    }

    @Override
    protected void initView() {
        setContentView(R.layout.activity_seat_details);
        recyclerView = (RecyclerView) findViewById(R.id.rvCommon);
        btnPay = (Button) findViewById(R.id.btnPay);
        totalCount = getIntent().getIntExtra("count", 0);
        checkAvailibityRequest=getIntent().getParcelableExtra("k1");
        list = new ArrayList<>();
        for (int i = 0; i < checkAvailibityRequest.getGuest_no(); i++) {
            list.add(new BookingReuest.DetailBean());
        }
        btnPay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                goToPayment();
            }
        });
        UserEntryAdapter userEntryAdapter = new UserEntryAdapter(list, this);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(userEntryAdapter);
    }

    private void setupToolBar() {
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        toolbar.setTitle("Guest Details");
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
    }


    private void goToPayment() {

        for (BookingReuest.DetailBean detailBean : list) {
            if (TextUtils.isEmpty(detailBean.getName()) || TextUtils.isEmpty(detailBean.getSex()) || TextUtils.isEmpty(detailBean.getAge())) {
                Toast.makeText(this, "Please Enter All Details", Toast.LENGTH_LONG).show();
                return;
            }
        }
        double total=getIntent().getDoubleExtra("k2",0);
        double totalPayable=getIntent().getDoubleExtra("k3",0);
        BookingReuest bookingReuest=new BookingReuest();
        bookingReuest.setTrailId(checkAvailibityRequest.getTrail_id());
        bookingReuest.setUserId(Integer.parseInt(converbizUser.getUserId()));
        bookingReuest.setTravelDate(checkAvailibityRequest.getCheck_in().split(" ")[0]);
        bookingReuest.setTotal(total);
        bookingReuest.setTotalPayable(totalPayable);

        bookingReuest.setDetail(list);
        final ProgressDialog progressDialog=new ProgressDialog(this);
        progressDialog.show();
        String bookingStr=bookingReuest.toString();
        restClient.bookTrail(bookingReuest, new MyEcoTripCallBack<BookingResponse>() {
            @Override
            public void onFailure(String s, ErrorCodes errorCodes) {
                progressDialog.dismiss();
            }

            @Override
            public void onSuccess(BookingResponse bookingResponse) {

                progressDialog.dismiss();
                Intent intent = new Intent(ActivitySeatDetails.this, WebViewActivity.class);
                intent.putExtra(AvenuesParams.ACCESS_CODE, getString(R.string.access_code_id));
                intent.putExtra(AvenuesParams.MERCHANT_ID, getString(R.string.merchant_user_id));
                intent.putExtra(AvenuesParams.CURRENCY, getString(R.string.currencey_id));
                intent.putExtra(AvenuesParams.REDIRECT_URL, getString(R.string.redirect_url_id));
                intent.putExtra(AvenuesParams.CANCEL_URL, getString(R.string.cancel_url_id));
                intent.putExtra(AvenuesParams.RSA_KEY_URL, getString(R.string.rsa_url_id));
                intent.putExtra(AvenuesParams.ORDER_ID,String.valueOf( bookingResponse.getContent().getOrder_id()));
                intent.putExtra(AvenuesParams.AMOUNT, "1");
                startActivity(intent);
            }
        });


    }

}
