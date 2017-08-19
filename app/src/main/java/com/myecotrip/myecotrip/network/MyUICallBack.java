package com.myecotrip.myecotrip.network;

/**
 * Use for callback passing data from netwotk call to UI
 */

public interface MyUICallBack<T> {

    void onSuccess(T t);

    void onFailure(ErrorCodes errorCodes);
}
