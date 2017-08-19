package com.myecotrip.myecotrip;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.text.TextUtils;
import android.view.Window;

import com.myecotrip.myecotrip.base.BaseActivity;
import com.myecotrip.myecotrip.common.MyEcoTripUser;
import com.myecotrip.myecotrip.home.HomeActivity;
import com.myecotrip.myecotrip.login.LoginActivity;

/**
 * Created by Gopal kumar on 18-04-2017.
 */

public class SplashActivity extends Activity{



    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        final MyEcoTripUser converbizUser = MyEcoTripUser.getInstance(this);
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                startActivity(new Intent(SplashActivity.this, HomeActivity.class));
                finish();

            }
        },3000);
    }
}
