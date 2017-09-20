package com.myecotrip.myecotrip.payment;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.myecotrip.myecotrip.R;
import com.myecotrip.myecotrip.common.CommonUtils;
import com.myecotrip.myecotrip.common.MyEcoTripUser;
import com.myecotrip.myecotrip.home.HomeActivity;
import com.myecotrip.myecotrip.network.ErrorCodes;
import com.myecotrip.myecotrip.network.MyEcoTripCallBack;
import com.myecotrip.myecotrip.network.RestClient;


public class PaymentFailureActivity extends Activity {

    private LinearLayout llBooking;
    private TextView tvProgressText, tvStatus, tvBookingId, tvTotalAmount, tvTexAmount, tvBookingDte, tvTrailCount, tvTrailName;
    RestClient restClient;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_payment_failure);
       /* llBooking = (LinearLayout) findViewById(R.id.llBooking);
        tvProgressText = (TextView) findViewById(R.id.tvProgress);
        tvStatus = (TextView) findViewById(R.id.tvProgress);*/
        tvBookingId = (TextView) findViewById(R.id.tvStatus);
        /*tvTotalAmount = (TextView) findViewById(R.id.tvTotalAmount);
        tvTexAmount = (TextView) findViewById(R.id.tvTotalTexAmount);*/
        tvBookingDte = (TextView) findViewById(R.id.tvBookingDate);
        tvTrailCount = (TextView) findViewById(R.id.tvTrailCount);
        /*tvTrailName = (TextView) findViewById(R.id.tvTrailName);*/
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
                    tvBookingDte.setText("Check in date :" + CommonUtils.getDateInFormate(details.getCheckIn()));
                    tvTotalAmount.setText("Total amount :" + getString(R.string.rupes) + details.getAmount());
                    tvTexAmount.setText("Total amount with text :" + getString(R.string.rupes) + details.getAmountWithTax());
                    tvBookingId.setText("Booking Id :" + details.getDisplay_id());
                    tvStatus.setText("Order Status :" + details.getBooking_status());
                    tvTrailCount.setText("No of tracker :" + details.getNumber_of_trekkers());
                    tvTrailName.setText("Trail Name :" + details.getTrailName());
                    tvProgressText.setVisibility(View.GONE);
                    llBooking.setVisibility(View.GONE);
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
        Intent i = new Intent(PaymentFailureActivity.this, HomeActivity.class);
        i.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP | Intent.FLAG_ACTIVITY_SINGLE_TOP);
        startActivity(i);
        finish();
    }
}


