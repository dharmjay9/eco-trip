package com.myecotrip.myecotrip.booking;

import android.app.ProgressDialog;
import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.text.TextUtils;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

import com.myecotrip.myecotrip.R;
import com.myecotrip.myecotrip.base.BaseActivity;
import com.myecotrip.myecotrip.booking.rowData.AvailableSeatBokingResponse;
import com.myecotrip.myecotrip.booking.rowData.AvailableSeatResponse;
import com.myecotrip.myecotrip.booking.rowData.AvailableSeatRuequest;
import com.myecotrip.myecotrip.booking.rowData.CheckAvailibityRequest;
import com.myecotrip.myecotrip.network.ErrorCodes;
import com.myecotrip.myecotrip.network.MyEcoTripCallBack;
import com.myecotrip.myecotrip.orderSummary.OrderSummaryActivity;

import java.util.ArrayList;
import java.util.List;

public class BookingActivity extends BaseActivity implements CommunicationInterface {
    private TabLayout tabLayout;
    private ViewPager viewPager;
    private String selectedDate;
    private int toatlPerson;
    private String citizenType;
    private CheckAvailibityRequest checkAvailibityRequest;



    @Override
    protected void initView() {

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_booking);
        viewPager = (ViewPager) findViewById(R.id.viewPager);
        setUpViewPager(viewPager);
        setupToolBar();
        tabLayout = (TabLayout) findViewById(R.id.tabLayout);
        tabLayout.setupWithViewPager(viewPager);
        findViewById(R.id.btnBookNow).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(TextUtils.isEmpty(selectedDate)){
                    Toast.makeText(BookingActivity.this,"Please select date",Toast.LENGTH_SHORT).show();
                    viewPager.setCurrentItem(0);
                }
                else if(toatlPerson==0){
                    Toast.makeText(BookingActivity.this,"Please select no of people",Toast.LENGTH_SHORT).show();
                    viewPager.setCurrentItem(1);
                }
               /* else if(TextUtils.isEmpty(citizenType)){
                    Toast.makeText(BookingActivity.this,"Please select Citizenship",Toast.LENGTH_SHORT).show();
                    viewPager.setCurrentItem(1);
                }*/
                else{

                    checkAvailibityRequest=getIntent().getExtras().getParcelable(OrderSummaryActivity.TRAIL_REQUEST);
                    AvailableSeatRuequest availableSeatRuequest=new AvailableSeatRuequest();
                    availableSeatRuequest.setNoOfTrekkers(toatlPerson);
                    availableSeatRuequest.setTravelDate(selectedDate);
                    availableSeatRuequest.setTrailId(checkAvailibityRequest.getTrail_id());
                    final ProgressDialog progressDialog=new ProgressDialog(BookingActivity.this);
                    progressDialog.show();
                    restClient.checkVailableSeat(availableSeatRuequest, new MyEcoTripCallBack<AvailableSeatBokingResponse>() {
                        @Override
                        public void onFailure(String s, ErrorCodes errorCodes) {

                            progressDialog.dismiss();
                        }

                        @Override
                        public void onSuccess(AvailableSeatBokingResponse availableSeatResponse) {

                            progressDialog.dismiss();
                            if(availableSeatResponse.getResponse().getError()==0){
                                checkAvailibityRequest.setCheck_in(selectedDate);
                                checkAvailibityRequest.setGuest_no(toatlPerson);
                                checkAvailibityRequest.setUser_id(1);
                                Intent intent=new Intent(BookingActivity.this, OrderSummaryActivity.class);
                                intent.putExtra(OrderSummaryActivity.TRAIL_REQUEST,checkAvailibityRequest);
                                intent.putExtra(OrderSummaryActivity.TRAIL_DETAILS,availableSeatResponse);
                                startActivity(intent);
                            }
                            else {
                                Toast.makeText(BookingActivity.this,availableSeatResponse.getResponse().getSys_msg(),Toast.LENGTH_LONG).show();
                            }

                        }
                    });

                }
            }
        });


    }

    private void setupToolBar(){
        Toolbar toolbar= (Toolbar) findViewById(R.id.toolbar);
        toolbar.setTitle("Booking");
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
    }
    private void setUpViewPager(ViewPager viewPager){
        ViewPagerAdaper adaper = new ViewPagerAdaper(getSupportFragmentManager());
        adaper.addFragment(new CheckInFragment(),"Booking Date" );
        //adaper.addFragment(new CheckOutFragment(),"Check Out");
        adaper.addFragment(new RoomFragment(),"Select Details");
        viewPager.setAdapter(adaper);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if(item.getItemId()==android.R.id.home)finish();
        return super.onOptionsItemSelected(item);
    }

    @Override
    public void callNextPage() {
        viewPager.setCurrentItem(1);
    }

    @Override
    public void setDate(String date) {
        selectedDate=date;
    }

    @Override
    public void setRoomDetails(int totalRoom) {
        toatlPerson=totalRoom;
    }

    @Override
    public void setNationality(String nationality) {
       citizenType=nationality;
    }

    class ViewPagerAdaper extends FragmentStatePagerAdapter {
        private final List<Fragment> fragmentList  = new ArrayList<>();
        private final List<String> fragmentTitleList  = new ArrayList<>();
        public ViewPagerAdaper(FragmentManager fm) {
            super(fm);
        }

        @Override
        public Fragment getItem(int position) {
            return fragmentList.get(position);
        }

        @Override
        public int getCount() {
            return fragmentList.size();
        }
        public  void addFragment(Fragment fragment,String title){
            fragmentList.add(fragment);
            fragmentTitleList.add(title);

        }

        @Override
        public CharSequence getPageTitle(int position) {
            return fragmentTitleList.get(position);

        }
    }
}
