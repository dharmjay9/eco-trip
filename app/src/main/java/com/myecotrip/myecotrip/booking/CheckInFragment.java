package com.myecotrip.myecotrip.booking;

import android.content.Context;
import android.icu.util.DateInterval;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CalendarView;
import android.widget.Toast;

import com.myecotrip.myecotrip.R;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * Created by Gopal kumar on 19-07-2017.
 */

public class CheckInFragment extends Fragment {
    private CalendarView calendar;
    private int date;
    private int myMonth;
    private int MyYear;
    private CommunicationInterface communicationInterface;

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        communicationInterface = (CommunicationInterface) context;
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.check_in_layout, container, false);
        calendar = (CalendarView) view.findViewById(R.id.calendar);
        inislizeCalendar();
        return view;
    }

    public void inislizeCalendar() {

        calendar.setMinDate(System.currentTimeMillis());
        calendar.setOnDateChangeListener(new CalendarView.OnDateChangeListener() {
            @Override
            public void onSelectedDayChange(@NonNull CalendarView view, int year, int month, int dayOfMonth) {
                DateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
                String selectedValue = df.format(view.getDate());
                communicationInterface.setDate(selectedValue);
                communicationInterface.callNextPage();

                //

            }
        });


    }
}
