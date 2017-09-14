package com.myecotrip.myecotrip.details.ecoTrail;

import android.Manifest;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.ActivityCompat;
import android.support.v4.view.ViewPager;
import android.support.v4.widget.NestedScrollView;
import android.support.v7.app.AlertDialog;
import android.support.v7.widget.Toolbar;
import android.text.Html;
import android.view.View;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;

import com.myecotrip.myecotrip.PermissionImpl;
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

public class TrailDetailsActivity extends BaseActivity {

    private TextView tvTitle, tvDesc, tvWhen,tv_description_note;//tvDistance, tvTime,tvTrailType
    private TextView tvstarting_point, tv_end_point, tv_treakking_distance, tv_reporting_time, tv_treakking_duration, tv_treakking_type;
    private TextView location_detail, trekker_per_person, owner_contact_person;
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
        tv_description_note = (TextView) findViewById(R.id.tv_description_note);
        //  tvDistance = (TextView) findViewById(R.id.tvDistance);
        //  tvTime = (TextView) findViewById(R.id.tvTime);
        tvstarting_point = (TextView) findViewById(R.id.tvstarting_point);
        tv_end_point = (TextView) findViewById(R.id.tv_end_point);
        tv_treakking_distance = (TextView) findViewById(R.id.tv_treakking_distance);
        tv_reporting_time = (TextView) findViewById(R.id.tv_reporting_time);
        tv_treakking_duration = (TextView) findViewById(R.id.tv_treakking_duration);
        tv_treakking_type = (TextView) findViewById(R.id.tv_treakking_type);
        tvWhen = (TextView) findViewById(R.id.tvWhenToVisit);
        //  tvTrailType = (TextView) findViewById(R.id.tvTrailType);

        location_detail = (TextView) findViewById(R.id.location_detail);
        trekker_per_person = (TextView) findViewById(R.id.trekker_per_person);
        owner_contact_person = (TextView) findViewById(R.id.owner_contact_person);

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
                Toast.makeText(TrailDetailsActivity.this, "Something went wrong", Toast.LENGTH_SHORT).show();
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
     TrailDetailsResponse.ContentBean trailsBean;
    private void setData(TrailDetailsResponse trailDetailsResponse) {
         trailsBean = trailDetailsResponse.getContent();
        tvTitle.setText("About " + trailsBean.getName());
        tvstarting_point.setText(trailsBean.getStarting_point());
        tv_end_point.setText(trailsBean.getEnding_point());
        tvDesc.setText(Html.fromHtml(trailsBean.getDescription()));
        // tvTime.setText("Time Taken : " + trailsBean.getHours() + ":" + trailsBean.getMinutes());
        //  tvDistance.setText("Distance : " + trailsBean.getDistance());
        //  tvTrailType.setText(trailsBean1.getType());

        tv_treakking_distance.setText(trailsBean.getDistance() + " " + trailsBean.getDistance_unit());
        tv_reporting_time.setText(trailsBean.getReporting_time());
        tv_treakking_duration.setText(trailsBean.getHours() + " Hrs " + trailsBean.getMinutes() + " Mins");
        tv_treakking_type.setText(trailsBean.getType());
        tv_description_note.setText("@NOTE- "+trailsBean.getGeneral_instruction());
        location_detail.setCompoundDrawablesWithIntrinsicBounds( R.drawable.map_marker_outline, 0, 0, 0);
        location_detail.setText( trailsBean.getRange());
        location_detail.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse("geo:0,0?q=" + (trailsBean.getRange())));
                try {
                    startActivity(intent);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });

        trekker_per_person.setText("Per Person "+ getResources().getString(R.string.rupes)+String.valueOf(trailsBean.getPricePerPerson()));
        owner_contact_person.setText(trailsBean.getIncharger_details().get(0) + ", " + trailsBean.getIncharger_details().get(2));
        owner_contact_person.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                makePhoneCall();
            }
        });
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

    private void makePhoneCall() {
        requestAppPermissions();
    }

    private void requestAppPermissions() {
        if (mPermissionFragment.isPermissionGRanted(Manifest.permission.CALL_PHONE)) {
            gotoNext();
            return;
        }

        mPermissionFragment.requestForPermission(
                new PermissionImpl() {
                    @Override
                    public void permissionApproved(String... permissions) {
                        if (mPermissionFragment.isPermissionGRanted(Manifest.permission.CALL_PHONE)) {
                            gotoNext();
                        } else {
                            displayPermissionDenied();
                        }
                    }

                    @Override
                    public void onApproved(String approved) {

                    }
                }, Manifest.permission.CALL_PHONE);
    }

    private void gotoNext( ) {
        //Intent phoneIntent = new Intent(Intent.ACTION_CALL);
        //phoneIntent.setData(Uri.parse("080-46481855"));
        String phoneNo=trailsBean.getIncharger_details().get(2);
        Intent intent = new Intent(Intent.ACTION_CALL, Uri.fromParts("tel", phoneNo, null));
        if (ActivityCompat.checkSelfPermission(this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
            // TODO: Consider calling
            //    ActivityCompat#requestPermissions
            // here to request the missing permissions, and then overriding
            //   public void onRequestPermissionsResult(int requestCode, String[] permissions,
            //                                          int[] grantResults)
            // to handle the case where the user grants the permission. See the documentation
            Toast.makeText(this, getResources().getString(R.string.grant_permission_phone), Toast.LENGTH_SHORT).show();
            // for ActivityCompat#requestPermissions for more details.
            return;
        }
        intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK | Intent.FLAG_ACTIVITY_NO_USER_ACTION);
        startActivity(intent);
        // startActivity(phoneIntent);
    }

    private void displayPermissionDenied() {
        AlertDialog.Builder builder1 = new AlertDialog.Builder(this);
        builder1.setMessage("Please enable your application permission.");
        builder1.setCancelable(false);

        builder1.setPositiveButton(
                "OK",
                new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int id) {
                        dialog.cancel();
                        requestAppPermissions();
                    }
                });
        builder1.setNegativeButton(
                "No",
                new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int id) {
                        dialog.cancel();
                        finish();
                    }
                });

        AlertDialog alert11 = builder1.create();
        alert11.show();
    }

}
