package com.myecotrip.myecotrip.login;

import com.myecotrip.myecotrip.base.CommonModel;

/**
 * Created by Gopal kumar on 04-06-2017.
 */

public class LoginRequest extends CommonModel {


    /**
     * loginType : myecotrip
     * userName : myecotrip17@gmail.com
     * password : q
     */

    private String loginType;
    private String userName;
    private String password;

    public String getLoginType() {
        return loginType;
    }

    public void setLoginType(String loginType) {
        this.loginType = loginType;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
