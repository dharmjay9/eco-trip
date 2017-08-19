package com.myecotrip.myecotrip.common;

import android.app.Application;

import com.myecotrip.myecotrip.R;

import uk.co.chrisjenx.calligraphy.CalligraphyConfig;

/**
 * Created by Gopal kumar on 26-07-2017.
 */

public class MyEcoTripApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        CalligraphyConfig.initDefault(new CalligraphyConfig.Builder()
                .setDefaultFontPath("fonts/Roboto-Medium.ttf")
                .setFontAttrId(R.attr.fontPath)
                .build()
        );
        //....
    }
}
