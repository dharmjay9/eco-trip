package com.myecotrip.myecotrip.login;

import com.google.gson.annotations.SerializedName;
import com.myecotrip.myecotrip.base.CommonModel;



public class LoginResponse extends CommonModel{
    /**
     * content : {"userId":5,"userName":"Vinay","last_name":"A N","contact_no":"8861422700","email":"vinayan17@gmail.com","country":"India"}
     * response : {"status-code":200,"error":0,"sys_msg":"","message":"Login Success"}
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
         * userId : 5
         * userName : Vinay
         * last_name : A N
         * contact_no : 8861422700
         * email : vinayan17@gmail.com
         * country : India
         */

        private int userId;
        private String userName;
        private String last_name;
        private String contact_no;
        private String email;
        private String country;

        public int getUserId() {
            return userId;
        }

        public void setUserId(int userId) {
            this.userId = userId;
        }

        public String getUserName() {
            return userName;
        }

        public void setUserName(String userName) {
            this.userName = userName;
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

        public String getEmail() {
            return email;
        }

        public void setEmail(String email) {
            this.email = email;
        }

        public String getCountry() {
            return country;
        }

        public void setCountry(String country) {
            this.country = country;
        }
    }

    public static class ResponseBean {
        /**
         * status-code : 200
         * error : 0
         * sys_msg :
         * message : Login Success
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




/*

    *//**
     * content : {"userId":8,"userName":"Vinay"}
     * response : {"status-code":200,"error":0,"sys_msg":"","message":"Login Success"}
     *//*



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

        *//**
         * id : 7
         * first_name : abcd
         * last_name : xyz
         * contact_no : 8852103645
         * country : India
         *//*

        private int id;
        private String first_name;
        private String last_name;
        private String contact_no;
        private String country;

        private int userId;
        private String userName;
        private String email;


        *//**
         * content : {"userId":5,"userName":"Vinay","last_name":"A N","contact_no":"8861422700","email":"vinayan17@gmail.com","country":"India"}
         * response : {"status-code":200,"error":0,"sys_msg":"","message":"Login Success"}
         *//*

        private ResponseBean response;

        public int getId() {
            return id;
        }

        public void setId(int id) {
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

        public int getUserId() {
            return userId;
        }

        public void setUserId(int userId) {
            this.userId = userId;
        }

        public String getUserName() {
            return userName;
        }

        public void setUserName(String userName) {
            this.userName = userName;
        }

        public String getEmail() {
            return email;
        }

        public void setEmail(String email) {
            this.email = email;
        }
        public ResponseBean getResponse() {
            return response;
        }

        public void setResponse(ResponseBean response) {
            this.response = response;
        }



        public static class ResponseBean {
            *//**
             * status-code : 200
             * error : 0
             * sys_msg :
             * message : Login Success
             *//*

            private String message;

            public String getMessage() {
                return message;
            }

            public void setMessage(String message) {
                this.message = message;
            }
        }
    }

    public static class ResponseBean {
        *//**
         * status-code : 200
         * error : 0
         * sys_msg :
         * message : Login Success
         *//*

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
    }*/
}
