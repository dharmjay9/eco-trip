package com.myecotrip.myecotrip.booking.rowData;

import com.google.gson.annotations.SerializedName;
import com.myecotrip.myecotrip.base.CommonModel;

/**
 * Created by Gopal kumar on 27-07-2017.
 */

public class CheckVaibilityResponse extends CommonModel{


    /**
     * content : {"Booking":{"camp":"Kudremukh Landscape","trail":"Makalidurga Trek","check_in":"2017-11-15 00:00:00","price_per_guest":"450.00/Guest","total_price":1800,"booking_id":23}}
     * response : {"status-code":200,"error":0,"sys_msg":"","message":"Success"}
     */

    private ContentBean content;
    private ResponseBean response;

    public ContentBean getContent() {
        return content;
    }

    public void setContent(ContentBean content) {
        this.content = content;
    }

    public ResponseBean getResponse() {
        return response;
    }

    public void setResponse(ResponseBean response) {
        this.response = response;
    }

    public static class ContentBean {
        /**
         * Booking : {"camp":"Kudremukh Landscape","trail":"Makalidurga Trek","check_in":"2017-11-15 00:00:00","price_per_guest":"450.00/Guest","total_price":1800,"booking_id":23}
         */

        private BookingBean Booking;

        public BookingBean getBooking() {
            return Booking;
        }

        public void setBooking(BookingBean Booking) {
            this.Booking = Booking;
        }

        public static class BookingBean {
            /**
             * camp : Kudremukh Landscape
             * trail : Makalidurga Trek
             * check_in : 2017-11-15 00:00:00
             * price_per_guest : 450.00/Guest
             * total_price : 1800
             * booking_id : 23
             */

            private String camp;
            private String trail;
            private String check_in;
            private String price_per_guest;
            private int total_price;
            private int booking_id;


            public String getCamp() {
                return camp;
            }

            public void setCamp(String camp) {
                this.camp = camp;
            }

            public String getTrail() {
                return trail;
            }

            public void setTrail(String trail) {
                this.trail = trail;
            }

            public String getCheck_in() {
                return check_in;
            }

            public void setCheck_in(String check_in) {
                this.check_in = check_in;
            }

            public String getPrice_per_guest() {
                return price_per_guest;
            }

            public void setPrice_per_guest(String price_per_guest) {
                this.price_per_guest = price_per_guest;
            }

            public int getTotal_price() {
                return total_price;
            }

            public void setTotal_price(int total_price) {
                this.total_price = total_price;
            }

            public int getBooking_id() {
                return booking_id;
            }

            public void setBooking_id(int booking_id) {
                this.booking_id = booking_id;
            }
        }
    }

    public static class ResponseBean {
        /**
         * status-code : 200
         * error : 0
         * sys_msg :
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
}
