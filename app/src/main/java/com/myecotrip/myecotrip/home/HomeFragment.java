package com.myecotrip.myecotrip.home;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.view.ViewPager;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.ProgressBar;

import com.myecotrip.myecotrip.R;
import com.myecotrip.myecotrip.base.BaseFragment;
import com.myecotrip.myecotrip.customView.ViewPagerIndicator;
import com.myecotrip.myecotrip.home.fargmentHome.CategoryRowData;
import com.myecotrip.myecotrip.network.ErrorCodes;
import com.myecotrip.myecotrip.network.MyEcoTripCallBack;

/**
 * Created by Gopal kumar on 06-05-2017.
 */

public class HomeFragment extends BaseFragment {


    private ProgressBar progressBar;
    private RecyclerView rvCategory;
    private LinearLayout llContent;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_home, container, false);
        rvCategory = (RecyclerView) view.findViewById(R.id.rvParent);
        llContent=(LinearLayout)view.findViewById(R.id.llMain);
        progressBar= (ProgressBar) view.findViewById(R.id.progressBar);
        rvCategory.setNestedScrollingEnabled(false);
        rvCategory.setHasFixedSize(true);
        rvCategory.setFocusable(false);
        ViewPager viewPager = (ViewPager) view.findViewById(R.id.pager);
        ViewPagerIndicator viewPagerIndicator = (ViewPagerIndicator) view.findViewById(R.id.pagerIndicater);
        SwipePagerAdapter swipePagerAdapter = new SwipePagerAdapter(getChildFragmentManager());
        swipePagerAdapter.addFragment(SwipeItemFragment.getInstance("http://myecotrip.com/assets/img/slider/new-slider1.jpg", "Bandipur Tiger Preserve"));
        swipePagerAdapter.addFragment(SwipeItemFragment.getInstance("http://myecotrip.com/assets/img/slider/new-slider2.jpg", "Nagarahole Karnataka"));
        swipePagerAdapter.addFragment(SwipeItemFragment.getInstance("http://myecotrip.com/assets/img/slider/new-slider3.jpg", "Nagarahole Karnataka"));
        swipePagerAdapter.addFragment(SwipeItemFragment.getInstance("http://myecotrip.com/assets/img/slider/new-slider4.jpg", "Nagarahole Karnataka"));
        swipePagerAdapter.addFragment(SwipeItemFragment.getInstance("http://myecotrip.com/assets/img/slider/new-slider5.jpg", "Nagarahole Karnataka"));
        swipePagerAdapter.addFragment(SwipeItemFragment.getInstance("http://myecotrip.com/assets/img/slider/new-slider6.jpg", "Nagarahole Karnataka"));
        swipePagerAdapter.addFragment(SwipeItemFragment.getInstance("http://myecotrip.com/assets/img/slider/new-slider7.jpg", "Nagarahole Karnataka"));
        //swipePagerAdapter.addFragment(SwipeItemFragment.getInstance(R.drawable.ic_list_1, "BRT Reserve"));
        //swipePagerAdapter.addFragment(SwipeItemFragment.getInstance(R.drawable.ic_4, "BandiPur National Park"));
        //swipePagerAdapter.addFragment(SwipeItemFragment.getInstance(R.drawable.ic_1, "Kali Tiger Reserve"));
        viewPager.setAdapter(swipePagerAdapter);
        viewPagerIndicator.setPager(viewPager);
       // viewPagerIndicator.setVisibility(View.GONE);
        LinearLayoutManager gridLayoutManager = new LinearLayoutManager(getContext());
        gridLayoutManager.setOrientation(LinearLayoutManager.VERTICAL);
        rvCategory.setNestedScrollingEnabled(false);
        rvCategory.setLayoutManager(gridLayoutManager);
        getData();
        return view;
    }

    private void getData() {
        restClient.getCategory(new MyEcoTripCallBack<CategoryRowData>() {
            @Override
            public void onFailure(String s, ErrorCodes errorCodes) {

                Log.d("","");
            }

            @Override
            public void onSuccess(CategoryRowData categoryRowData) {
                progressBar.setVisibility(View.GONE);
                llContent.setVisibility(View.VISIBLE);
                HomeGridAdapter homeGridAdapter = new HomeGridAdapter(getActivity(), categoryRowData.getContent().getCategories());
                rvCategory.setAdapter(homeGridAdapter);

            }
        });
    }
}
