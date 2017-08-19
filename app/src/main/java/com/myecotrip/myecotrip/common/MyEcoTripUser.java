package com.myecotrip.myecotrip.common;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;

/**
 * Created by divum on 4/3/17.
 */

public class MyEcoTripUser {

    private static SharedPreferences sharedPreferences;
    private static MyEcoTripUser converbizUser;
    private static final String EMAIL_ID="email_id";
    private static final String USER_ID="user_id";



    public static MyEcoTripUser  getInstance(Context context) {
        if (converbizUser == null) {
            converbizUser = new MyEcoTripUser();
            sharedPreferences = PreferenceManager.getDefaultSharedPreferences(context);
        }
        return converbizUser;

    }

    public void setEmail(String email){
        putString(EMAIL_ID,email);
    }

    public String getEmailId(){
      return   sharedPreferences.getString(EMAIL_ID,"");
    }


    public void setUserId(String email){
        putString(USER_ID,email);
    }

    public String getUserId(){
        return   sharedPreferences.getString(USER_ID,"");
    }



    private void putString(String key, String value) {
        SharedPreferences.Editor editor = sharedPreferences.edit();
        editor.putString(key, value);
        editor.apply();
    }
}
