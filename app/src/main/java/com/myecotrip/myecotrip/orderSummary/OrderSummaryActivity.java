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
import android.widget.TextView;

import com.myecotrip.myecotrip.R;
import com.myecotrip.myecotrip.base.BaseActivity;
import com.myecotrip.myecotrip.booking.ActivitySeatDetails;
import com.myecotrip.myecotrip.booking.rowData.AvailableSeatBokingResponse;
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


public class OrderSummaryActivity extends BaseActivity {

    public static final String TRAIL_REQUEST = "trail_request";
    public static final String TRAIL_DETAILS = "trail_details";
    private RelativeLayout rvMain;
    private ProgressBar progressBar;
    // private RecyclerView rv;
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
        Toolbar toolbar = (Toolbar) findViewById(R.id.order_summary_toolbar);
        toolbar.setTitle("Order Details");
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
    }

    private void setOrderDetails() {
        AvailableSeatBokingResponse contentBean = getIntent().getParcelableExtra(TRAIL_DETAILS);
        AvailableSeatBokingResponse.ContentBean content = contentBean.getContent();
        TextView tv_heder_title = (TextView) findViewById(R.id.tv_heder_title);
        TextView tv_booked_tickets_count = (TextView) findViewById(R.id.tv_booked_tickets_count);
        TextView tv_check_in_time = (TextView) findViewById(R.id.tv_check_in_time);

        TextView tv_price_value = (TextView) findViewById(R.id.tv_price_value);
        TextView tv_total_price_value = (TextView) findViewById(R.id.tv_total_price_value);
        TextView tv_service_charge_amaount = (TextView) findViewById(R.id.tv_service_charge_amaount);
        TextView tv_total_trip_amount = (TextView) findViewById(R.id.tv_total_trip_amount);

        double totalTripAmmount = (content.getBillDetails().get(0).getValue() + content.getBillDetails().get(1).getValue());

        tv_heder_title.setText(content.getTrailName());
        tv_check_in_time.setText(Utils.getDateInFormate(content.getTravelDate()));
        tv_booked_tickets_count.setText(String.valueOf(request.getGuest_no()));

        tv_price_value.setText(getResources().getString(R.string.currencey_str) + String.valueOf(content.getPricePerPerson()));
        tv_total_price_value.setText(getResources().getString(R.string.currencey_str) + String.valueOf(content.getBillDetails().get(0).getValue()));
        tv_service_charge_amaount.setText(getResources().getString(R.string.currencey_str) + String.valueOf(content.getBillDetails().get(1).getValue()));
        tv_total_trip_amount.setText(getResources().getString(R.string.currencey_str) + String.valueOf(totalTripAmmount));


     /*  List<OrderSummaryData> list = new ArrayList<OrderSummaryData>();


        list.add(new OrderSummaryData("Price per trekker",));

        list.add(new OrderSummaryData("Total price",));
        list.add(new OrderSummaryData("Service Charge",));


        //list.add(new OrderSummaryData("Total trip",));

        OrderSummaryAdapter orderSummaryAdapter = new OrderSummaryAdapter(OrderSummaryActivity.this, list);*/
        //  rv.setAdapter(orderSummaryAdapter);
        // rvMain.setVisibility(View.VISIBLE);
        progressBar.setVisibility(View.GONE);

        //total = content.getTotal();
        // totalPaybable = (int) content.getTotalPayable();
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
                /*list.add(new OrderSummaryData("Camp Name ", content.getCamp()));
                list.add(new OrderSummaryData("Trail Name ", content.getTrail()));
                list.add(new OrderSummaryData("Booking Date", content.getCheck_in().split(" ")[0]));
                list.add(new OrderSummaryData("No of Guest", String.valueOf(request.getGuest_no())));
                totalGuest = request.getGuest_no();
                list.add(new OrderSummaryData("Price for one Guest", content.getPrice_per_guest()));
                list.add(new OrderSummaryData("Total Price", String.valueOf(content.getTotal_price())));
                OrderSummaryAdapter orderSummaryAdapter = new OrderSummaryAdapter(OrderSummaryActivity.this, list);
                rv.setAdapter(orderSummaryAdapter);
                rvMain.setVisibility(View.VISIBLE);
                progressBar.setVisibility(View.GONE);*/

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
