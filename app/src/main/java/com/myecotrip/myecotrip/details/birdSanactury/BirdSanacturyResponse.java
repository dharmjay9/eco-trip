package com.myecotrip.myecotrip.details.birdSanactury;

import com.google.gson.annotations.SerializedName;
import com.myecotrip.myecotrip.base.CommonModel;

import java.util.List;

/**
 * Created by Gopal kumar on 15-07-2017.
 */

public class BirdSanacturyResponse extends CommonModel {


    /**
     * content : {"BirdSanctuary":[{"park_id":5,"orderno":"5","park_name":"Bhadra Tiger Reserve","park_type":"Tiger Reserve","park_description":"<p>&ldquo;Where the tiger roams free and the bamboo sways to the winds, then it must be the Jagara valley&rdquo; &hellip; goes an old jungle saying. Tucked away amidst the lofty peaks of the Western ghats, the Bhadra&nbsp; Tiger Reserve is one of the India&rsquo;s treasured Tiger Reserve. An enchanting forested valley ringed all around by the lofty Bababudan Hills. The Jagara Valley is the emerging stronghold for the tiger.<\/p>\r\n<p>&nbsp;Spread over an area of 5741.84 sq km in the Malnad districts of Chikmaglur and Shimoga in Karnataka. Bhadra is a mosaic of different habitats with Bamboo being very common. Dry deciduous forests border the northern parts, enclosing a huge reservoir, while taller moist deciduous trees frame the south. In the east, the land is hirsute with Shola evergreen trees. Many valuable tree species grow here, which include Teak, Rosewood, Mathi, Honne, Nandi, Tadasalu and Kindal.<\/p>\r\n<p>&nbsp;The high hills all around and the moist forests in the valley with small streams and rivulets cutting across form a great habitat for the wildlife. What makes Bhadra Tiger Reserve unique is the recent success of having a successful voluntary resettlement programme where over 4000 people of&nbsp; 11 villages voluntarily made way for the National animal to thrive. The resultant bouncing back of the tigers and the prey is a great learning for the world. This successful voluntary resettlement programme is an historic first in modern times and is a great example across the world to restore the tiger&rsquo;s habitat.<\/p>\r\n<p>&nbsp;As with the Western Ghats forests, the forests of Bhadra have a way of revealing itself layer by layer, if you watch patiently. It&rsquo;s when you are admiring such sights that a flash of willful and tantalizing jungle magic can happen. A sharp warning call of Sambhar and a&nbsp; flying squirrel darting across the thick foliage, showing you that there is so much to be uncovered. The senses are on high alert &ndash; you realize that you are being watched even as you strain to catch a glimpse of the unusual.<\/p>","park_meta_desc":"Named after the river Bhadra that meanders through the lush forests, the Reserve boasts of a good tiger population and was declared the 25th Reserve of Indian in 1998","park_meta_title":"Bhadra Tiger Reserve","keywords":"\"bhadra tiger reserve accommodation, \r\nbhadra tiger reserve buffer zone, bhadra tiger reserve documentary, bhadra tiger reserve forest, bhadra tiger reserve hotels, jungle lodges bhadra tiger reserve, bhadra tiger reserve map, bhadra tiger reserve photos, bhadra tiger reserve resort, bhadra tiger reserve safari timming, bhadra tiger reserve tripadvisor, bhadra tiger reserve stay, bhadra wildlife sanctuary jungle lodges\"\r\n","safari":1,"properties":1,"park":0,"ecotrails":0,"zoo":1,"park_city":"Chikkamagaluru","logo":"0bhadra.jpg.jpg","park_directions":"<table style=\"height: 37px;\" width=\"237\">\r\n<tbody>\r\n<tr>\r\n<td width=\"118\">Bangalore-Hassan-Chikmagalur<\/td>\r\n<\/tr>\r\n<\/tbody>\r\n<\/table>","park_transportation":"<p>Train Journey / Nearest Railway Station : <br />On the train journey Bhadra Tiger Reserve is accessible from Hassan rail head which is connected with Mangalore &amp; Bangalore. <br />Road Travel / Bus Route : <br />For the Road Journey to Bhadra Tiger Reserve national highway 48 Bangalore Hassan is the best option. Regular bus is available. National highway 4 with a side road from Bange is another alternative.<br />Air Travel / Nearest Airport : <br />For the Air travel to Bhadra Tiger Reserve, Mangalore [190KM] and Bangalore [285 KM] are the nearest airports, you can chose according to your entire tour of South India.<\/p>\r\n<p>&nbsp;<\/p>","map_url":"https://www.google.com/maps/embed?pb=!1m18!1m12!1m3!1d3880.4409785761027!2d75.57205801489947!3d13.446892307908632!2m3!1f0!2f0!3f0!3m2!1i1024!2i768!4f13.1!3m3!1m2!1s0x3bbb2029086af8a9%3A0xacab84f30b64a71d!2sBhadra+Wildlife+Sanctuary!5e0!3m2!1sen!2sin!4v1476111302600\" ","park_status":0}],"Activities":[{"activity_id":1,"orderno":"1","park_id":5,"activity_name":"Disturb Lion","activity_description":"<p>Put some chilly powder in lions eye<\/p>","timings":"5 AM to 11AM","ticket_count":"30","activity_status":0},{"activity_id":3,"orderno":"3","park_id":5,"activity_name":"Lie on Tiger ","activity_description":"<p>Nothing<\/p>","timings":"5 AM to 11AM","ticket_count":"30","activity_status":0}]}
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
        private List<BirdSanctuaryBean> BirdSanctuary;
        private List<ActivitiesBean> Activities;

        public List<BirdSanctuaryBean> getBirdSanctuary() {
            return BirdSanctuary;
        }

        public void setBirdSanctuary(List<BirdSanctuaryBean> BirdSanctuary) {
            this.BirdSanctuary = BirdSanctuary;
        }

        public List<ActivitiesBean> getActivities() {
            return Activities;
        }

        public void setActivities(List<ActivitiesBean> Activities) {
            this.Activities = Activities;
        }

        public static class BirdSanctuaryBean {
            /**
             * park_id : 5
             * orderno : 5
             * park_name : Bhadra Tiger Reserve
             * park_type : Tiger Reserve
             * park_description : <p>&ldquo;Where the tiger roams free and the bamboo sways to the winds, then it must be the Jagara valley&rdquo; &hellip; goes an old jungle saying. Tucked away amidst the lofty peaks of the Western ghats, the Bhadra&nbsp; Tiger Reserve is one of the India&rsquo;s treasured Tiger Reserve. An enchanting forested valley ringed all around by the lofty Bababudan Hills. The Jagara Valley is the emerging stronghold for the tiger.</p>
             <p>&nbsp;Spread over an area of 5741.84 sq km in the Malnad districts of Chikmaglur and Shimoga in Karnataka. Bhadra is a mosaic of different habitats with Bamboo being very common. Dry deciduous forests border the northern parts, enclosing a huge reservoir, while taller moist deciduous trees frame the south. In the east, the land is hirsute with Shola evergreen trees. Many valuable tree species grow here, which include Teak, Rosewood, Mathi, Honne, Nandi, Tadasalu and Kindal.</p>
             <p>&nbsp;The high hills all around and the moist forests in the valley with small streams and rivulets cutting across form a great habitat for the wildlife. What makes Bhadra Tiger Reserve unique is the recent success of having a successful voluntary resettlement programme where over 4000 people of&nbsp; 11 villages voluntarily made way for the National animal to thrive. The resultant bouncing back of the tigers and the prey is a great learning for the world. This successful voluntary resettlement programme is an historic first in modern times and is a great example across the world to restore the tiger&rsquo;s habitat.</p>
             <p>&nbsp;As with the Western Ghats forests, the forests of Bhadra have a way of revealing itself layer by layer, if you watch patiently. It&rsquo;s when you are admiring such sights that a flash of willful and tantalizing jungle magic can happen. A sharp warning call of Sambhar and a&nbsp; flying squirrel darting across the thick foliage, showing you that there is so much to be uncovered. The senses are on high alert &ndash; you realize that you are being watched even as you strain to catch a glimpse of the unusual.</p>
             * park_meta_desc : Named after the river Bhadra that meanders through the lush forests, the Reserve boasts of a good tiger population and was declared the 25th Reserve of Indian in 1998
             * park_meta_title : Bhadra Tiger Reserve
             * keywords : "bhadra tiger reserve accommodation,
             bhadra tiger reserve buffer zone, bhadra tiger reserve documentary, bhadra tiger reserve forest, bhadra tiger reserve hotels, jungle lodges bhadra tiger reserve, bhadra tiger reserve map, bhadra tiger reserve photos, bhadra tiger reserve resort, bhadra tiger reserve safari timming, bhadra tiger reserve tripadvisor, bhadra tiger reserve stay, bhadra wildlife sanctuary jungle lodges"

             * safari : 1
             * properties : 1
             * park : 0
             * ecotrails : 0
             * zoo : 1
             * park_city : Chikkamagaluru
             * logo : 0bhadra.jpg.jpg
             * park_directions : <table style="height: 37px;" width="237">
             <tbody>
             <tr>
             <td width="118">Bangalore-Hassan-Chikmagalur</td>
             </tr>
             </tbody>
             </table>
             * park_transportation : <p>Train Journey / Nearest Railway Station : <br />On the train journey Bhadra Tiger Reserve is accessible from Hassan rail head which is connected with Mangalore &amp; Bangalore. <br />Road Travel / Bus Route : <br />For the Road Journey to Bhadra Tiger Reserve national highway 48 Bangalore Hassan is the best option. Regular bus is available. National highway 4 with a side road from Bange is another alternative.<br />Air Travel / Nearest Airport : <br />For the Air travel to Bhadra Tiger Reserve, Mangalore [190KM] and Bangalore [285 KM] are the nearest airports, you can chose according to your entire tour of South India.</p>
             <p>&nbsp;</p>
             * map_url : https://www.google.com/maps/embed?pb=!1m18!1m12!1m3!1d3880.4409785761027!2d75.57205801489947!3d13.446892307908632!2m3!1f0!2f0!3f0!3m2!1i1024!2i768!4f13.1!3m3!1m2!1s0x3bbb2029086af8a9%3A0xacab84f30b64a71d!2sBhadra+Wildlife+Sanctuary!5e0!3m2!1sen!2sin!4v1476111302600"
             * park_status : 0
             */

