package com.myecotrip.myecotrip.orderSummary;

/**
 * Created by Gopal kumar on 27-07-2017.
 */

public class OrderSummaryData {

    private String title;
    private String subTitle;


    public OrderSummaryData(String title, String subTitle) {
        this.title = title;
        this.subTitle = subTitle;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getSubTitle() {
        return subTitle;
    }

    public void setSubTitle(String subTitle) {
        this.subTitle = subTitle;
    }
}
