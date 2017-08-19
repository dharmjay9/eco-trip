package com.divum.mylibrary;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.content.ContextCompat;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;


public class PermissionFragment extends Fragment {

    private PermissionCallBack mPermissionCallBack;
    private static final int REQUEST_FOR_PERMISSION = 3;
    private String[] mDefinedPermission;


    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setRetainInstance(true);
        setPermission();
    }


    public void requestForPermission(PermissionCallBack permissionCallBack, String... permissions) {
        mPermissionCallBack = permissionCallBack;
        List<String> permissionList = new ArrayList<>();
        List<String> permissionNotDefine = new ArrayList<>();
        for (String permission : permissions) {
            if (!isPermissionGRanted(permission)) {
                permissionList.add(permission);
            }
            if (permissionNotDefine(permission)) {
                permissionNotDefine.add(permission);
            }
        }
        if (permissionNotDefine.size() != 0)
            mPermissionCallBack.permissionNotInManifest(permissionNotDefine.toArray(new String[permissionList.size()]));
        if (permissionList.size() == 0) {
            mPermissionCallBack.onError(ErrorCode.ALL_PERMISSION_ARE_GRANTED);
            return;
        }
        requestPermissions((permissionList.toArray(new String[permissionList.size()])), REQUEST_FOR_PERMISSION);
    }

    @Override
    public void onRequestPermissionsResult(int requestCode, @NonNull String[] permissions, @NonNull int[] grantResults) {
        super.onRequestPermissionsResult(requestCode, permissions, grantResults);
        if (requestCode == REQUEST_FOR_PERMISSION) {

            List<String> approvedList = new ArrayList<>();
            List<String> deniedList = new ArrayList<>();
            for (int i = 0; i < grantResults.length; i++) {
                if (grantResults[i] == PackageManager.PERMISSION_GRANTED)
                    approvedList.add(permissions[i]);
                else deniedList.add(permissions[i]);
            }
            mPermissionCallBack.permissionDenied(deniedList.toArray(new String[deniedList.size()]));
            mPermissionCallBack.permissionApproved(approvedList.toArray(new String[approvedList.size()]));
        }
    }

    public boolean isPermissionGRanted(String permissionsName) {
        return PackageManager.PERMISSION_GRANTED == ContextCompat.checkSelfPermission(getActivity(), permissionsName) ? true : false;
    }


    private void setPermission() {
        try {
            PackageInfo info = getActivity().getPackageManager().getPackageInfo(getActivity().getPackageName(), PackageManager.GET_PERMISSIONS);
            if (info.requestedPermissions != null) {
                mDefinedPermission = info.requestedPermissions;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private boolean permissionNotDefine(String permissionName) {
        for (String permission : mDefinedPermission) {

            if (permissionName.equals(permission)) return false;

        }
        return true;
    }

}
