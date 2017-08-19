package com.myecotrip.myecotrip.details.wildSafari;

import com.google.gson.annotations.SerializedName;
import com.myecotrip.myecotrip.base.CommonModel;

import java.util.List;

/**
 * Created by Gopal kumar on 15-07-2017.
 */

public class WildsafariResponse extends CommonModel {


    /**
     * content : {"Safari":[{"safari_id":4,"orderno":4,"park_id":4,"safari_name":"Jeep Safari","safari_meta_title":"Dandeli Safari","safari_meta_desc":"Acitivities at Kali tiger reserve\r\nWhite-water rafting\r\nKayaking\r\nTrekking/Bird watching\r\nWildlife safari","safari_keywords":"White-water rafting, Kayaking, Trekking/Bird watching, Wildlife safari, dandeli safari, kali safari","safari_description":"<p>The Kali Tiger Reserve is home to the elusive black panther. Spotted Deer, gaur, sloth bear, barking deer, hornbills, yellow-footed pigeon, peafowl and the crested serpent eagle are often sighted. If you&rsquo;re quiet, you&rsquo;ll spot even more.<\/p>","safari_includes":"<p>Jeep Safari<\/p>\r\n<p>Forest entry fee<\/p>","safari_excludes":"<p>Parking fee<\/p>\r\n<p>Naturalist fee<\/p>","transportation_id":3,"safari_status":0}],"Galary":[{"safari_image_id":24,"safari_id":4,"i_small":"1477046641_200_0.JPG","i_large":"1477046641_900_0.JPG","safari_image_status":0},{"safari_image_id":25,"safari_id":4,"i_small":"1477046704_200_0.JPG","i_large":"1477046704_900_0.JPG","safari_image_status":0}]}
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
        private List<SafariBean> Safari;
        private List<GalaryBean> Galary;

        public List<SafariBean> getSafari() {
            return Safari;
        }

        public void setSafari(List<SafariBean> Safari) {
            this.Safari = Safari;
        }

        public List<GalaryBean> getGalary() {
            return Galary;
        }

        public void setGalary(List<GalaryBean> Galary) {
            this.Galary = Galary;
        }

        public static class SafariBean {
            /**
             * safari_id : 4
             * orderno : 4
             * park_id : 4
             * safari_name : Jeep Safari
             * safari_meta_title : Dandeli Safari
             * safari_meta_desc : Acitivities at Kali tiger reserve
             White-water rafting
             Kayaking
             Trekking/Bird watching
             Wildlife safari
             * safari_keywords : White-water rafting, Kayaking, Trekking/Bird watching, Wildlife safari, dandeli safari, kali safari
             * safari_description : <p>The Kali Tiger Reserve is home to the elusive black panther. Spotted Deer, gaur, sloth bear, barking deer, hornbills, yellow-footed pigeon, peafowl and the crested serpent eagle are often sighted. If you&rsquo;re quiet, you&rsquo;ll spot even more.</p>
             * safari_includes : <p>Jeep Safari</p>
             <p>Forest entry fee</p>
             * safari_excludes : <p>Parking fee</p>
             <p>Naturalist fee</p>
             * transportation_id : 3
             * safari_status : 0
             */

            private int safari_id;
            private int orderno;
            private int park_id;
            private String safari_name;
            private String safari_meta_title;
            private String safari_meta_desc;
            private String safari_keywords;
            private String safari_description;
            private String safari_includes;
            private String safari_excludes;
            private int transportation_id;
            private int safari_status;

            public int getSafari_id() {
                return safari_id;
            }

            public void setSafari_id(int safari_id) {
                this.safari_id = safari_id;
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

            public String getSafari_name() {
                return safari_name;
            }

            public void setSafari_name(String safari_name) {
                this.safari_name = safari_name;
            }

            public String getSafari_meta_title() {
                return safari_meta_title;
            }

            public void setSafari_meta_title(String safari_meta_title) {
                this.safari_meta_title = safari_meta_title;
            }

            public String getSafari_meta_desc() {
                return safari_meta_desc;
            }

            public void setSafari_meta_desc(String safari_meta_desc) {
                this.safari_meta_desc = safari_meta_desc;
            }

            public String getSafari_keywords() {
                return safari_keywords;
            }

            public void setSafari_keywords(String safari_keywords) {
                this.safari_keywords = safari_keywords;
            }

            public String getSafari_description() {
                return safari_description;
            }

            public void setSafari_description(String safari_description) {
                this.safari_description = safari_description;
            }

            public String getSafari_includes() {
                return safari_includes;
            }

            public void setSafari_includes(String safari_includes) {
                this.safari_includes = safari_includes;
            }

            public String getSafari_excludes() {
                return safari_excludes;
            }

            public void setSafari_excludes(String safari_excludes) {
                this.safari_excludes = safari_excludes;
            }

            public int getTransportation_id() {
                return transportation_id;
            }

            public void setTransportation_id(int transportation_id) {
                this.transportation_id = transportation_id;
            }

            public int getSafari_status() {
                return safari_status;
            }

            public void setSafari_status(int safari_status) {
                this.safari_status = safari_status;
            }
        }

        public static class GalaryBean {
            /**
             * safari_image_id : 24
             * safari_id : 4
             * i_small : 1477046641_200_0.JPG
             * i_large : 1477046641_900_0.JPG
             * safari_image_status : 0
             */

            private int safari_image_id;
            private int safari_id;
            private String i_small;
            private String i_large;
            private int safari_image_status;

            public int getSafari_image_id() {
                return safari_image_id;
            }

            public void setSafari_image_id(int safari_image_id) {
                this.safari_image_id = safari_image_id;
            }

            public int getSafari_id() {
                return safari_id;
            }

            public void setSafari_id(int safari_id) {
                this.safari_id = safari_id;
            }

            public String getI_small() {
                return i_small;
            }

            public void setI_small(String i_small) {
                this.i_small = i_small;
            }

            public String getI_large() {
                return i_large;
            }

            public void setI_large(String i_large) {
                this.i_large = i_large;
            }

            public int getSafari_image_status() {
                return safari_image_status;
            }

            public void setSafari_image_status(int safari_image_status) {
                this.safari_image_status = safari_image_status;
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
