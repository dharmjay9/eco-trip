package com.myecotrip.myecotrip.home.fargmentHome;

import com.myecotrip.myecotrip.R;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Gopal kumar on 03-06-2017.
 */

public class FragmentHomeRowData {

    private String title;
    private int imageId;


    public FragmentHomeRowData(String title, int imageId) {
        this.title = title;
        this.imageId = imageId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getImageId() {
        return imageId;
    }

    public static List<FragmentHomeRowData> fragmentHomeRowDataList(){
        List<FragmentHomeRowData> list=new ArrayList<>();
        list.add(new FragmentHomeRowData("Ecotrails", R.drawable.ic_1));
        list.add(new FragmentHomeRowData("Bird Sanctuary",R.drawable.ic_2));
        list.add(new FragmentHomeRowData("Wild Life Safari",R.drawable.ic_3));
        list.add(new FragmentHomeRowData("Jungle Stay",R.drawable.ic_5));
        return list;
    }

    public void setImageId(int imageId) {
        this.imageId = imageId;
    }
}
