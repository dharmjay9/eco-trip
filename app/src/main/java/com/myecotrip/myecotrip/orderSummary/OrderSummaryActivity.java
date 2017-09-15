package com.myecotrip.myecotrip.orderSummary;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.text.TextUtils;
import android.view.View;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;

import com.myecotrip.myecotrip.R;
import com.myecotrip.myecotrip.base.BaseActivity;
import com.myecotrip.myecotrip.booking.ActivitySeatDetails;
import com.myecotrip.myecotrip.booking.rowData.AvailableSeatResponse;
import com.myecotrip.myecotrip.booking.rowData.CheckAvailibityRequest;
import com.myecotrip.myecotrip.booking.rowData.CheckVaibilityResponse;
import com.myecotrip.myecotrip.common.MyEcoTripUser;
import com.myecotrip.myecotrip.login.LoginActivity;
import com.myecotrip.myecotrip.login.LoginRequest;
import com.myecotrip.myecotrip.network.ErrorCodes;
import com.myecotrip.myecotrip.network.MyEcoTripCallBack;
import com.myecotrip.myecotrip.payment.Utility.AvenuesParams;
import com.myecotrip.myecotrip.payment.Utility.ServiceUtility;
import com.myecotrip.myecotrip.payment.WebViewActivity;
import com.myecotrip.myecotrip.utils.Utils;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Gopal kumar on 27-07-2017.
 */

public class OrderSummaryActivity extends BaseActivity {

    public static final String TRAIL_REQUEST = "trail_request";
    public static final String TRAIL_DETAILS = "trail_details";
    private RelativeLayout rvMain;
    private ProgressBar progressBar;
    private RecyclerView rv;
    private String trilId;
    private String campId;
    private CheckAvailibityRequest request;
    private int totalGuest;
    private int total;
    private int totalPaybable;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        request = getIntent().getParcelableExtra(TRAIL_REQUEST);
        setOrderDetails();

    }

    @Override
    protected void initView() {
        setContentView(R.layout.activity_order_summary);
        rvMain = (RelativeLayout) findViewById(R.id.rlMain);
        progressBar = (ProgressBar) findViewById(R.id.progressBar);
        rv = (RecyclerView) findViewById(R.id.rvCommon);
        rv.setLayoutManager(new LinearLayoutManager(this));

        findViewById(R.id.btnBookNow).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               if (TextUtils.isEmpty(converbizUser.getUserId())) {
                    Intent intent = new Intent(OrderSummaryActivity.this, LoginActivity.class);
                    intent.putExtra("k1", request);
                    intent.putExtra("count", totalGuest);
                    startActivityForResult(intent, 2);
                } else {

                    goToSeatDeatialPage();

                }
            }
        });
        setupToolBar();

    }

    private void goToSeatDeatialPage() {
        Intent intent = new Intent(OrderSummaryActivity.this, ActivitySeatDetails.class);
        intent.putExtra("k1", request);
        intent.putExtra("count", totalGuest);
        intent.putExtra("k2", total);
        intent.putExtra("k3", totalPaybable);
        startActivity(intent);
    }

    private void setupToolBar() {
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        toolbar.setTitle("Order Details");
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
    }

    private void setOrderDetails() {
        AvailableSeatResponse contentBean = getIntent().getParcelableExtra(TRAIL_DETAILS);
        AvailableSeatResponse.ContentBean content = contentBean.getContent();
        List<OrderSummaryData> list = new ArrayList<OrderSummaryData>();
        // list.add(new OrderSummaryData("Camp Name ",content.getCamp()));
        list.add(new OrderSummaryData("Trail Name ", content.getTrailName()));
        list.add(new OrderSummaryData("Check in", Utils.getDateInFormate(content.getTravelDate())));
        list.add(new OrderSummaryData("No of trekkers", String.valueOf(request.getGuest_no())));
        totalGuest = request.getGuest_no();
        list.add(new OrderSummaryData("Price per trekker",getResources().getString(R.string.currencey_str)+ String.valueOf(content.getPricePerPerson())));

        list.add(new OrderSummaryData("Total price",getResources().getString(R.string.currencey_str)+ String.valueOf(content.getTotal())));
        list.add(new OrderSummaryData("Service Charge",getResources().getString(R.string.currencey_str)+ String.valueOf(content.getServiceCharges())));

        double totalTripAmmount=(content.getTotal()+content.getServiceCharges());
        list.add(new OrderSummaryData("Total trip",getResources().getString(R.string.currencey_str)+ String.valueOf(totalTripAmmount)));

        OrderSummaryAdapter orderSummaryAdapter = new OrderSummaryAdapter(OrderSummaryActivity.this, list);
        rv.setAdapter(orderSummaryAdapter);
        rvMain.setVisibility(View.VISIBLE);
        progressBar.setVisibility(View.GONE);
        total = content.getTotal();
        totalPaybable = (int) content.getTotalPayable();
    }

    private void getData() {
        restClient.getAvibality(request, new MyEcoTripCallBack<CheckVaibilityResponse>() {
            @Override
            public void onFailure(String s, ErrorCodes errorCodes) {

            }

            @Override
            public void onSuccess(CheckVaibilityResponse checkVaibilityResponse) {

                CheckVaibilityResponse.ContentBean.BookingBean content = checkVaibilityResponse.getContent().getBooking();
                List<OrderSummaryData> list = new ArrayList<OrderSummaryData>();
                list.add(new OrderSummaryData("Camp Name ", content.getCamp()));
                list.add(new OrderSummaryData("Trail Name ", content.getTrail()));
                list.add(new OrderSummaryData("Booking Date", content.getCheck_in().split(" ")[0]));
                list.add(new OrderSummaryData("No of Guest", String.valueOf(request.getGuest_no())));
                totalGuest = request.getGuest_no();
                list.add(new OrderSummaryData("Price for one Guest", content.getPrice_per_guest()));
                list.add(new OrderSummaryData("Total Price", String.valueOf(content.getTotal_price())));
                OrderSummaryAdapter orderSummaryAdapter = new OrderSummaryAdapter(OrderSummaryActivity.this, list);
                rv.setAdapter(orderSummaryAdapter);
                rvMain.setVisibility(View.VISIBLE);
                progressBar.setVisibility(View.GONE);

            }
        });
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        // check if the request code is same as what is passed  here it is 2
        if (requestCode == 2) {
            if (!TextUtils.isEmpty(converbizUser.getUserId()))
                goToSeatDeatialPage();
        }
    }
}
