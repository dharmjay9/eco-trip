package com.myecotrip.myecotrip.payment;

import com.google.gson.annotations.SerializedName;
import com.myecotrip.myecotrip.base.CommonModel;

import java.util.List;

/**
 * Created by Gopal kumar on 14-09-2017.
 */

public class PaymentResponse extends CommonModel {


    /**
     * content : [{"id":5,"display_id":"170818145947","user_id":14,"trail_id":7,"date_of_booking":"2017-08-18 18:14:17","checkIn":"2017-08-24 00:00:00","number_of_trekkers":1,"amount":450,"amountWithTax":479.25,"booking_status":"cancelledByMyecotrip","gatewayResponse":"Payment delayed by 17 min","trekkers_details":"[{\"age\": \"31\", \"sex\": \"M\", \"name\": \"Harish Papanna\"}]","booking_source":"Web","created_at":"2017-08-18 18:14:17","updated_at":"2017-08-18 18:31:02","trailName":"Siddarabetta"}]
     * response : {"status-code":200,"error":0,"sys_msg":"Success","message":"Success"}
     */

    private ResponseBean response;
    private List<ContentBean> content;

    public ResponseBean getResponse() {
        return response;
    }

    public void setResponse(ResponseBean response) {
        this.response = response;
    }

    public List<ContentBean> getContent() {
        return content;
    }

    public void setContent(List<ContentBean> content) {
        this.content = content;
    }

    public static class ResponseBean {
        /**
         * status-code : 200
         * error : 0
         * sys_msg : Success
         * message : Success
         */

        @SerializedName("status-code")
        private int statuscode;
        private int error;
        private String sys_msg;
        private String message;

        public int getStatuscode() {
            return statuscode;
        }

        public void setStatuscode(int statuscode) {
            this.statuscode = statuscode;
        }

        public int getError() {
            return error;
        }

        public void setError(int error) {
            this.error = error;
        }

        public String getSys_msg() {
            return sys_msg;
        }

        public void setSys_msg(String sys_msg) {
            this.sys_msg = sys_msg;
        }

        public String getMessage() {
            return message;
        }

        public void setMessage(String message) {
            this.message = message;
        }
    }

    public static class ContentBean {
        /**
         * id : 5
         * display_id : 170818145947
         * user_id : 14
         * trail_id : 7
         * date_of_booking : 2017-08-18 18:14:17
         * checkIn : 2017-08-24 00:00:00
         * number_of_trekkers : 1
         * amount : 450
         * amountWithTax : 479.25
         * booking_status : cancelledByMyecotrip
         * gatewayResponse : Payment delayed by 17 min
         * trekkers_details : [{"age": "31", "sex": "M", "name": "Harish Papanna"}]
         * booking_source : Web
         * created_at : 2017-08-18 18:14:17
         * updated_at : 2017-08-18 18:31:02
         * trailName : Siddarabetta
         */

        private int id;
        private String display_id;
        private int user_id;
        private int trail_id;
        private String date_of_booking;
        private String checkIn;
        private int number_of_trekkers;
        private int amount;
        private double amountWithTax;
        private String booking_status;
        private String gatewayResponse;
        private String trekkers_details;
        private String booking_source;
        private String created_at;
        private String updated_at;
        private String trailName;

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getDisplay_id() {
            return display_id;
        }

        public void setDisplay_id(String display_id) {
            this.display_id = display_id;
        }

        public int getUser_id() {
            return user_id;
        }

        public void setUser_id(int user_id) {
            this.user_id = user_id;
        }

        public int getTrail_id() {
            return trail_id;
        }

        public void setTrail_id(int trail_id) {
            this.trail_id = trail_id;
        }

        public String getDate_of_booking() {
            return date_of_booking;
        }

        public void setDate_of_booking(String date_of_booking) {
            this.date_of_booking = date_of_booking;
        }

        public String getCheckIn() {
            return checkIn;
        }

        public void setCheckIn(String checkIn) {
            this.checkIn = checkIn;
        }

        public int getNumber_of_trekkers() {
            return number_of_trekkers;
        }

        public void setNumber_of_trekkers(int number_of_trekkers) {
            this.number_of_trekkers = number_of_trekkers;
        }

        public int getAmount() {
            return amount;
        }

        public void setAmount(int amount) {
            this.amount = amount;
        }

        public double getAmountWithTax() {
            return amountWithTax;
        }

        public void setAmountWithTax(double amountWithTax) {
            this.amountWithTax = amountWithTax;
        }

        public String getBooking_status() {
            return booking_status;
        }

        public void setBooking_status(String booking_status) {
            this.booking_status = booking_status;
        }

        public String getGatewayResponse() {
            return gatewayResponse;
        }

        public void setGatewayResponse(String gatewayResponse) {
            this.gatewayResponse = gatewayResponse;
        }

        public String getTrekkers_details() {
            return trekkers_details;
        }

        public void setTrekkers_details(String trekkers_details) {
            this.trekkers_details = trekkers_details;
        }

        public String getBooking_source() {
            return booking_source;
        }

        public void setBooking_source(String booking_source) {
            this.booking_source = booking_source;
        }

        public String getCreated_at() {
            return created_at;
        }

        public void setCreated_at(String created_at) {
            this.created_at = created_at;
        }

        public String getUpdated_at() {
            return updated_at;
        }

        public void setUpdated_at(String updated_at) {
            this.updated_at = updated_at;
        }

        public String getTrailName() {
            return trailName;
        }

        public void setTrailName(String trailName) {
            this.trailName = trailName;
        }
    }
}