            private int park_id;
            private String orderno;
            private String park_name;
            private String park_type;
            private String park_description;
            private String park_meta_desc;
            private String park_meta_title;
            private String keywords;
            private int safari;
            private int properties;
            private int park;
            private int ecotrails;
            private int zoo;
            private String park_city;
            private String logo;
            private String park_directions;
            private String park_transportation;
            private String map_url;
            private int park_status;

            public int getPark_id() {
                return park_id;
            }

            public void setPark_id(int park_id) {
                this.park_id = park_id;
            }

            public String getOrderno() {
                return orderno;
            }

            public void setOrderno(String orderno) {
                this.orderno = orderno;
            }

            public String getPark_name() {
                return park_name;
            }

            public void setPark_name(String park_name) {
                this.park_name = park_name;
            }

            public String getPark_type() {
                return park_type;
            }

            public void setPark_type(String park_type) {
                this.park_type = park_type;
            }

            public String getPark_description() {
                return park_description;
            }

            public void setPark_description(String park_description) {
                this.park_description = park_description;
            }

            public String getPark_meta_desc() {
                return park_meta_desc;
            }

            public void setPark_meta_desc(String park_meta_desc) {
                this.park_meta_desc = park_meta_desc;
            }

            public String getPark_meta_title() {
                return park_meta_title;
            }

