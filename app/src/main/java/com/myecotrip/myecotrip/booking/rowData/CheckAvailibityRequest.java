package com.myecotrip.myecotrip.booking.rowData;

import android.os.Parcel;
import android.os.Parcelable;

/**
 * Created by Gopal kumar on 27-07-2017.
 */

public class CheckAvailibityRequest implements Parcelable {


    /**
     * camp_id : 2
     * trail_id : 2
     * guest_no : 4
     * check_in : 2016-11-15 00:00:00
     * user_id : 1
     */

    private int camp_id;
    private int trail_id;
    private int guest_no;
    private String check_in;
    private int user_id;

    public String getCheck_in_day() {
        return check_in_day;
    }

    public void setCheck_in_day(String check_in_day) {
        this.check_in_day = check_in_day;
    }

    public static Creator<CheckAvailibityRequest> getCREATOR() {
        return CREATOR;
    }

    private String check_in_day;
    public int getCamp_id() {
        return camp_id;
    }

    public void setCamp_id(int camp_id) {
        this.camp_id = camp_id;
    }

    public int getTrail_id() {
        return trail_id;
    }

    public void setTrail_id(int trail_id) {
        this.trail_id = trail_id;
    }

    public int getGuest_no() {
        return guest_no;
    }

    public void setGuest_no(int guest_no) {
        this.guest_no = guest_no;
    }

    public String getCheck_in() {
        return check_in;
    }

    public void setCheck_in(String check_in) {
        this.check_in = check_in;
    }

    public int getUser_id() {
        return user_id;
    }

    public void setUser_id(int user_id) {
        this.user_id = user_id;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeInt(this.camp_id);
        dest.writeInt(this.trail_id);
        dest.writeInt(this.guest_no);
        dest.writeString(this.check_in);
        dest.writeInt(this.user_id);
        dest.writeString(this.check_in_day);
    }

    public CheckAvailibityRequest() {
    }

    protected CheckAvailibityRequest(Parcel in) {
        this.camp_id = in.readInt();
        this.trail_id = in.readInt();
        this.guest_no = in.readInt();
        this.check_in = in.readString();
        this.user_id = in.readInt();
        this.check_in_day=in.readString();
    }

    public static final Parcelable.Creator<CheckAvailibityRequest> CREATOR = new Parcelable.Creator<CheckAvailibityRequest>() {
        @Override
        public CheckAvailibityRequest createFromParcel(Parcel source) {
            return new CheckAvailibityRequest(source);
        }

        @Override
        public CheckAvailibityRequest[] newArray(int size) {
            return new CheckAvailibityRequest[size];
        }
    };
}
