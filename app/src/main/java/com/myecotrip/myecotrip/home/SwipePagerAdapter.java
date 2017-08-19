package com.myecotrip.myecotrip.home;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Gopal kumar on 06-05-2017.
 */

public class SwipePagerAdapter extends FragmentStatePagerAdapter {

    private List<SwipeItemFragment> fragmentList;
    public SwipePagerAdapter(FragmentManager fm) {
        super(fm);
        fragmentList=new ArrayList<>();
    }

    public void addFragment(SwipeItemFragment swipeItemFragment){
        fragmentList.add(swipeItemFragment);
    }

    @Override
    public Fragment getItem(int position) {
        return fragmentList.get(position);
    }

    @Override
    public int getCount() {
        return fragmentList.size();
    }
}
