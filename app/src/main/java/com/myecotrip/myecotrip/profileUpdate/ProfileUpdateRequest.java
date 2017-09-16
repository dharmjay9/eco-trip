package com.myecotrip.myecotrip.profileUpdate;

/**
 * Created by Gopal kumar on 14-09-2017.
 */

public class ProfileUpdateRequest {


    /**
     * id : 7
     * first_name : abcd
     * last_name : xyz
     * contact_no : 8852103645
     * country : India
     */

    private String id;
    private String first_name;
    private String last_name;
    private String contact_no;
    private String country;
    private String sign_in_with;

    public String getSign_in_with() {
        return sign_in_with;
    }

    public void setSign_in_with(String sign_in_with) {
        this.sign_in_with = sign_in_with;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
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

    public String getContact_no() {
        return contact_no;
    }

    public void setContact_no(String contact_no) {
        this.contact_no = contact_no;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }
}
