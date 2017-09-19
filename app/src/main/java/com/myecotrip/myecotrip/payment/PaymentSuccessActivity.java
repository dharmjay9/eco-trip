package com.myecotrip.myecotrip.payment;

import android.app.Activity;
import android.app.ProgressDialog;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
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

    private TextView             tv_payment_successfully;
    private RestClient restClient;
    private ProgressBar progressBar;


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_payment_success);
       // setupToolBar();
        tv_payment_successfully = (TextView) findViewById(R.id.tv_payment_successfully);
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
                //tvProgressText.setText("Something went wrong,Please check in order history");
                progressBar.setVisibility(View.GONE);
            }

            @Override
            public void onSuccess(PaymentResponse paymentResponse) {

                if (paymentResponse.getContent().size() > 0) {
                    PaymentResponse.ContentBean details = paymentResponse.getContent().get(0);

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
