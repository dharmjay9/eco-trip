package com.myecotrip.myecotrip.common;

import android.app.Application;
import android.content.Context;
import android.support.multidex.MultiDex;
import android.support.multidex.MultiDexApplication;

import com.myecotrip.myecotrip.R;

import uk.co.chrisjenx.calligraphy.CalligraphyConfig;


public class MyEcoTripApplication extends MultiDexApplication {
    private static Context context;
    private static MyEcoTripApplication mtEcoTrippp;
    @Override
    public void onCreate() {
        super.onCreate();
        CalligraphyConfig.initDefault(new CalligraphyConfig.Builder()
                .setDefaultFontPath("fonts/PFBeauSansPro-Regular.ttf")
                .setFontAttrId(R.attr.fontPath)
                .build()
        );
        context = this;
        mtEcoTrippp= this;
        //....
    }

    public static Context getAppContext() {
        return context;
    }

    public static MyEcoTripApplication getMyEcoTripApp() {
        return mtEcoTrippp;
    }
    @Override
    protected void attachBaseContext(Context base) {
        MultiDex.install(this);
        super.attachBaseContext(base);
    }
    @Override
    public void onTerminate() {
        super.onTerminate();
    }
}
