package com.myecotrip.myecotrip.details.jungleStay;

import com.google.gson.annotations.SerializedName;
import com.myecotrip.myecotrip.base.CommonModel;

import java.util.List;

/**
 * Created by Gopal kumar on 15-07-2017.
 */

public class JungleStayResponse extends CommonModel {


    /**
     * content : {"JungalStay":[{"properties_id":1,"orderno":1,"park_id":2,"properties_name":"Bandipur Nature Camp","properties_description":"<p>Bandipur nature camp consists of 2 bed, 4 bed accommodations and also has dormitories which can accommodate upto 20 people.&nbsp;<\/p>","prop_meta_desc":"The cottages of Karnataka forest department is located at the heart of the Bandipur forest. The location will be filled with spotted deers during the night hours. ","prop_meta_title":"Bandipur Nature Camp","prop_keywords":"Bandipur forest guest house booking, bandipur resorts, bandipur safari, bandipur tiger reserve","prop_activity":"<p>Bus Safari<\/p>\r\n<p>Jeep Safari<\/p>","prop_contactinfo":"<p>Karnataka Ecotourism Development Board<br />5th Floor, Vanavikas,<br />18th Cross Malleshwaram,&nbsp;<br />Bangalore &ndash; 560055<\/p>","properties_status":0}],"Rooms":[{"room_id":1,"room_type":"Chital I","properties_id":1,"room_description":"<p>Two bed accommodation<\/p>","room_remarks":"2 adults & 1 child below 8 years","minimum_stay":"1","no_of_rooms":"1","room_inclusive":"<p>Solar powered lights<\/p>\r\n<p>Hot water<\/p>\r\n<p>&nbsp;<\/p>\r\n<p>&nbsp;<\/p>","room_exclusive":"<p>AC<\/p>\r\n<p>TV<\/p>\r\n<p>Mini Fridge<\/p>\r\n<p>Parking<\/p>","room_checkin":"12.00 PM","room_checkout":"11.00 AM","room_status":0},{"room_id":2,"room_type":"Chital II","properties_id":1,"room_description":"<p>Two bed accommodation<\/p>","room_remarks":"2 adults & 1 child below 8 years","minimum_stay":"1","no_of_rooms":"1","room_inclusive":"<p>Solar powered lights<\/p>\r\n<p>Hot water<\/p>","room_exclusive":"<p>AC<\/p>\r\n<p>TV<\/p>\r\n<p>Mini fridge<\/p>","room_checkin":"12 00 PM","room_checkout":"11 00 AM","room_status":0},{"room_id":3,"room_type":"Harini I","properties_id":1,"room_description":"<p>Two bed accommodation<\/p>","room_remarks":"2 adults & 1 child below 8 years","minimum_stay":"1","no_of_rooms":"1","room_inclusive":"<p>Solar lights<\/p>\r\n<p>Hot water<\/p>","room_exclusive":"<p>TV<\/p>\r\n<p>AC<\/p>\r\n<p>Mini fridge<\/p>","room_checkin":"12 00 PM","room_checkout":"11 00 AM","room_status":0},{"room_id":4,"room_type":"Harini II","properties_id":1,"room_description":"<p>Two bed accommodation<\/p>","room_remarks":"2 adults & 1 child below 8 years","minimum_stay":"1","no_of_rooms":"1","room_inclusive":"<p>Hot water<\/p>\r\n<p>Solar powered lights<\/p>","room_exclusive":"<p>TV<\/p>\r\n<p>AC<\/p>\r\n<p>Mini fridge<\/p>","room_checkin":"12 00 PM","room_checkout":"11 00 AM","room_status":0},{"room_id":5,"room_type":"Kokila I","properties_id":1,"room_description":"<p>Two bed accommodation<\/p>","room_remarks":"2 adults & 1 child below 8 years","minimum_stay":"1","no_of_rooms":"1","room_inclusive":"<p>Solar powered lights<\/p>\r\n<p>Hot water<\/p>","room_exclusive":"<p>TV<\/p>\r\n<p>AC<\/p>\r\n<p>Parking<\/p>","room_checkin":"12 00 PM","room_checkout":"11 00 AM","room_status":0},{"room_id":6,"room_type":"Kokila II","properties_id":1,"room_description":"<p>Two bed accommodation<\/p>","room_remarks":"2 adults & 1 child below 8 years","minimum_stay":"1","no_of_rooms":"1","room_inclusive":"<p>Solar powered lights<\/p>\r\n<p>Hot water<\/p>","room_exclusive":"<p>TV<\/p>\r\n<p>AC<\/p>\r\n<p>Parking<\/p>","room_checkin":"12 00 PM","room_checkout":"11 00 AM","room_status":0},{"room_id":7,"room_type":"Papiha I","properties_id":1,"room_description":"<p>Two bed accommodation<\/p>","room_remarks":"2 adults & 1 child below 8 years","minimum_stay":"1","no_of_rooms":"1","room_inclusive":"<p>Solar powered lights<\/p>\r\n<p>Hot water<\/p>","room_exclusive":"<p>TV<\/p>\r\n<p>AC<br /><br /><\/p>\r\n<p>Parking<\/p>","room_checkin":"12 00 PM","room_checkout":"11 00 AM","room_status":0},{"room_id":8,"room_type":"Papiha II","properties_id":1,"room_description":"<p>Two bed accommodation<\/p>","room_remarks":"2 adults & 1 child below 8 years","minimum_stay":"1","no_of_rooms":"1","room_inclusive":"<p>Solar powered lights<\/p>\r\n<p>Hot water<\/p>","room_exclusive":"<p>TV<\/p>\r\n<p>AC<\/p>\r\n<p>Parking<\/p>","room_checkin":"12 00 PM","room_checkout":"11 00 AM","room_status":0},{"room_id":9,"room_type":"Vanaranjini I","properties_id":1,"room_description":"<p>Two bed accommodation<\/p>","room_remarks":"2 adults & 1 child below 8 years","minimum_stay":"1","no_of_rooms":"1","room_inclusive":"<p>Solar powered lights<\/p>\r\n<p>Hot water<\/p>","room_exclusive":"<p>TV<\/p>\r\n<p>AC<\/p>\r\n<p>Parking<\/p>","room_checkin":"12 00 PM","room_checkout":"11 00 AM","room_status":0},{"room_id":10,"room_type":"Vanaranjini II","properties_id":1,"room_description":"<p>two bed accommodation&nbsp;<\/p>","room_remarks":"2 adults & 1 child below 8 years","minimum_stay":"1","no_of_rooms":"1","room_inclusive":"<p>Solar powered lights<\/p>\r\n<p>Hot water<\/p>","room_exclusive":"<p>TV<\/p>\r\n<p>AC<\/p>\r\n<p>Parking<\/p>","room_checkin":"12 00 PM","room_checkout":"11 00 AM","room_status":0},{"room_id":11,"room_type":"Vanaranjini III","properties_id":1,"room_description":"<p>Two bed accommodation&nbsp;<\/p>","room_remarks":"2 adults & 1 child below 8 years","minimum_stay":"1","no_of_rooms":"1","room_inclusive":"<p>Solar powered lights<\/p>\r\n<p>Hot water<\/p>\r\n<p>&nbsp;<\/p>","room_exclusive":"<p>TV<\/p>\r\n<p>AC<\/p>\r\n<p>Parking<\/p>","room_checkin":"12 00 PM","room_checkout":"11 00 AM","room_status":0},{"room_id":12,"room_type":"Vanaranjini IV","properties_id":1,"room_description":"<p>Two Bed accommodation<\/p>","room_remarks":"2 adults & 1 child below 8 years","minimum_stay":"1","no_of_rooms":"1","room_inclusive":"<p>Solar Powered light<\/p>\r\n<p>Hot Water<\/p>\r\n<p>&nbsp;<\/p>","room_exclusive":"<p>TV<\/p>\r\n<p>AC<\/p>\r\n<p>Parking<\/p>","room_checkin":"12 00 PM","room_checkout":"11 00 AM","room_status":0},{"room_id":13,"room_type":"Vanashree I","properties_id":1,"room_description":"<p>Two bed accommodation<\/p>","room_remarks":"2 adults & 1 child below 8 years","minimum_stay":"1","no_of_rooms":"1","room_inclusive":"<p>Solar powered light<\/p>\r\n<p>Hot water<\/p>","room_exclusive":"<p>TV<\/p>\r\n<p>AC<\/p>\r\n<p>Parking<\/p>","room_checkin":"12 00 PM","room_checkout":"11 00 AM","room_status":0},{"room_id":14,"room_type":"Vanashree II","properties_id":1,"room_description":"<p>Two bed accommodation<\/p>","room_remarks":"2 adults & 1 child below 8 years","minimum_stay":"1","no_of_rooms":"1","room_inclusive":"<p>Solar powered light<\/p>\r\n<p>Hot water<\/p>","room_exclusive":"<p>TV<\/p>\r\n<p>AC<\/p>\r\n<p>Parking<\/p>","room_checkin":"12 00 PM","room_checkout":"11 00 AM","room_status":0},{"room_id":15,"room_type":"Vanashree III","properties_id":1,"room_description":"<p>Two bed accommodation<\/p>","room_remarks":"2 adults & 1 child below 8 years","minimum_stay":"1","no_of_rooms":"1","room_inclusive":"<p>Solar powered lights<\/p>\r\n<p>Hot water<\/p>","room_exclusive":"<p>TV<\/p>\r\n<p>AC<\/p>\r\n<p>Parking<\/p>","room_checkin":"12 00 PM","room_checkout":"11 00 AM","room_status":0},{"room_id":16,"room_type":"Vanashree IV","properties_id":1,"room_description":"<p>Two bed accommodation<\/p>","room_remarks":"2 adults & 1 child below 8 years","minimum_stay":"1","no_of_rooms":"1","room_inclusive":"<p>Solar powered lights<\/p>\r\n<p>Hot water<\/p>","room_exclusive":"<p>TV<\/p>\r\n<p>AC<\/p>\r\n<p>Parking<\/p>","room_checkin":"12 00 PM","room_checkout":"11 00 AM","room_status":0},{"room_id":17,"room_type":"Vanasuma","properties_id":1,"room_description":"<p>Two bed accommodation<\/p>","room_remarks":"2 adults & 1 child below 8 years","minimum_stay":"1","no_of_rooms":"1","room_inclusive":"<p>Solar powered light<\/p>\r\n<p>Hot water<\/p>","room_exclusive":"<p>TV<\/p>\r\n<p>AC<\/p>\r\n<p>Parking<\/p>","room_checkin":"12 00 PM","room_checkout":"11 00 AM","room_status":0},{"room_id":18,"room_type":"Vanashree V","properties_id":1,"room_description":"<p>Four bed accommodation<\/p>","room_remarks":"4 adults & 2 children below 8 years","minimum_stay":"1","no_of_rooms":"2","room_inclusive":"<p>Solar powered light<\/p>\r\n<p>Hot Water<\/p>","room_exclusive":"<p>TV<\/p>\r\n<p>AC<\/p>\r\n<p>Parking<\/p>","room_checkin":"12 00 PM","room_checkout":"11 00 AM","room_status":0},{"room_id":19,"room_type":"10 Bed Dormitory","properties_id":1,"room_description":"<p>10 bed Accommodation<\/p>","room_remarks":"10 adults ","minimum_stay":"1","no_of_rooms":"1","room_inclusive":"<p>Solar powered light<\/p>\r\n<p>Hot Water<\/p>","room_exclusive":"<p>TV<\/p>\r\n<p>AC<\/p>\r\n<p>Parking<\/p>","room_checkin":"12 00 PM","room_checkout":"11 00 AM","room_status":0},{"room_id":20,"room_type":"20 Bed Dormitory","properties_id":1,"room_description":"<p>20 bed accommodation<\/p>","room_remarks":"20 adults ","minimum_stay":"1","no_of_rooms":"1","room_inclusive":"<p>Solar powered light<\/p>\r\n<p>Hot Water<\/p>","room_exclusive":"<p>TV<\/p>\r\n<p>AC<\/p>\r\n<p>Parking<\/p>","room_checkin":"12 00 PM","room_checkout":"11 00 AM","room_status":0},{"room_id":21,"room_type":"9 Bed Dormitry","properties_id":1,"room_description":"<p>9 bed accommodation<\/p>","room_remarks":"9 adults","minimum_stay":"1","no_of_rooms":"1","room_inclusive":"<p>Solar powered light<\/p>\r\n<p>Hot Water<\/p>","room_exclusive":"<p>TV<\/p>\r\n<p>AC<\/p>\r\n<p>Parking<\/p>","room_checkin":"12 00 PM","room_checkout":"11 00 AM","room_status":0}]}
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
        private List<JungalStayBean> JungalStay;
        private List<RoomsBean> Rooms;

        public List<JungalStayBean> getJungalStay() {
            return JungalStay;
        }

        public void setJungalStay(List<JungalStayBean> JungalStay) {
            this.JungalStay = JungalStay;
        }

        public List<RoomsBean> getRooms() {
            return Rooms;
        }

        public void setRooms(List<RoomsBean> Rooms) {
            this.Rooms = Rooms;
        }

        public static class JungalStayBean {
            /**
             * properties_id : 1
             * orderno : 1
             * park_id : 2
             * properties_name : Bandipur Nature Camp
             * properties_description : <p>Bandipur nature camp consists of 2 bed, 4 bed accommodations and also has dormitories which can accommodate upto 20 people.&nbsp;</p>
             * prop_meta_desc : The cottages of Karnataka forest department is located at the heart of the Bandipur forest. The location will be filled with spotted deers during the night hours.
             * prop_meta_title : Bandipur Nature Camp
             * prop_keywords : Bandipur forest guest house booking, bandipur resorts, bandipur safari, bandipur tiger reserve
             * prop_activity : <p>Bus Safari</p>
             <p>Jeep Safari</p>
             * prop_contactinfo : <p>Karnataka Ecotourism Development Board<br />5th Floor, Vanavikas,<br />18th Cross Malleshwaram,&nbsp;<br />Bangalore &ndash; 560055</p>
             * properties_status : 0
             */

