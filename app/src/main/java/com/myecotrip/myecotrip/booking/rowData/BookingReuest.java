package com.myecotrip.myecotrip.booking.rowData;

import java.util.List;

/**
 * Created by Gopal kumar on 18-08-2017.
 */

public class BookingReuest {


    /**
     * trailId : 5
     * travelDate : 2017-08-18
     * userId : 5
     * requestedSeats : 4
     * total : 450
     * totalPayable : 500
     * detail : [{"age":"1","sex":"M","name":"1"},{"age":"1","sex":"M","name":"1"}]
     */

    private int trailId;
    private String travelDate;
    private int userId;
    private int requestedSeats;
    private int total;
    private int totalPayable;
    private List<DetailBean> detail;

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

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public int getRequestedSeats() {
        return requestedSeats;
    }

    public void setRequestedSeats(int requestedSeats) {
        this.requestedSeats = requestedSeats;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public int getTotalPayable() {
        return totalPayable;
    }

    public void setTotalPayable(int totalPayable) {
        this.totalPayable = totalPayable;
    }

    public List<DetailBean> getDetail() {
        return detail;
    }

    public void setDetail(List<DetailBean> detail) {
        this.detail = detail;
    }

    public static class DetailBean {
        /**
         * age : 1
         * sex : M
         * name : 1
         */

        private String age;
        private String sex;
        private String name;

        public String getAge() {
            return age;
        }

        public void setAge(String age) {
            this.age = age;
        }

        public String getSex() {
            return sex;
        }

        public void setSex(String sex) {
            this.sex = sex;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }
    }
}
