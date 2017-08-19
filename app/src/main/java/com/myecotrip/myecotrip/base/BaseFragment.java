package com.myecotrip.myecotrip.base;

import android.app.ProgressDialog;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.text.TextUtils;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.myecotrip.myecotrip.common.MyEcoTripUser;
import com.myecotrip.myecotrip.network.RestClient;


public abstract class BaseFragment extends Fragment {

    protected RestClient mRestClient;
    protected ProgressDialog mProgressDialog;
    protected MyEcoTripUser mConverbizUser;
    protected RestClient restClient;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mRestClient=new RestClient();
        restClient=new RestClient();
        mConverbizUser=MyEcoTripUser.getInstance(getActivity());

    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return super.onCreateView(inflater, container, savedInstanceState);
    }

    protected void displayProgressDialog(){
        mProgressDialog=new ProgressDialog(getActivity());
        mProgressDialog.setMessage("Wait...");
        mProgressDialog.show();
    }

    protected void hideProgressDialog(){
        if(mProgressDialog!=null){
            mProgressDialog.dismiss();
        }
    }


}
