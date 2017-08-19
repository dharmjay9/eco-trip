package com.myecotrip.myecotrip.details.ecoTrail;

import android.os.Build;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.CoordinatorLayout;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
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
import com.myecotrip.myecotrip.network.ErrorCodes;
import com.myecotrip.myecotrip.network.MyEcoTripCallBack;
import com.squareup.picasso.Picasso;

/**
 * Created by Gopal kumar on 15-07-2017.
 */

public class EcotrailsDetailsActivity extends BaseActivity {

    public static final String ECOTRAIL_ID = "ecotrail_id";
    private ImageView mIvDetails;
    private TextView tvDetails;
    private TextView trailTitle;
    private TextView tvTitle;
    private ProgressBar progressBar;
    private CoordinatorLayout mainLayout;
    private RecyclerView rvTrailList;
    private String id;


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        id = getIntent().getStringExtra(ECOTRAIL_ID);
        CommonDetailsRequest commonDetailsRequest = new CommonDetailsRequest();
        commonDetailsRequest.setCamp_id(id);
        restClient.getEcoTrailDetails(commonDetailsRequest, new MyEcoTripCallBack<EcoDetailsResponse>() {
            @Override
            public void onFailure(String s, ErrorCodes errorCodes) {

                Log.d("", "");
            }

            @Override
            public void onSuccess(EcoDetailsResponse ecoDetailsResponse) {

                EcoDetailsResponse.ContentBean.EcotrailsBean ecoTrailRowdata = ecoDetailsResponse.getContent().getEcotrails().get(0);
                if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.N) {
                    tvDetails.setText(Html.fromHtml(ecoTrailRowdata.getCamp_description(), Html.FROM_HTML_MODE_COMPACT));
                } else {
                    tvDetails.setText(Html.fromHtml(ecoTrailRowdata.getCamp_description()));
                }
                tvTitle.setText(ecoTrailRowdata.getCamp_name());
               // EcoTrailDetailsAdapter ecoTrailDetailsAdapter = new EcoTrailDetailsAdapter(id,ecoDetailsResponse.getContent().getTrails(), EcotrailsDetailsActivity.this);
                rvTrailList.setNestedScrollingEnabled(false);
              //  rvTrailList.setAdapter(ecoTrailDetailsAdapter);
                trailTitle.setText(ecoTrailRowdata.getCamp_name() + " Offers " + ecoDetailsResponse.getContent().getTrails().size() + " Trails");
                progressBar.setVisibility(View.GONE);
                mainLayout.setVisibility(View.VISIBLE);
                Picasso.with(EcotrailsDetailsActivity.this).load(CommonUtils.getEcoTrailBaseUrl((ecoTrailRowdata.getLogo()))).into(mIvDetails);
            }
        });
        setupToolBar();

    }

    private void setupToolBar(){
        Toolbar toolbar= (Toolbar) findViewById(R.id.toolbar);
        //toolbar.setTitle(type);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
    }

    @Override
    protected void initView() {
        setContentView(R.layout.activity_ecotrails_details);
        mIvDetails = (ImageView) findViewById(R.id.ivDetails);
        tvDetails = (TextView) findViewById(R.id.tvDesc);
        trailTitle = (TextView) findViewById(R.id.tvTrailTitle);
        tvTitle = (TextView) findViewById(R.id.tvTitle);
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
