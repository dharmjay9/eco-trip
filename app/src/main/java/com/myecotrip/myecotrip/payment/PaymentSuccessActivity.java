package com.myecotrip.myecotrip.payment;

import android.app.Activity;
import android.app.ProgressDialog;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;

import com.myecotrip.myecotrip.R;
import com.myecotrip.myecotrip.common.MyEcoTripUser;
import com.myecotrip.myecotrip.home.HomeActivity;
import com.myecotrip.myecotrip.network.ErrorCodes;
import com.myecotrip.myecotrip.network.MyEcoTripCallBack;
import com.myecotrip.myecotrip.network.RestClient;

/**
 * Created by Gopal kumar on 18-08-2017.
 */

public class PaymentSuccessActivity extends Activity {

    private LinearLayout llBooking;
    private TextView tvProgressText, tvStatus, tvBookingId, tvTotalAmount, tvTexAmount, tvBookingDte, tvTrailCount, tvTrailName;
    private RestClient restClient;
    private ProgressBar progressBar;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_payment_success);
        llBooking = (LinearLayout) findViewById(R.id.llBooking);
        tvProgressText = (TextView) findViewById(R.id.tvProgress);
        tvStatus = (TextView) findViewById(R.id.tvStatus);
        tvBookingId = (TextView) findViewById(R.id.tvBookingId);
        tvTotalAmount = (TextView) findViewById(R.id.tvTotalAmount);
        tvTexAmount = (TextView) findViewById(R.id.tvTotalTexAmount);
        tvBookingDte = (TextView) findViewById(R.id.tvBookingDate);
        tvTrailCount = (TextView) findViewById(R.id.tvTrailCount);
        tvTrailName = (TextView) findViewById(R.id.tvTrailName);
        progressBar = (ProgressBar) findViewById(R.id.progressBar);
        findViewById(R.id.tvContinue).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                goBack();
            }
        });
        restClient = new RestClient();
        restClient.getPaymentStatus(MyEcoTripUser.getInstance(this).gerOrderId(), new MyEcoTripCallBack<PaymentResponse>() {
            @Override
            public void onFailure(String s, ErrorCodes errorCodes) {
                tvProgressText.setText("Something went wrong,Please check in order history");
            }

            @Override
            public void onSuccess(PaymentResponse paymentResponse) {

                if (paymentResponse.getContent().size() > 0) {
                    PaymentResponse.ContentBean details = paymentResponse.getContent().get(0);
                    //tvBookingDte.setText("Date of Booking :" + details.getDate_of_booking());
                    tvTotalAmount.setText("Your payment of " + getResources().getString(R.string.currencey_str)+details.getAmount());
                   /* if (details.getAmount() == 0)
                        tvTotalAmount.setVisibility(View.GONE);*/
                    //tvTexAmount.setText("Your payment of:" + details.getAmountWithTax());

                   // tvBookingId.setText("Booking Id :" + details.getDisplay_id());
                   /* tvStatus.setText("Order Status :" + details.getBooking_status());
                    if (details.getNumber_of_trekkers() == 0)
                        tvTrailCount.setText("No of tracker :" + details.getNumber_of_trekkers());
                    tvTrailName.setVisibility(View.GONE);
                    tvTrailName.setText("Trail Name :" + details.getTrailName());*/
                    tvProgressText.setVisibility(View.GONE);
                    llBooking.setVisibility(View.VISIBLE);
                    progressBar.setVisibility(View.GONE);

                }
                tvProgressText.setText("Something went wrong,Please check in order history");

            }
        });
    }

    @Override
    public void onBackPressed() {
        goBack();
    }

    private void goBack() {
        Intent i = new Intent(PaymentSuccessActivity.this, HomeActivity.class);
        i.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP | Intent.FLAG_ACTIVITY_SINGLE_TOP);
        startActivity(i);
        finish();
    }
}
