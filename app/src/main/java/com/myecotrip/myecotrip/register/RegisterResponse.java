package com.myecotrip.myecotrip.register;

import com.google.gson.annotations.SerializedName;
import com.myecotrip.myecotrip.base.CommonModel;

/**
 * Created by Gopal kumar on 04-06-2017.
 */

public class RegisterResponse extends CommonModel{


    /**
     * content : {"id":11,"name":"asdas"}
     * response : {"status-code":200,"error":0,"sys_msg":"","message":"Successfully created!"}
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
         * id : 11
         * name : asdas
         */

        private int id;
        private String name;

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }
    }

    public static class ResponseBean {
        /**
         * status-code : 200
         * error : 0
         * sys_msg :
         * message : Successfully created!
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
