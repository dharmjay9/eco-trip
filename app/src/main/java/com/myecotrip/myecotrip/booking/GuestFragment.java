package com.myecotrip.myecotrip.booking;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.myecotrip.myecotrip.R;

/**
 * Created by Gopal kumar on 19-07-2017.
 */

public class GuestFragment extends android.support.v4.app.Fragment{


    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.guest_layout,container,false);
        return view;
    }
}
