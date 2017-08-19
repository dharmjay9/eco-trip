package com.myecotrip.myecotrip.payment;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;

import com.myecotrip.myecotrip.R;
import com.myecotrip.myecotrip.home.HomeActivity;

/**
 * Created by Gopal kumar on 18-08-2017.
 */

public class PaymentSuccessActivity extends Activity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_payment_success);
        findViewById(R.id.tvContinue).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(PaymentSuccessActivity.this, HomeActivity.class);

                i.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP | Intent.FLAG_ACTIVITY_SINGLE_TOP);
                startActivity(i);
                finish();
            }
        });
    }
}
