package com.myecotrip.myecotrip.home;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.view.View;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;

import com.myecotrip.myecotrip.R;
import com.myecotrip.myecotrip.base.BaseActivity;
import com.myecotrip.myecotrip.common.MyEcoTripUser;
import com.myecotrip.myecotrip.login.LoginActivity;
import com.myecotrip.myecotrip.profileUpdate.OrderHistoryActivity;
import com.myecotrip.myecotrip.profileUpdate.ProfileUpdateActivity;

import static com.myecotrip.myecotrip.R.id.tvMobile;
import static com.myecotrip.myecotrip.R.id.tvUserName;

public class HomeActivity extends BaseActivity
        implements NavigationView.OnNavigationItemSelectedListener {


    private MyEcoTripUser myEcoTripUser;
    private TextView tvUserName,tvMobile;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    protected void initView() {
        setContentView(R.layout.activity_home);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
        fab.setVisibility(View.GONE);

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.addDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
         tvUserName = (TextView) navigationView.getHeaderView(0).findViewById(R.id.tvUserName);
         tvMobile = (TextView) navigationView.getHeaderView(0).findViewById(R.id.tvMobile);
        navigationView.getHeaderView(0).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(HomeActivity.this, ProfileUpdateActivity.class));
            }
        });
         myEcoTripUser = MyEcoTripUser.getInstance(this);
        navigationView.setNavigationItemSelectedListener(this);
        getSupportFragmentManager().beginTransaction().replace(R.id.container, new HomeFragment()).commit();
    }


    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.home, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
      /*  if (id == R.id.action_settings) {
            return true;
        }*/

        return super.onOptionsItemSelected(item);
    }

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        int id = item.getItemId();

       /* if (id == R.id.nav_camera) {
            // Handle the camera action
        } else if (id == R.id.nav_gallery) {

        } else if (id == R.id.nav_slideshow) {

        } else if (id == R.id.nav_manage) {

        } else if (id == R.id.nav_share) {

        } else*/
        if (id == R.id.nav_log_out) {

            drawer.closeDrawer(GravityCompat.START);
            converbizUser.setEmail("");
            converbizUser.setFirstName("");
            converbizUser.setLastName("");
            converbizUser.setMobileNo("");
            startActivity(new Intent(HomeActivity.this, LoginActivity.class));
            finish();
            return true;


        }
        if (id == R.id.history) {
            drawer.closeDrawer(GravityCompat.START);
            startActivity(new Intent(HomeActivity.this, OrderHistoryActivity.class));
            return true;


        }

        drawer.closeDrawer(GravityCompat.START);

        return true;
    }

    @Override
    protected void onResume() {
        super.onResume();
        tvUserName.setText(myEcoTripUser.getFirstName() + " " + myEcoTripUser.getLastName());
        tvMobile.setText(myEcoTripUser.getMobileNo());
    }
}
