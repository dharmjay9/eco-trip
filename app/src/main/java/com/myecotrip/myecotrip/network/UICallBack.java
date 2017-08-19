package com.myecotrip.myecotrip.network;


import com.myecotrip.myecotrip.base.CommonModel;

/**
 * Use for callback passing data from netwotk call to UI
 */

public interface UICallBack<T extends CommonModel> {

    void onSuccess(T t);

    void onFailure(ErrorCodes errorCodes);
}
