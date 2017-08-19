package com.myecotrip.myecotrip.details.ecoTrail;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.view.ViewPager;
import android.support.v4.widget.NestedScrollView;
import android.support.v7.widget.Toolbar;
import android.text.Html;
import android.view.View;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.TextView;

import com.myecotrip.myecotrip.R;
import com.myecotrip.myecotrip.base.BaseActivity;
import com.myecotrip.myecotrip.booking.BookingActivity;
import com.myecotrip.myecotrip.booking.rowData.CheckAvailibityRequest;
import com.myecotrip.myecotrip.customView.ViewPagerIndicator;
import com.myecotrip.myecotrip.home.SwipeItemFragment;
import com.myecotrip.myecotrip.home.SwipePagerAdapter;
import com.myecotrip.myecotrip.network.ErrorCodes;
import com.myecotrip.myecotrip.network.MyEcoTripCallBack;
import com.myecotrip.myecotrip.orderSummary.OrderSummaryActivity;

/**
 * Created by Gopal kumar on 19-07-2017.
 */

public class TrailDetailsActivity extends BaseActivity {

    private TextView tvTitle, tvDesc, tvDistance, tvTime, tvWhen, tvTrailType;
    private int trailId;
    private String campId;
    private NestedScrollView svMain;
    private ProgressBar progressBar;
    private Button btnSubmit;
    TrailListingRowData.ContentBean trailsBean1;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        trailsBean1 = getIntent().getParcelableExtra("k");
        campId = getIntent().getStringExtra("k1");
        trailId = trailsBean1.getId();
        setupToolBar(trailsBean1.getName());
        svMain = (NestedScrollView) findViewById(R.id.svMain);
        progressBar = (ProgressBar) findViewById(R.id.progressBar);
        getTrailDetails(String.valueOf(trailId));

    }

    @Override
    protected void initView() {

        setContentView(R.layout.activity_trails);
        tvTitle = (TextView) findViewById(R.id.tvTitle);
        tvDesc = (TextView) findViewById(R.id.tvDescription);
        tvDistance = (TextView) findViewById(R.id.tvDistance);
        tvTime = (TextView) findViewById(R.id.tvTime);
        tvWhen = (TextView) findViewById(R.id.tvWhenToVisit);
        tvTrailType = (TextView) findViewById(R.id.tvTrailType);
        btnSubmit = (Button) findViewById(R.id.btnBookNow);
        btnSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(TrailDetailsActivity.this, BookingActivity.class);
                CheckAvailibityRequest checkAvailibityRequest = new CheckAvailibityRequest();
              //  checkAvailibityRequest.setCamp_id(Integer.parseInt(campId));
                checkAvailibityRequest.setTrail_id(trailId);
                intent.putExtra(OrderSummaryActivity.TRAIL_REQUEST, checkAvailibityRequest);
                startActivity(intent);
            }
        });
    }

    private void setupToolBar(String title) {
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        toolbar.setTitle(title);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
    }

    private void getTrailDetails(String id) {

        restClient.getTrailDetails(id, new MyEcoTripCallBack<TrailDetailsResponse>() {
            @Override
            public void onFailure(String s, ErrorCodes errorCodes) {

            }

            @Override
            public void onSuccess(TrailDetailsResponse trailDetailsResponse) {

                progressBar.setVisibility(View.GONE);
                svMain.setVisibility(View.VISIBLE);
                btnSubmit.setVisibility(View.VISIBLE);
                setData(trailDetailsResponse);
            }
        });
    }

    private void setData(TrailDetailsResponse trailDetailsResponse) {
        TrailDetailsResponse.ContentBean trailsBean = trailDetailsResponse.getContent();
        tvTitle.setText(trailsBean.getName());
        tvDesc.setText(Html.fromHtml(trailsBean.getDescription()));
        tvTime.setText("Time Taken : " + trailsBean.getHours() + ":" + trailsBean.getMinutes());
        tvDistance.setText("Distance : " + trailsBean.getDistance());
        tvTrailType.setText(trailsBean1.getType());
        tvWhen.setText(Html.fromHtml(trailsBean.getWhen_to_visit()));
        ViewPagerIndicator viewPagerIndicator = (ViewPagerIndicator) findViewById(R.id.pagerIndicater);
        SwipePagerAdapter swipePagerAdapter = new SwipePagerAdapter(getSupportFragmentManager());
        for (TrailDetailsResponse.ContentBean.TrailImagesBean trailBean : trailsBean.getTrailImages()) {
            swipePagerAdapter.addFragment(SwipeItemFragment.getInstance(trailBean.getName(), ""));
        }
        ViewPager viewPager = (ViewPager) findViewById(R.id.pager);
        viewPager.setAdapter(swipePagerAdapter);
        viewPagerIndicator.setPager(viewPager);
    }

}
