package com.myecotrip.myecotrip.details.ecoTrail;

import android.os.Parcel;
import android.os.Parcelable;

import com.google.gson.annotations.SerializedName;
import com.myecotrip.myecotrip.base.CommonModel;

import java.util.List;

/**
 * Created by Gopal kumar on 16-08-2017.
 */

public class TrailListingRowData  extends CommonModel{


    /**
     * content : [{"id":5,"landscape_id":2,"park_id":2,"name":"Savanadurga","max_trekkers":40,"distance":"4.5","distance_unit":"Kms","hours":"2","minutes":"30","type":"Hard","description":"<p>Alone Nandi sits on top, overlooking vast swathes of fields, small towns, and hillocks at a distance. He is witness to historical events that have occurred here over centuries. The small mantap where he rests marks the end of the trekking trail at Savandurga, one of the largest monolithic rocks in Asia. Situated about 7 miles from Magadi town, Savandurga has become one of the many trekking hot-spots around Bangalore, testing the rock climbing skills of enthusiasts.<\/p>\n                    <p>Named Savandurga by Immadi Kempe Gauda, this hill fortress was believed to be unconquerable until the British took over in 1791; Lord Cornwallis has written a detailed account about its capture. The hill looks imposing as one drives closer to it and it is easy to understand why it is called the \u2018rock of death.\u2019 The Nandi mantap looks like a small square on top and all visible sides of the rock look steep and dangerous; only upon reaching the base does one see the rock\u2019s gentle slopes.<\/p>\n\t\t\t\t\t<p>Savandurga has a lot to offer, the base of the temple is surrounded by a forest; with thick bamboo groves and dense shrubs, some part of the forest has now been converted to an herbal plantation and is open for people to explore. The forest has close to 60 species of trees.  A lot of these trees are used for local herbal medicines<\/p>\n\t\t\t\t\t<p>Apart from this, there are two temples \u2013 Sri Savandi Veerabhadraswamy Temple and Lakshmi Narashima Temple. The former temple is of Dravidian style and situated inside a courtyard; the structure is beautiful and worth a visit. The latter temple, though, is an old temple which has been renovated and painted, thus losing some of its old-world charm.<\/p>\n\t\t\t\t\t<p>The initial stretch of the Savandurga trek is on bare rock with small boulders, and it is better if the trek is started just as the day breaks. As one gains height, the Arkavati River surrounded by green trees becomes visible at a distance<\/p>\n\t\t\t\t\t<p>A short while into the trek, one encounters the first of the many remains of the fort walls. This spot is well-suited for enjoying some rest in the shade that the trees here have to offer; the next shaded patch comes along only after a long distance. If you observe birds that hop around, the chances of finding a Blue Rock Thrush, White-browed Bulbul or Rock Agamas are high around this area.<\/p>\n\t\t\t\t\t<p>The steepest climb of the trek lies beyond this stop, and takes one to the next fort wall, post which it is a gradual incline. The rock has some depression here and it is quite possible that rain water wall collected here during the good old days. Closer to the top, one come across some trees and dilapidated old structures which are currently used as a place to camp or cook. This is also the place where one is likely to find Oriental Honey Buzzards perched on tree-tops . At the slightest disturbance, they take to the air.<\/p>\n\t\t\t\t\t<p>The last leg of the trek breaks the monotony of walking on the rock with the sun blazing down; one now needs to walk under gigantic boulders. Stretches along this leg are strewn with Plumeria, and the air has the whiff of wild-flowers and resonates with bird calls. It is also a spot where one has a chance to sight the Elusive Yellow Throted Bulbul.<\/p>","logo":"/assets/img/trails/1502436148.png","status":1,"pricePerPerson":450},{"id":9,"landscape_id":2,"park_id":2,"name":"test","max_trekkers":40,"distance":"4","distance_unit":"Kms","hours":"2","minutes":"30","type":"Soft","description":"asd","logo":"/assets/img/trails/1502661205.jpg","status":1,"pricePerPerson":3},{"id":14,"landscape_id":2,"park_id":2,"name":"6","max_trekkers":6,"distance":"6","distance_unit":"Kms","hours":"6","minutes":"6","type":"Soft","description":"6","logo":"/assets/img/trails/1502782357.jpg","status":1,"pricePerPerson":3}]
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

    public static class ContentBean implements Parcelable {
        /**
         * id : 5
         * landscape_id : 2
         * park_id : 2
         * name : Savanadurga
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
         * status : 1
         * pricePerPerson : 450
         */

        private int id;
        private int landscape_id;
        private int park_id;
        private String name;
        private int max_trekkers;
        private String distance;
        private String distance_unit;
        private String hours;
        private String minutes;
        private String type;
        private String description;
        private String logo;
        private int status;
        private int pricePerPerson;

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

        public int getStatus() {
            return status;
        }

        public void setStatus(int status) {
            this.status = status;
        }

        public int getPricePerPerson() {
            return pricePerPerson;
        }

        public void setPricePerPerson(int pricePerPerson) {
            this.pricePerPerson = pricePerPerson;
        }

        @Override
        public int describeContents() {
            return 0;
        }

        @Override
        public void writeToParcel(Parcel dest, int flags) {
            dest.writeInt(this.id);
            dest.writeInt(this.landscape_id);
            dest.writeInt(this.park_id);
            dest.writeString(this.name);
            dest.writeInt(this.max_trekkers);
            dest.writeString(this.distance);
            dest.writeString(this.distance_unit);
            dest.writeString(this.hours);
            dest.writeString(this.minutes);
            dest.writeString(this.type);
            dest.writeString(this.description);
            dest.writeString(this.logo);
            dest.writeInt(this.status);
            dest.writeInt(this.pricePerPerson);
        }

        public ContentBean() {
        }

        protected ContentBean(Parcel in) {
            this.id = in.readInt();
            this.landscape_id = in.readInt();
            this.park_id = in.readInt();
            this.name = in.readString();
            this.max_trekkers = in.readInt();
            this.distance = in.readString();
            this.distance_unit = in.readString();
            this.hours = in.readString();
            this.minutes = in.readString();
            this.type = in.readString();
            this.description = in.readString();
            this.logo = in.readString();
            this.status = in.readInt();
            this.pricePerPerson = in.readInt();
        }

        public static final Parcelable.Creator<ContentBean> CREATOR = new Parcelable.Creator<ContentBean>() {
            @Override
            public ContentBean createFromParcel(Parcel source) {
                return new ContentBean(source);
            }

            @Override
            public ContentBean[] newArray(int size) {
                return new ContentBean[size];
            }
        };
    }
}
