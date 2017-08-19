package com.myecotrip.myecotrip.network;


import com.myecotrip.myecotrip.base.CommonModel;

/**
 * Call UI thread after getting Data
 */

public abstract class MyEcoTripCallBack<T extends CommonModel> implements UICallBack<T> {

    public abstract void onFailure(String s, ErrorCodes errorCodes);

    @Override
    public final void onFailure(ErrorCodes errorCodes) {
        onFailure("", errorCodes);
    }
}
