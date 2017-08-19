package com.myecotrip.myecotrip.home.fargmentHome;

import com.google.gson.annotations.SerializedName;
import com.myecotrip.myecotrip.base.CommonModel;

import java.util.List;

/**
 * Created by Gopal kumar on 04-06-2017.
 */

public class CategoryRowData extends CommonModel{


    /**
     * content : {"categories":[{"category_id":1,"category_name":"Ecotrails","image_url":"/public/images/Ecotrails-homepage-icon.jpg"},{"category_id":2,"category_name":"Bird Sanctuary","image_url":"/public/images/ranganathittu3.jpg"},{"category_id":3,"category_name":"Jungle Stay","image_url":"/public/images/sunkadakatte.jpg"},{"category_id":4,"category_name":"Wildlife Safari","image_url":"/public/images/safarihomepageiconjpg.jpg"}]}
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
        private List<CategoriesBean> categories;

        public List<CategoriesBean> getCategories() {
            return categories;
        }

        public void setCategories(List<CategoriesBean> categories) {
            this.categories = categories;
        }

        public static class CategoriesBean {
            /**
             * category_id : 1
             * category_name : Ecotrails
             * image_url : /public/images/Ecotrails-homepage-icon.jpg
             */

            private int category_id;
            private String category_name;
            private String image_url;

            public int getCategory_id() {
                return category_id;
            }

            public void setCategory_id(int category_id) {
                this.category_id = category_id;
            }

            public String getCategory_name() {
                return category_name;
            }

            public void setCategory_name(String category_name) {
                this.category_name = category_name;
            }

            public String getImage_url() {
                return image_url;
            }

            public void setImage_url(String image_url) {
                this.image_url = image_url;
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