            private int properties_id;
            private int orderno;
            private int park_id;
            private String properties_name;
            private String properties_description;
            private String prop_meta_desc;
            private String prop_meta_title;
            private String prop_keywords;
            private String prop_activity;
            private String prop_contactinfo;
            private int properties_status;

            public int getProperties_id() {
                return properties_id;
            }

            public void setProperties_id(int properties_id) {
                this.properties_id = properties_id;
            }

            public int getOrderno() {
                return orderno;
            }

            public void setOrderno(int orderno) {
                this.orderno = orderno;
            }

            public int getPark_id() {
                return park_id;
            }

            public void setPark_id(int park_id) {
                this.park_id = park_id;
            }

            public String getProperties_name() {
                return properties_name;
            }

            public void setProperties_name(String properties_name) {
                this.properties_name = properties_name;
            }

            public String getProperties_description() {
                return properties_description;
            }

            public void setProperties_description(String properties_description) {
                this.properties_description = properties_description;
            }

            public String getProp_meta_desc() {
                return prop_meta_desc;
            }

            public void setProp_meta_desc(String prop_meta_desc) {
                this.prop_meta_desc = prop_meta_desc;
            }

            public String getProp_meta_title() {
                return prop_meta_title;
            }

            public void setProp_meta_title(String prop_meta_title) {
                this.prop_meta_title = prop_meta_title;
            }

