package com.myecotrip.myecotrip.base;

import android.app.ProgressDialog;
import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;

import com.divum.mylibrary.PermissionFragment;
import com.myecotrip.myecotrip.common.MyEcoTripUser;
import com.myecotrip.myecotrip.network.RestClient;

import uk.co.chrisjenx.calligraphy.CalligraphyContextWrapper;


public abstract class BaseActivity extends AppCompatActivity {

    protected RestClient restClient;
    protected MyEcoTripUser converbizUser;
    private ProgressDialog mProgressDialog;
    protected PermissionFragment mPermissionFragment;
    private static final String HEADLESS_FRAGMENT = "head_less_fragment";
    private static final String PROGRESS_FRAGMENT = "progress_fragment";
    protected abstract void initView();

    @Override
    protected void attachBaseContext(Context newBase) {
        super.attachBaseContext(CalligraphyContextWrapper.wrap(newBase));
    }

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        initView();
        restClient=new RestClient();
        converbizUser=MyEcoTripUser.getInstance(this);

        mPermissionFragment = (PermissionFragment) getSupportFragmentManager().findFragmentByTag(HEADLESS_FRAGMENT);
        if (mPermissionFragment == null) ;
        {
            mPermissionFragment = new PermissionFragment();
            getSupportFragmentManager().beginTransaction().add(mPermissionFragment, HEADLESS_FRAGMENT).commitNow();
        }
    }

    protected void displayProgressDialog(){
        mProgressDialog=new ProgressDialog(this);
        mProgressDialog.setMessage("Wait...");
        mProgressDialog.show();
    }

    protected void hideProgressDialog(){
        if(mProgressDialog!=null){
            mProgressDialog.dismiss();
        }
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if(item.getItemId()== android.R.id.home)finish();
        return super.onOptionsItemSelected(item);
    }
}
