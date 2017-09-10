package com.myecotrip.myecotrip.listing;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;

import com.myecotrip.myecotrip.R;
import com.myecotrip.myecotrip.aboutus.AboutUsActivity;
import com.myecotrip.myecotrip.listing.newListing.ListingFragment;

/**
 * Created by Gopal kumar on 07-05-2017.
 */

public class ListingActivity extends AppCompatActivity {

    public static final String K1="k1";
    public static final String PARAM_TYPE="type";
    private String type;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_listing);
        ListingFragment listingFragment= (ListingFragment) getSupportFragmentManager().findFragmentById(R.id.fragment);
        String  id=getIntent().getStringExtra(K1);
        type=getIntent().getStringExtra(PARAM_TYPE);
        listingFragment.getData(id,type);
        setupToolBar();
    }

    private void setupToolBar(){
        Toolbar toolbar= (Toolbar) findViewById(R.id.toolbar);
        toolbar.setTitle(type);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.listing_activity_menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // handle arrow click here
        if (item.getItemId() == android.R.id.home) {
            finish(); // close this activity and return to preview activity (if there is any)
        }

        if (item.getItemId() == R.id.about_icon) {
            Intent intent = new Intent(this,AboutUsActivity.class);
            startActivity(intent);
        }

        return super.onOptionsItemSelected(item);
    }
}
