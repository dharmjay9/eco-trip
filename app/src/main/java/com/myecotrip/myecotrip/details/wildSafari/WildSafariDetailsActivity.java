package com.myecotrip.myecotrip.details.wildSafari;

import android.os.Build;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.CoordinatorLayout;
import android.support.v7.widget.RecyclerView;
import android.text.Html;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;

import com.myecotrip.myecotrip.R;
import com.myecotrip.myecotrip.base.BaseActivity;
import com.myecotrip.myecotrip.common.CommonUtils;
import com.myecotrip.myecotrip.details.CommonDetailsRequest;
import com.myecotrip.myecotrip.details.birdSanactury.BirdSanacturyDetailsActivity;
import com.myecotrip.myecotrip.details.birdSanactury.BirdSanacturyResponse;
import com.myecotrip.myecotrip.details.birdSanactury.SanacturyActivityAdapter;
import com.myecotrip.myecotrip.network.ErrorCodes;
import com.myecotrip.myecotrip.network.MyEcoTripCallBack;
import com.squareup.picasso.Picasso;

/**
 * Created by Gopal kumar on 15-07-2017.
 */

public class WildSafariDetailsActivity extends BaseActivity{
    public static final String WILD_ID = "id";
    private TextView tvInclude,tvExclude;
    private ImageView mIvDetails;
    private TextView tvDetails;
    private TextView trailTitle;
    private TextView tvTitle;
    private ProgressBar progressBar;
    private CoordinatorLayout mainLayout;
    private RecyclerView rvTrailList;


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        String id = getIntent().getStringExtra(WILD_ID);
        CommonDetailsRequest commonDetailsRequest = new CommonDetailsRequest();
        commonDetailsRequest.setSafari_id(id);
        restClient.getWildLifeSafai(commonDetailsRequest, new MyEcoTripCallBack<WildsafariResponse>() {
            @Override
            public void onFailure(String s, ErrorCodes errorCodes) {

                Log.d("", "");
            }

            @Override
            public void onSuccess(WildsafariResponse ecoDetailsResponse) {

                WildsafariResponse.ContentBean.SafariBean ecoTrailRowdata = ecoDetailsResponse.getContent().getSafari().get(0);
                if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.N) {
                    tvDetails.setText(Html.fromHtml(ecoTrailRowdata.getSafari_description(), Html.FROM_HTML_MODE_COMPACT));
                } else {
                    tvDetails.setText(Html.fromHtml(ecoTrailRowdata.getSafari_description()));
                }
                tvTitle.setText(ecoTrailRowdata.getSafari_name());
               // SanacturyActivityAdapter ecoTrailDetailsAdapter = new SanacturyActivityAdapter(ecoDetailsResponse.getContent().getActivities(), WildSafariDetailsActivity.this);
               // rvTrailList.setNestedScrollingEnabled(false);
               // rvTrailList.setAdapter(ecoTrailDetailsAdapter);
                //trailTitle.setText("Activities Offered");
                progressBar.setVisibility(View.GONE);
                tvExclude.setText(Html.fromHtml(ecoTrailRowdata.getSafari_excludes()));
                tvInclude.setText(Html.fromHtml(ecoTrailRowdata.getSafari_includes()));
                // mainLayout.setVisibility(View.VISIBLE);
              //  Picasso.with(WildSafariDetailsActivity.this).load(CommonUtils.getImageUrl((ecoTrailRowdata.ge))).into(mIvDetails);
            }
        });

    }

    @Override
    protected void initView() {
        setContentView(R.layout.activity_safari_details);
        mIvDetails = (ImageView) findViewById(R.id.ivDetails);
        tvDetails = (TextView) findViewById(R.id.tvDesc);
        trailTitle = (TextView) findViewById(R.id.tvTrailTitle);
        tvTitle = (TextView) findViewById(R.id.tvTitle);
        tvInclude=(TextView)findViewById(R.id.tvInclude);
        tvExclude=(TextView)findViewById(R.id.tvExclude);
        rvTrailList = (RecyclerView) findViewById(R.id.rvTrails);
        progressBar = (ProgressBar) findViewById(R.id.progressBar);
        mainLayout = (CoordinatorLayout) findViewById(R.id.mainLayout);
        final TextView btShowmore = (TextView) findViewById(R.id.tvViewMore);
        btShowmore.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (btShowmore.getText().toString().equalsIgnoreCase("Showmore...")) {
                    tvDetails.setMaxLines(Integer.MAX_VALUE);//your TextView
                    btShowmore.setText("Showless");
                } else {
                    tvDetails.setMaxLines(4);//your TextView
                    btShowmore.setText("Showmore...");
                }
            }
        });
    }
}
