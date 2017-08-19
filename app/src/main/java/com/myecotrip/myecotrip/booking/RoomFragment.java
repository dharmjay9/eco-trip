package com.myecotrip.myecotrip.booking;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.NumberPicker;

import com.myecotrip.myecotrip.R;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Gopal kumar on 19-07-2017.
 */

public class RoomFragment extends Fragment {
    private ViewPager viewPager;
    private TabLayout tabLayout;
    private CommunicationInterface communicationInterface;

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        communicationInterface= (CommunicationInterface) context;
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fargment_select_seat,container,false);
        NumberPicker np = (NumberPicker)view.findViewById(R.id.np);

        //Set TextView text color
        //tv.setTextColor(Color.parseColor("#ffd32b3b"));

        //Populate NumberPicker values from minimum and maximum value range
        //Set the minimum value of NumberPicker
        np.setMinValue(0);
        //Specify the maximum value/number of NumberPicker
        np.setMaxValue(50);

        //Gets whether the selector wheel wraps when reaching the min/max value.
        np.setWrapSelectorWheel(true);

        //Set a value change listener for NumberPicker
        np.setOnValueChangedListener(new NumberPicker.OnValueChangeListener() {
            @Override
            public void onValueChange(NumberPicker picker, int oldVal, int newVal){
                //Display the newly selected number from picker
               // tv.setText("Selected Number : " + newVal);
                communicationInterface.setRoomDetails(newVal);
            }
        });
        return view;
    }

}
