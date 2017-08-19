package com.myecotrip.myecotrip.details.ecoTrail;

import com.google.gson.annotations.SerializedName;
import com.myecotrip.myecotrip.base.CommonModel;

import java.util.List;

/**
 * Created by Gopal kumar on 17-08-2017.
 */

public class TrailDetailsResponse extends CommonModel {


    /**
     * content : {"id":5,"landscape_id":2,"park_id":2,"name":"Savanadurga","range":"Savanadurga","display_order_no":1,"max_trekkers":40,"distance":"4.5","distance_unit":"Kms","hours":"2","minutes":"30","type":"Hard","description":"<p>Alone Nandi sits on top, overlooking vast swathes of fields, small towns, and hillocks at a distance. He is witness to historical events that have occurred here over centuries. The small mantap where he rests marks the end of the trekking trail at Savandurga, one of the largest monolithic rocks in Asia. Situated about 7 miles from Magadi town, Savandurga has become one of the many trekking hot-spots around Bangalore, testing the rock climbing skills of enthusiasts.<\/p>\n                    <p>Named Savandurga by Immadi Kempe Gauda, this hill fortress was believed to be unconquerable until the British took over in 1791; Lord Cornwallis has written a detailed account about its capture. The hill looks imposing as one drives closer to it and it is easy to understand why it is called the \u2018rock of death.\u2019 The Nandi mantap looks like a small square on top and all visible sides of the rock look steep and dangerous; only upon reaching the base does one see the rock\u2019s gentle slopes.<\/p>\n\t\t\t\t\t<p>Savandurga has a lot to offer, the base of the temple is surrounded by a forest; with thick bamboo groves and dense shrubs, some part of the forest has now been converted to an herbal plantation and is open for people to explore. The forest has close to 60 species of trees.  A lot of these trees are used for local herbal medicines<\/p>\n\t\t\t\t\t<p>Apart from this, there are two temples \u2013 Sri Savandi Veerabhadraswamy Temple and Lakshmi Narashima Temple. The former temple is of Dravidian style and situated inside a courtyard; the structure is beautiful and worth a visit. The latter temple, though, is an old temple which has been renovated and painted, thus losing some of its old-world charm.<\/p>\n\t\t\t\t\t<p>The initial stretch of the Savandurga trek is on bare rock with small boulders, and it is better if the trek is started just as the day breaks. As one gains height, the Arkavati River surrounded by green trees becomes visible at a distance<\/p>\n\t\t\t\t\t<p>A short while into the trek, one encounters the first of the many remains of the fort walls. This spot is well-suited for enjoying some rest in the shade that the trees here have to offer; the next shaded patch comes along only after a long distance. If you observe birds that hop around, the chances of finding a Blue Rock Thrush, White-browed Bulbul or Rock Agamas are high around this area.<\/p>\n\t\t\t\t\t<p>The steepest climb of the trek lies beyond this stop, and takes one to the next fort wall, post which it is a gradual incline. The rock has some depression here and it is quite possible that rain water wall collected here during the good old days. Closer to the top, one come across some trees and dilapidated old structures which are currently used as a place to camp or cook. This is also the place where one is likely to find Oriental Honey Buzzards perched on tree-tops . At the slightest disturbance, they take to the air.<\/p>\n\t\t\t\t\t<p>The last leg of the trek breaks the monotony of walking on the rock with the sun blazing down; one now needs to walk under gigantic boulders. Stretches along this leg are strewn with Plumeria, and the air has the whiff of wild-flowers and resonates with bird calls. It is also a spot where one has a chance to sight the Elusive Yellow Throted Bulbul.<\/p>","logo":"/assets/img/trails/1502436148.png","starting_point":"Bettada Dari","ending_point":"Kempegowda Fort","reporting_time":"0900 Hrs to 1700 Hrs","when_to_visit":"All year round","incharger_details":["A C Mahesh","Forest Guard","+91 90085 97184"],"general_instruction":"Private Vehicle can approach the starting point","meta_title":"Savanadurga","meta_description":"Savanadurga","meta_keywords":"Savanadurga","direction":"","transportation":"","map_url":"<iframe src=\"https://www.google.com/maps/embed?pb=!1m18!1m12!1m3!1d62226.00834511383!2d77.26556972490246!3d12.899649359668858!2m3!1f0!2f0!3f0!3m2!1i1024!2i768!4f13.1!3m3!1m2!1s0x3bae3664f8d60951%3A0x7d23470068713f8f!2sSavandurga+Hill!5e0!3m2!1sen!2sin!4v1502436124275\" width=\"600\" height=\"450\" frameborder=\"0\" style=\"border:0\" allowfullscreen><\/iframe>","status":1,"created_at":"2017-08-11 01:52:28","updated_at":"2017-08-11 01:52:28","pricePerPerson":450,"trailImages":[{"id":1,"trail_id":5,"name":"/assets/img/trails/14/15027823570.JPG","status":1,"created_at":"2017-08-15 02:02:37","updated_at":"2017-08-15 02:02:37"},{"id":2,"trail_id":5,"name":"/assets/img/trails/14/15027823571.JPG","status":1,"created_at":"2017-08-15 02:02:37","updated_at":"2017-08-15 02:02:37"},{"id":3,"trail_id":5,"name":"/assets/img/trails/14/15027823582.JPG","status":1,"created_at":"2017-08-15 02:02:38","updated_at":"2017-08-15 02:02:38"}]}
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
         * id : 5
         * landscape_id : 2
         * park_id : 2
         * name : Savanadurga
         * range : Savanadurga
         * display_order_no : 1
         * max_trekkers : 40
         * distance : 4.5
         * distance_unit : Kms
         * hours : 2
         * minutes : 30
         * type : Hard
         * description : <p>Alone Nandi sits on top, overlooking vast swathes of fields, small towns, and hillocks at a distance. He is witness to historical events that have occurred here over centuries. The small mantap where he rests marks the end of the trekking trail at Savandurga, one of the largest monolithic rocks in Asia. Situated about 7 miles from Magadi town, Savandurga has become one of the many trekking hot-spots around Bangalore, testing the rock climbing skills of enthusiasts.</p>
         <p>Named Savandurga by Immadi Kempe Gauda, this hill fortress was believed to be unconquerable until the British took over in 1791; Lord Cornwallis has written a detailed account about its capture. The hill looks imposing as one drives closer to it and it is easy to understand why it is called the ‘rock of death.’ The Nandi mantap looks like a small square on top and all visible sides of the rock look steep and dangerous; only upon reaching the base does one see the rock’s gentle slopes.</p>
         <p>Savandurga has a lot to offer, the base of the temple is surrounded by a forest; with thick bamboo groves and dense shrubs, some part of the forest has now been converted to an herbal plantation and is open for people to explore. The forest has close to 60 species of trees.  A lot of these trees are used for local herbal medicines</p>
         <p>Apart from this, there are two temples – Sri Savandi Veerabhadraswamy Temple and Lakshmi Narashima Temple. The former temple is of Dravidian style and situated inside a courtyard; the structure is beautiful and worth a visit. The latter temple, though, is an old temple which has been renovated and painted, thus losing some of its old-world charm.</p>
         <p>The initial stretch of the Savandurga trek is on bare rock with small boulders, and it is better if the trek is started just as the day breaks. As one gains height, the Arkavati River surrounded by green trees becomes visible at a distance</p>
         <p>A short while into the trek, one encounters the first of the many remains of the fort walls. This spot is well-suited for enjoying some rest in the shade that the trees here have to offer; the next shaded patch comes along only after a long distance. If you observe birds that hop around, the chances of finding a Blue Rock Thrush, White-browed Bulbul or Rock Agamas are high around this area.</p>
         <p>The steepest climb of the trek lies beyond this stop, and takes one to the next fort wall, post which it is a gradual incline. The rock has some depression here and it is quite possible that rain water wall collected here during the good old days. Closer to the top, one come across some trees and dilapidated old structures which are currently used as a place to camp or cook. This is also the place where one is likely to find Oriental Honey Buzzards perched on tree-tops . At the slightest disturbance, they take to the air.</p>
         <p>The last leg of the trek breaks the monotony of walking on the rock with the sun blazing down; one now needs to walk under gigantic boulders. Stretches along this leg are strewn with Plumeria, and the air has the whiff of wild-flowers and resonates with bird calls. It is also a spot where one has a chance to sight the Elusive Yellow Throted Bulbul.</p>
         * logo : /assets/img/trails/1502436148.png
         * starting_point : Bettada Dari
         * ending_point : Kempegowda Fort
         * reporting_time : 0900 Hrs to 1700 Hrs
         * when_to_visit : All year round
         * incharger_details : ["A C Mahesh","Forest Guard","+91 90085 97184"]
         * general_instruction : Private Vehicle can approach the starting point
         * meta_title : Savanadurga
         * meta_description : Savanadurga
         * meta_keywords : Savanadurga
         * direction :
         * transportation :
         * map_url : <iframe src="https://www.google.com/maps/embed?pb=!1m18!1m12!1m3!1d62226.00834511383!2d77.26556972490246!3d12.899649359668858!2m3!1f0!2f0!3f0!3m2!1i1024!2i768!4f13.1!3m3!1m2!1s0x3bae3664f8d60951%3A0x7d23470068713f8f!2sSavandurga+Hill!5e0!3m2!1sen!2sin!4v1502436124275" width="600" height="450" frameborder="0" style="border:0" allowfullscreen></iframe>
         * status : 1
         * created_at : 2017-08-11 01:52:28
         * updated_at : 2017-08-11 01:52:28
         * pricePerPerson : 450
         * trailImages : [{"id":1,"trail_id":5,"name":"/assets/img/trails/14/15027823570.JPG","status":1,"created_at":"2017-08-15 02:02:37","updated_at":"2017-08-15 02:02:37"},{"id":2,"trail_id":5,"name":"/assets/img/trails/14/15027823571.JPG","status":1,"created_at":"2017-08-15 02:02:37","updated_at":"2017-08-15 02:02:37"},{"id":3,"trail_id":5,"name":"/assets/img/trails/14/15027823582.JPG","status":1,"created_at":"2017-08-15 02:02:38","updated_at":"2017-08-15 02:02:38"}]
         */

