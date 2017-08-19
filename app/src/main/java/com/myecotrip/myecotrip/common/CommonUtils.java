package com.myecotrip.myecotrip.common;

/**
 * Created by Gopal kumar on 04-06-2017.
 */

public class CommonUtils {

    public static String getImageUrl(String subUrl){
        return IConstant.BASE_URL+subUrl;
    }

    public static String getEcoTrailBaseUrl(String subUrl){
        subUrl=subUrl.trim();
        return IConstant.BASE_URL+"/public/images/ecotrails/"+subUrl;//.substring(0,subUrl.length()-4);
    }
}
