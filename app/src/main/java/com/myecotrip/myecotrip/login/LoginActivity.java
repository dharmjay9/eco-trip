package com.myecotrip.myecotrip.login;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import com.myecotrip.myecotrip.R;
import com.myecotrip.myecotrip.base.BaseActivity;
import com.myecotrip.myecotrip.common.IConstant;
import com.myecotrip.myecotrip.home.HomeActivity;
import com.myecotrip.myecotrip.network.ErrorCodes;
import com.myecotrip.myecotrip.network.MyEcoTripCallBack;
import com.myecotrip.myecotrip.register.RegistrationActivity;

public class LoginActivity extends BaseActivity {

    private EditText etEmail, etPassword;
    public static final String LOGIN_TYPE = "login_type";
    private int loginType;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    protected void initView() {

        setContentView(R.layout.activity_login);
        loginType = getIntent().getIntExtra(LOGIN_TYPE, -1);
        etEmail = (EditText) findViewById(R.id.etEmail);
        etPassword = (EditText) findViewById(R.id.etPassword);
        findViewById(R.id.tvSkip).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(LoginActivity.this, HomeActivity.class));
                finish();
            }
        });
        findViewById(R.id.tvRegister).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(LoginActivity.this, RegistrationActivity.class);
                intent.putExtra(LoginActivity.LOGIN_TYPE, loginType);
                startActivity(intent);
                finish();
            }
        });

        findViewById(R.id.btnLogin).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (TextUtils.isEmpty(etEmail.getText().toString())) {
                    Toast.makeText(LoginActivity.this, "Please enter email", Toast.LENGTH_LONG).show();
                    return;
                }
                if (TextUtils.isEmpty(etPassword.getText().toString())) {
                    Toast.makeText(LoginActivity.this, "Please enter password", Toast.LENGTH_LONG).show();
                    return;
                }
                LoginRequest loginRequest = new LoginRequest();
                loginRequest.setUserName(etEmail.getText().toString());
                loginRequest.setPassword(etPassword.getText().toString());
                loginRequest.setLoginType("myecotrip");
                doLogin(loginRequest);

            }
        });
    }

    private void doLogin(final LoginRequest loginRequest) {
        displayProgressDialog();
        restClient.doLogin(loginRequest, new MyEcoTripCallBack<LoginResponse>() {
            @Override
            public void onFailure(String s, ErrorCodes errorCodes) {
                hideProgressDialog();
                Toast.makeText(LoginActivity.this, "Something went wrong", Toast.LENGTH_LONG).show();
            }

            @Override
            public void onSuccess(LoginResponse loginResponse) {
                if (loginResponse.getResponse().getError() == 0) {
                    hideProgressDialog();
                    converbizUser.setUserId(String.valueOf(loginResponse.getContent().getUserId()));
                    converbizUser.setFirstName(loginResponse.getContent().getUserName());
                    converbizUser.setLastName(loginResponse.getContent().getLast_name());
                    converbizUser.setMobileNo(loginResponse.getContent().getContact_no());
                    converbizUser.setCountry(loginResponse.getContent().getCountry());
                    if (loginType == IConstant.LOGIN_FROM_HOME) {
                        startActivity(new Intent(LoginActivity.this, HomeActivity.class));
                    } else {
                        Intent intent = new Intent();
                        setResult(2, intent);
                        finish();//finishing activity
                    }
                } else {
                    Toast.makeText(LoginActivity.this, loginResponse.getResponse().getMessage(), Toast.LENGTH_LONG).show();
                }
            }
        });
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        // check if the request code is same as what is passed  here it is 2
        if (requestCode == 2) {
            Intent intent = new Intent();
            setResult(2, intent);
            finish();//finishing activity
        }
    }
}
