package com.myecotrip.myecotrip.register;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

import com.myecotrip.myecotrip.R;
import com.myecotrip.myecotrip.base.BaseActivity;
import com.myecotrip.myecotrip.common.IConstant;
import com.myecotrip.myecotrip.home.HomeActivity;
import com.myecotrip.myecotrip.login.LoginActivity;
import com.myecotrip.myecotrip.network.ErrorCodes;
import com.myecotrip.myecotrip.network.MyEcoTripCallBack;

public class RegistrationActivity extends BaseActivity {

    private EditText etFName,etLName,etMobile,etEmail,etPassword,etCPass;//,etAddress,etPinCode
    private String countryName;
    private Spinner countrySpinner;
    private int loginType;
           // ,etState,etCountry,etCity,etCPass;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    protected void initView() {
        setContentView(R.layout.activity_registration);
        loginType=getIntent().getIntExtra(LoginActivity.LOGIN_TYPE,-1);
        etFName= (EditText) findViewById(R.id.etFname);
        etLName= (EditText) findViewById(R.id.etLname);
        etMobile= (EditText) findViewById(R.id.etMobile);
        etEmail= (EditText) findViewById(R.id.etEmail);
        etPassword= (EditText) findViewById(R.id.etPassword);
        etCPass= (EditText) findViewById(R.id.etCpassword);
        final String []countryArry=getResources().getStringArray(R.array.country);
        countrySpinner= (Spinner) findViewById(R.id.countrySpinner);
        countrySpinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                countryName=countryArry[position];
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
       // etAddress= (EditText) findViewById(R.id.etAddress);
       // etPinCode= (EditText) findViewById(R.id.etPinCode);
       // etState= (EditText) findViewById(R.id.etSate);
      //  etCountry= (EditText) findViewById(R.id.etCoumtry);
      //  etCity= (EditText) findViewById(R.id.etCity);
        findViewById(R.id.btnSignUp).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                checkValidation();
            }
        });
    }

    private void checkValidation(){
        if(TextUtils.isEmpty(etFName.getText().toString())){
            Toast.makeText(this,"Please enter first name",Toast.LENGTH_SHORT).show();
            return;
        }
        if(TextUtils.isEmpty(etLName.getText().toString())){
            Toast.makeText(this,"Please enter last name",Toast.LENGTH_SHORT).show();
            return;
        }
        if(TextUtils.isEmpty(etMobile.getText().toString())){
            Toast.makeText(this,"Please enter mobile",Toast.LENGTH_SHORT).show();
            return;
        }
        if(etMobile.getText().toString().length()!=10){
            Toast.makeText(this,"Please valid mobile no",Toast.LENGTH_SHORT).show();
            return;
        }
        if(TextUtils.isEmpty(etEmail.getText().toString())){
            Toast.makeText(this,"Please enter email",Toast.LENGTH_SHORT).show();
            return;
        }
        if(TextUtils.isEmpty(etPassword.getText().toString())){
            Toast.makeText(this,"Please enter  password",Toast.LENGTH_SHORT).show();
            return;
        }
        if(TextUtils.isEmpty(etCPass.getText().toString())){
            Toast.makeText(this,"Please enter confirm name",Toast.LENGTH_SHORT).show();
            return;
        }
        if(!etPassword.getText().toString().equals(etCPass.getText().toString())){
            Toast.makeText(this,"Password is not matching",Toast.LENGTH_SHORT).show();
            return;
        }

        doRegister();

    }



    private void doRegister(){
        final RegisterRequest registerRequest=new RegisterRequest();
        registerRequest.setFirst_name(etFName.getText().toString());
        registerRequest.setLast_name(etLName.getText().toString());
        registerRequest.setEmail(etEmail.getText().toString());
        registerRequest.setPassword(etPassword.getText().toString());
        registerRequest.setCountry(countryName);
       // registerRequest.setContact_no();
       // registerRequest.setAddress(etAddress.getText().toString());
       // registerRequest.setPincode(etPinCode.getText().toString());
       // registerRequest.setCity(etCity.getText().toString());
       // registerRequest.setState(etState.getText().toString());
       // registerRequest.setCountry(etCountry.getText().toString());
        registerRequest.setFirst_name(etFName.getText().toString());
        registerRequest.setContact_no(etMobile.getText().toString());
        registerRequest.setSign_in_with("myecotrip");
        displayProgressDialog();
        restClient.doSignUp(registerRequest, new MyEcoTripCallBack<RegisterResponse>() {
            @Override
            public void onFailure(String s, ErrorCodes errorCodes) {
                hideProgressDialog();
                Toast.makeText(RegistrationActivity.this,"Something went wrong",Toast.LENGTH_LONG).show();
            }

            @Override
            public void onSuccess(RegisterResponse registerResponse) {
                hideProgressDialog();
                converbizUser.setUserId(String.valueOf(registerResponse.getContent().getId()));
                converbizUser.setFirstName(registerResponse.getContent().getFirst_name());
                converbizUser.setLastName(registerResponse.getContent().getLast_name());
                converbizUser.setMobileNo(registerResponse.getContent().getContact_no());
                converbizUser.setCountry(registerResponse.getContent().getCountry());
                if (loginType == IConstant.LOGIN_FROM_HOME) {
                    startActivity(new Intent(RegistrationActivity.this, HomeActivity.class));
                } else {
                    Intent intent = new Intent();
                    setResult(2, intent);
                    finish();//finishing activity
                }
            }
        });

    }
}


/*{
 "first_name": "Prashu",
 "last_name": "Reddy",
 "contact_no": "99999999",
 "email": "Prashu@gmail.com",
 "password": "abc123",
 "address": "xxxxx",
 "city": "xxxxx",
 "pincode": "123456",
 "state": "xxxxx",
 "country": "xxxxx",
 "user_wallet": 100.0
}*/