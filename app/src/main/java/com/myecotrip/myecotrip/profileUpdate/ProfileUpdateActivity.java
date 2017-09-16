package com.myecotrip.myecotrip.profileUpdate;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.text.TextUtils;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import com.myecotrip.myecotrip.R;
import com.myecotrip.myecotrip.aboutus.AboutUsActivity;
import com.myecotrip.myecotrip.base.BaseActivity;
import com.myecotrip.myecotrip.common.MyEcoTripUser;
import com.myecotrip.myecotrip.network.ErrorCodes;
import com.myecotrip.myecotrip.network.MyEcoTripCallBack;
import com.myecotrip.myecotrip.register.RegisterRequest;
import com.myecotrip.myecotrip.register.RegisterResponse;

public class ProfileUpdateActivity extends BaseActivity {

    private EditText etFName, etLName, etMobile;
    private MyEcoTripUser myEcoTripUser;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    protected void initView() {
        setContentView(R.layout.activity_profile_update);
        etFName = (EditText) findViewById(R.id.etFname);
        etLName = (EditText) findViewById(R.id.etLname);
        etMobile = (EditText) findViewById(R.id.etMobile);
        myEcoTripUser = MyEcoTripUser.getInstance(this);
        etFName.setText(myEcoTripUser.getFirstName());
        etLName.setText(myEcoTripUser.getLastName());
        etMobile.setText(myEcoTripUser.getMobileNo());

        findViewById(R.id.btnSignUp).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                checkValidation();
            }
        });

        setupToolBar("Update Profile");
    }


    private void setupToolBar(String title) {
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        toolbar.setTitle(title);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
    }

    private void checkValidation() {
        if (TextUtils.isEmpty(etFName.getText().toString())) {
            Toast.makeText(this, "Please enter first name", Toast.LENGTH_SHORT).show();
            return;
        }
        if (TextUtils.isEmpty(etLName.getText().toString())) {
            Toast.makeText(this, "Please enter last name", Toast.LENGTH_SHORT).show();
            return;
        }
        if (TextUtils.isEmpty(etMobile.getText().toString())) {
            Toast.makeText(this, "Please enter mobile", Toast.LENGTH_SHORT).show();
            return;
        }
        if (etMobile.getText().toString().length() != 10) {
            Toast.makeText(this, "Please valid mobile no", Toast.LENGTH_SHORT).show();
            return;
        }


        doRegister();

    }


    private void doRegister() {
        final ProfileUpdateRequest registerRequest = new ProfileUpdateRequest();
        registerRequest.setFirst_name(etFName.getText().toString());
        registerRequest.setLast_name(etLName.getText().toString());
        registerRequest.setFirst_name(etFName.getText().toString());
        registerRequest.setContact_no(etMobile.getText().toString());
        registerRequest.setId(myEcoTripUser.getUserId());
        registerRequest.setSign_in_with("myecotrip");
        registerRequest.setCountry("India");
        displayProgressDialog();
        restClient.updateProfile(registerRequest, new MyEcoTripCallBack<ProfileUpdateResponse>() {
            @Override
            public void onFailure(String s, ErrorCodes errorCodes) {
                hideProgressDialog();
                Toast.makeText(ProfileUpdateActivity.this, "Something went wrong", Toast.LENGTH_LONG).show();
            }

            @Override
            public void onSuccess(ProfileUpdateResponse registerResponse) {
                hideProgressDialog();
                converbizUser.setUserId(String.valueOf(registerResponse.getContent().getId()));
                converbizUser.setFirstName(registerResponse.getContent().getFirst_name());
                converbizUser.setLastName(registerResponse.getContent().getLast_name());
                converbizUser.setMobileNo(registerResponse.getContent().getContact_no());
                converbizUser.setCountry(registerResponse.getContent().getCountry());
                Intent intent = new Intent();
                setResult(2, intent);
                finish();//finishing activity
            }
        });

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

