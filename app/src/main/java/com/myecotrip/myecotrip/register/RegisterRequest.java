package com.myecotrip.myecotrip.register;

/**
 * Created by Gopal kumar on 04-06-2017.
 */

public class RegisterRequest {


    /**
     * sign_in_with : myecotrip
     * first_name : asdas
     * last_name : asd
     * email : a@gmail.com
     * contact_no : 45054554444
     * password : a
     */

    private String sign_in_with;
    private String first_name;
    private String last_name;
    private String email;
    private String contact_no;
    private String password;

    public String getSign_in_with() {
        return sign_in_with;
    }

    public void setSign_in_with(String sign_in_with) {
        this.sign_in_with = sign_in_with;
    }

    public String getFirst_name() {
        return first_name;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getContact_no() {
        return contact_no;
    }

    public void setContact_no(String contact_no) {
        this.contact_no = contact_no;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