            public String getProp_keywords() {
                return prop_keywords;
            }

            public void setProp_keywords(String prop_keywords) {
                this.prop_keywords = prop_keywords;
            }

            public String getProp_activity() {
                return prop_activity;
            }

            public void setProp_activity(String prop_activity) {
                this.prop_activity = prop_activity;
            }

            public String getProp_contactinfo() {
                return prop_contactinfo;
            }

            public void setProp_contactinfo(String prop_contactinfo) {
                this.prop_contactinfo = prop_contactinfo;
            }

            public int getProperties_status() {
                return properties_status;
            }

            public void setProperties_status(int properties_status) {
                this.properties_status = properties_status;
            }
        }

        public static class RoomsBean {
            /**
             * room_id : 1
             * room_type : Chital I
             * properties_id : 1
             * room_description : <p>Two bed accommodation</p>
             * room_remarks : 2 adults & 1 child below 8 years
             * minimum_stay : 1
             * no_of_rooms : 1
             * room_inclusive : <p>Solar powered lights</p>
             <p>Hot water</p>
             <p>&nbsp;</p>
             <p>&nbsp;</p>
             * room_exclusive : <p>AC</p>
             <p>TV</p>
             <p>Mini Fridge</p>
             <p>Parking</p>
             * room_checkin : 12.00 PM
             * room_checkout : 11.00 AM
             * room_status : 0
             */

            private int room_id;
            private String room_type;
            private int properties_id;
            private String room_description;
            private String room_remarks;
            private String minimum_stay;
            private String no_of_rooms;
            private String room_inclusive;
            private String room_exclusive;
            private String room_checkin;
            private String room_checkout;
            private int room_status;

            public int getRoom_id() {
                return room_id;
            }

            public void setRoom_id(int room_id) {
                this.room_id = room_id;
            }

            public String getRoom_type() {
                return room_type;
            }

            public void setRoom_type(String room_type) {
                this.room_type = room_type;
            }

            public int getProperties_id() {
                return properties_id;
            }

            public void setProperties_id(int properties_id) {
                this.properties_id = properties_id;
            }

            public String getRoom_description() {
                return room_description;
            }

            public void setRoom_description(String room_description) {
                this.room_description = room_description;
            }

            public String getRoom_remarks() {
                return room_remarks;
            }

            public void setRoom_remarks(String room_remarks) {
                this.room_remarks = room_remarks;
            }

            public String getMinimum_stay() {
                return minimum_stay;
            }

            public void setMinimum_stay(String minimum_stay) {
                this.minimum_stay = minimum_stay;
            }

            public String getNo_of_rooms() {
                return no_of_rooms;
            }

            public void setNo_of_rooms(String no_of_rooms) {
                this.no_of_rooms = no_of_rooms;
            }

            public String getRoom_inclusive() {
                return room_inclusive;
            }

            public void setRoom_inclusive(String room_inclusive) {
                this.room_inclusive = room_inclusive;
            }

            public String getRoom_exclusive() {
                return room_exclusive;
            }

            public void setRoom_exclusive(String room_exclusive) {
                this.room_exclusive = room_exclusive;
            }

            public String getRoom_checkin() {
                return room_checkin;
            }

            public void setRoom_checkin(String room_checkin) {
                this.room_checkin = room_checkin;
            }

            public String getRoom_checkout() {
                return room_checkout;
            }

            public void setRoom_checkout(String room_checkout) {
                this.room_checkout = room_checkout;
            }

            public int getRoom_status() {
                return room_status;
            }

            public void setRoom_status(int room_status) {
                this.room_status = room_status;
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
