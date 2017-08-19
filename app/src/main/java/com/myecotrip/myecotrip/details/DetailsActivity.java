package com.myecotrip.myecotrip.details;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.view.View;

import com.myecotrip.myecotrip.R;
import com.myecotrip.myecotrip.base.BaseActivity;

public class DetailsActivity extends BaseActivity {


    public static final String PARAM_CATEGORY="category";
    public static final String PARAM_ID="param_id";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    protected void initView() {
        setContentView(R.layout.activity_details);
        setupToolBar();
        RecyclerView recyclerView= (RecyclerView) findViewById(R.id.rvActivity);
        recyclerView.setAdapter(new ActivityAdapter(this));
    }

    private void setupToolBar(){
        Toolbar toolbar= (Toolbar) findViewById(R.id.toolbar);
        toolbar.setTitle("Bandi Pur Tiger Resort");
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

    public void callApi(){
        Bundle bundle=getIntent().getExtras();
        String category=bundle.getString(PARAM_CATEGORY);
        String id=bundle.getString(PARAM_ID);


    }

    private void getEcoTrails(String id){

    }
    private void getBirdSanitary(String id){

    }
    private void getJungleStary(String id){

    }
    private void getWildSafari(String id){

    }
}
