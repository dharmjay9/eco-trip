package com.divum.mylibrary;

import android.view.ViewOutlineProvider;


public interface PermissionCallBack {

    void permissionApproved(String ... permissions);

    void permissionDenied(String ... permissionName);

    void permissionNotInManifest(String ... permissionName);

    void onError(ErrorCode errorCode);


}