        private int id;
        private int landscape_id;
        private int park_id;
        private String name;
        private String range;
        private int display_order_no;
        private int max_trekkers;
        private String distance;
        private String distance_unit;
        private String hours;
        private String minutes;
        private String type;
        private String description;
        private String logo;
        private String starting_point;
        private String ending_point;
        private String reporting_time;
        private String when_to_visit;
        private String general_instruction;
        private String meta_title;
        private String meta_description;
        private String meta_keywords;
        private String direction;
        private String transportation;
        private String map_url;
        private int status;
        private String created_at;
        private String updated_at;
        private int pricePerPerson;
        private List<String> incharger_details;
        private List<TrailImagesBean> trailImages;

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public int getLandscape_id() {
            return landscape_id;
        }

        public void setLandscape_id(int landscape_id) {
            this.landscape_id = landscape_id;
        }

        public int getPark_id() {
            return park_id;
        }

        public void setPark_id(int park_id) {
            this.park_id = park_id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getRange() {
            return range;
        }

        public void setRange(String range) {
            this.range = range;
        }

        public int getDisplay_order_no() {
            return display_order_no;
        }

        public void setDisplay_order_no(int display_order_no) {
            this.display_order_no = display_order_no;
        }

        public int getMax_trekkers() {
            return max_trekkers;
        }

        public void setMax_trekkers(int max_trekkers) {
            this.max_trekkers = max_trekkers;
        }

        public String getDistance() {
            return distance;
        }

        public void setDistance(String distance) {
            this.distance = distance;
        }

        public String getDistance_unit() {
            return distance_unit;
        }

        public void setDistance_unit(String distance_unit) {
            this.distance_unit = distance_unit;
        }

        public String getHours() {
            return hours;
        }

        public void setHours(String hours) {
            this.hours = hours;
        }

        public String getMinutes() {
            return minutes;
        }

        public void setMinutes(String minutes) {
            this.minutes = minutes;
        }

        public String getType() {
            return type;
        }

        public void setType(String type) {
            this.type = type;
        }

        public String getDescription() {
            return description;
        }

        public void setDescription(String description) {
            this.description = description;
        }

        public String getLogo() {
            return logo;
        }

        public void setLogo(String logo) {
            this.logo = logo;
        }

        public String getStarting_point() {
            return starting_point;
        }

        public void setStarting_point(String starting_point) {
            this.starting_point = starting_point;
        }

        public String getEnding_point() {
            return ending_point;
        }

        public void setEnding_point(String ending_point) {
            this.ending_point = ending_point;
        }

        public String getReporting_time() {
            return reporting_time;
        }

        public void setReporting_time(String reporting_time) {
            this.reporting_time = reporting_time;
        }

        public String getWhen_to_visit() {
            return when_to_visit;
        }

        public void setWhen_to_visit(String when_to_visit) {
            this.when_to_visit = when_to_visit;
        }

        public String getGeneral_instruction() {
            return general_instruction;
        }

        public void setGeneral_instruction(String general_instruction) {
            this.general_instruction = general_instruction;
        }

        public String getMeta_title() {
            return meta_title;
        }

        public void setMeta_title(String meta_title) {
            this.meta_title = meta_title;
        }

        public String getMeta_description() {
            return meta_description;
        }

        public void setMeta_description(String meta_description) {
            this.meta_description = meta_description;
        }

        public String getMeta_keywords() {
            return meta_keywords;
        }

        public void setMeta_keywords(String meta_keywords) {
            this.meta_keywords = meta_keywords;
        }

        public String getDirection() {
            return direction;
        }

        public void setDirection(String direction) {
            this.direction = direction;
        }

        public String getTransportation() {
            return transportation;
        }

        public void setTransportation(String transportation) {
            this.transportation = transportation;
        }

        public String getMap_url() {
            return map_url;
        }

        public void setMap_url(String map_url) {
            this.map_url = map_url;
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

        public int getPricePerPerson() {
            return pricePerPerson;
        }

        public void setPricePerPerson(int pricePerPerson) {
            this.pricePerPerson = pricePerPerson;
        }

        public List<String> getIncharger_details() {
            return incharger_details;
        }

        public void setIncharger_details(List<String> incharger_details) {
            this.incharger_details = incharger_details;
        }

        public List<TrailImagesBean> getTrailImages() {
            return trailImages;
        }

        public void setTrailImages(List<TrailImagesBean> trailImages) {
            this.trailImages = trailImages;
        }

        public static class TrailImagesBean {
            /**
             * id : 1
             * trail_id : 5
             * name : /assets/img/trails/14/15027823570.JPG
             * status : 1
             * created_at : 2017-08-15 02:02:37
             * updated_at : 2017-08-15 02:02:37
             */

            private int id;
            private int trail_id;
            private String name;
            private int status;
            private String created_at;
            private String updated_at;

            public int getId() {
                return id;
            }

            public void setId(int id) {
                this.id = id;
            }

            public int getTrail_id() {
                return trail_id;
            }

            public void setTrail_id(int trail_id) {
                this.trail_id = trail_id;
            }

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
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
