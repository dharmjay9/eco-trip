package com.myecotrip.myecotrip.listing.newListing;

import com.google.gson.annotations.SerializedName;
import com.myecotrip.myecotrip.base.CommonModel;

import java.util.List;

/**
 * Created by Gopal kumar on 09-06-2017.
 */

public class SubCategoryRowData extends CommonModel{


    /**
     * content : [{"id":2,"name":"Bangalore","logo":"/assets/img/landscape/1502456166.jpg","display_order_no":1,"status":1,"created_at":"2017-08-08 14:23:51","updated_at":"2017-08-11 07:26:06","trailCount":3}]
     * response : {"status-code":200,"error":0,"sys_msg":"","message":"Success"}
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

    public static class ContentBean {
        /**
         * id : 2
         * name : Bangalore
         * logo : /assets/img/landscape/1502456166.jpg
         * display_order_no : 1
         * status : 1
         * created_at : 2017-08-08 14:23:51
         * updated_at : 2017-08-11 07:26:06
         * trailCount : 3
         */

        private int id;
        private String name;
        private String logo;
        private int display_order_no;
        private int status;
        private String created_at;
        private String updated_at;
        private int trailCount;

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

        public String getLogo() {
            return logo;
        }

        public void setLogo(String logo) {
            this.logo = logo;
        }

        public int getDisplay_order_no() {
            return display_order_no;
        }

        public void setDisplay_order_no(int display_order_no) {
            this.display_order_no = display_order_no;
        }

        public int getStatus() {
            return status;
        }

        public void setStatus(int status) {
            this.status = status;
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

        public int getTrailCount() {
            return trailCount;
        }

        public void setTrailCount(int trailCount) {
            this.trailCount = trailCount;
        }
    }
}
