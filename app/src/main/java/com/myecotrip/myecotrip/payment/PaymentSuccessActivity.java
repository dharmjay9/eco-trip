package com.myecotrip.myecotrip.payment;

import android.app.Activity;
import android.app.ProgressDialog;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.widget.CardView;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;

import com.myecotrip.myecotrip.R;
import com.myecotrip.myecotrip.base.BaseActivity;
import com.myecotrip.myecotrip.common.MyEcoTripUser;
import com.myecotrip.myecotrip.home.HomeActivity;
import com.myecotrip.myecotrip.network.ErrorCodes;
import com.myecotrip.myecotrip.network.MyEcoTripCallBack;
import com.myecotrip.myecotrip.network.RestClient;



public class PaymentSuccessActivity extends Activity {

    private CardView cvBooking;
    private TextView tvProgressText, tvStatus, tvBookingId, tvTotalAmount, tvTexAmount, tvBookingDte,tvTrailCount, tvTrailName;
    private TextView             tv_payment_successfully;
    private RestClient restClient;
    private ProgressBar progressBar;
    private ImageView iv_PaymentSuccessIcon;


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_payment_success);
        //llBooking = (LinearLayout) findViewById(R.id.llBooking);
        tvProgressText = (TextView) findViewById(R.id.tvProgress);
        tvStatus = (TextView) findViewById(R.id.tvStatus);
        cvBooking = (CardView) findViewById(R.id.cv_booking);
        iv_PaymentSuccessIcon = (ImageView)findViewById(R.id.iv_payment_success_icon);
        iv_PaymentSuccessIcon.setVisibility(View.VISIBLE);
        //tvBookingId = (TextView) findViewById(R.id.tvBookingId);
       tv_payment_successfully = (TextView) findViewById(R.id.tv_payment_successfully);
       // tvTexAmount = (TextView) findViewById(R.id.tvTotalTexAmount);
        //tvBookingDte = (TextView) findViewById(R.id.tvBookingDate);
        //tvTrailCount = (TextView) findViewById(R.id.tvTrailCount);
       // tvTrailName = (TextView) findViewById(R.id.tvTrailName);
        //progressBar = (ProgressBar) findViewById(R.id.progressBar);

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
//                tv_payment_successfully.setText("Something went wrong,Please check in order history");
                //cvBooking.setVisibility(View.GONE);
                 tvProgressText.setText("Something went wrong,Please check in order history");
                //tvProgressText.setText("Something went wrong,Please check in order history");
                progressBar.setVisibility(View.GONE);
            }

            @Override
            public void onSuccess(PaymentResponse paymentResponse) {

                if (paymentResponse.getContent().size() > 0) {
                    tvStatus.setText("Payment Success");
                    PaymentResponse.ContentBean details = paymentResponse.getContent().get(0);
                    //tvBookingDte.setText("Date of Booking :" + details.getDate_of_booking());
                    //tvTotalAmount.setText("Your payment of " + getResources().getString(R.string.currencey_str)+details.getAmount());
                   /* if (details.getAmount() == 0)
                        tvTotalAmount.setVisibility(View.GONE);*/
                    //tvTexAmount.setText("Your payment of:" + details.getAmountWithTax());
                    tv_payment_successfully.setText("Your payment of "+getResources().getString(R.string.currencey_str)+details.getAmount()+" was Successfully completed.");
                   // tvBookingId.setText("Booking Id :" + details.getDisplay_id());
                   /* tvStatus.setText("Order Status :" + details.getBooking_status());
                    if (details.getNumber_of_trekkers() == 0)
                        tvTrailCount.setText("No of tracker :" + details.getNumber_of_trekkers());
                    tvTrailName.setVisibility(View.GONE);
                    tvTrailName.setText("Trail Name :" + details.getTrailName());*/
                    tvProgressText.setVisibility(View.GONE);
                    cvBooking.setVisibility(View.VISIBLE);
                    //progressBar.setVisibility(View.GONE);

               // }
                //tv_payment_successfully.setText("Something went wrong,Please check in order history");
                //cvBooking.setVisibility(View.GONE);
                tvProgressText.setText("Something went wrong,Please check in order history");

                    tv_payment_successfully.setText("Your payment of "+getResources().getString(R.string.currencey_str)+details.getAmount()+" was Successfully completed.");

                   // tvProgressText.setVisibility(View.GONE);
                   // llBooking.setVisibility(View.VISIBLE);
                    progressBar.setVisibility(View.GONE);

                }
              //  tvProgressText.setText("Something went wrong,Please check in order history");

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
