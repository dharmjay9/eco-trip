package com.myecotrip.myecotrip.utils;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;


public class Utils {

    public static String getDateInFormate(String dateStr){

        SimpleDateFormat fmt = new SimpleDateFormat("dd MM yyyy", Locale.ENGLISH);

        //SimpleDateFormat fmt = new SimpleDateFormat("EEE MMM dd hh:mm:ss yyyy");

        try {
            Date date = fmt.parse(dateStr);
            return fmt.format(date);
        }
        catch(ParseException pe) {
            return dateStr.split(" ")[0];
        }

    }
}
