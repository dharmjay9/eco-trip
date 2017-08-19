package com.myecotrip.myecotrip.booking.rowData;

/**
 * Created by Gopal kumar on 18-08-2017.
 */

public class AvailableSeatRuequest {


    /**
     * trailId : 5
     * travelDate : 2018-10-18
     * noOfTrekkers : 1300
     */

    private int trailId;
    private String travelDate;
    private int noOfTrekkers;

    public int getTrailId() {
        return trailId;
    }

    public void setTrailId(int trailId) {
        this.trailId = trailId;
    }

    public String getTravelDate() {
        return travelDate;
    }

    public void setTravelDate(String travelDate) {
        this.travelDate = travelDate;
    }

    public int getNoOfTrekkers() {
        return noOfTrekkers;
    }

    public void setNoOfTrekkers(int noOfTrekkers) {
        this.noOfTrekkers = noOfTrekkers;
    }
}
