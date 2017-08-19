package com.myecotrip.myecotrip.details;

/**
 * Created by Gopal kumar on 18-07-2017.
 */

public class CommonDetailsRequest {

    private String camp_id;

    private String park_id;

    private String safari_id;

    public void setSafari_id(String safari_id) {
        this.safari_id = safari_id;
    }

    public void setCamp_id(String camp_id) {
        this.camp_id=camp_id;
    }



    public void setPark_id(String park_id) {
        this.park_id = park_id;
    }
}
