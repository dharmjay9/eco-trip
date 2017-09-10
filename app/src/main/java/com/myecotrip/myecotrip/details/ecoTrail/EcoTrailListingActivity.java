package com.myecotrip.myecotrip.details.ecoTrail;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;

import com.myecotrip.myecotrip.R;
import com.myecotrip.myecotrip.base.BaseActivity;
import com.myecotrip.myecotrip.listing.newListing.ListingFragment;

public class EcoTrailListingActivity extends AppCompatActivity {
    public static final String K1="k1";
    public static final String PARAM_TYPE="type";
    public static final String PARAM_TYPE1="name";

    private String type,ecoName;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_trail_listing);
        EcoListingFragment listingFragment= (EcoListingFragment) getSupportFragmentManager().findFragmentById(R.id.fragment);
        String  id=getIntent().getStringExtra(EcotrailsDetailsActivity.ECOTRAIL_ID);
        type=getIntent().getStringExtra(PARAM_TYPE);
        ecoName=getIntent().getStringExtra(EcotrailsDetailsActivity.ECOTRAIL_NAME);
        listingFragment.getData(id,type);
        setupToolBar();
    }

    private void setupToolBar(){
        Toolbar toolbar= (Toolbar) findViewById(R.id.toolbar);
        toolbar.setTitle(ecoName);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // handle arrow click here
        if (item.getItemId() == android.R.id.home) {
            finish(); // close this activity and return to preview activity (if there is any)
        }

        return super.onOptionsItemSelected(item);
    }
}