            public void setPark_meta_title(String park_meta_title) {
                this.park_meta_title = park_meta_title;
            }

            public String getKeywords() {
                return keywords;
            }

            public void setKeywords(String keywords) {
                this.keywords = keywords;
            }

            public int getSafari() {
                return safari;
            }

            public void setSafari(int safari) {
                this.safari = safari;
            }

            public int getProperties() {
                return properties;
            }

            public void setProperties(int properties) {
                this.properties = properties;
            }

            public int getPark() {
                return park;
            }

            public void setPark(int park) {
                this.park = park;
            }

            public int getEcotrails() {
                return ecotrails;
            }

            public void setEcotrails(int ecotrails) {
                this.ecotrails = ecotrails;
            }

            public int getZoo() {
                return zoo;
            }

            public void setZoo(int zoo) {
                this.zoo = zoo;
            }

            public String getPark_city() {
                return park_city;
            }

            public void setPark_city(String park_city) {
                this.park_city = park_city;
            }

            public String getLogo() {
                return logo;
            }

            public void setLogo(String logo) {
                this.logo = logo;
            }

            public String getPark_directions() {
                return park_directions;
            }

            public void setPark_directions(String park_directions) {
                this.park_directions = park_directions;
            }

            public String getPark_transportation() {
                return park_transportation;
            }

            public void setPark_transportation(String park_transportation) {
                this.park_transportation = park_transportation;
            }

            public String getMap_url() {
                return map_url;
            }

            public void setMap_url(String map_url) {
                this.map_url = map_url;
            }

            public int getPark_status() {
                return park_status;
            }

            public void setPark_status(int park_status) {
                this.park_status = park_status;
            }
        }

        public static class ActivitiesBean {
            /**
             * activity_id : 1
             * orderno : 1
             * park_id : 5
             * activity_name : Disturb Lion
             * activity_description : <p>Put some chilly powder in lions eye</p>
             * timings : 5 AM to 11AM
             * ticket_count : 30
             * activity_status : 0
             */

            private int activity_id;
            private String orderno;
            private int park_id;
            private String activity_name;
            private String activity_description;
            private String timings;
            private String ticket_count;
            private int activity_status;

            public int getActivity_id() {
                return activity_id;
            }

            public void setActivity_id(int activity_id) {
                this.activity_id = activity_id;
            }

            public String getOrderno() {
                return orderno;
            }

            public void setOrderno(String orderno) {
                this.orderno = orderno;
            }

            public int getPark_id() {
                return park_id;
            }

            public void setPark_id(int park_id) {
                this.park_id = park_id;
            }

            public String getActivity_name() {
                return activity_name;
            }

            public void setActivity_name(String activity_name) {
                this.activity_name = activity_name;
            }

            public String getActivity_description() {
                return activity_description;
            }

            public void setActivity_description(String activity_description) {
                this.activity_description = activity_description;
            }

            public String getTimings() {
                return timings;
            }

            public void setTimings(String timings) {
                this.timings = timings;
            }

            public String getTicket_count() {
                return ticket_count;
            }

            public void setTicket_count(String ticket_count) {
                this.ticket_count = ticket_count;
            }

            public int getActivity_status() {
                return activity_status;
            }

            public void setActivity_status(int activity_status) {
                this.activity_status = activity_status;
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
