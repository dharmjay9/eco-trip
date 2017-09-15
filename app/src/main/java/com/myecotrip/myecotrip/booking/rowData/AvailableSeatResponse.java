package com.myecotrip.myecotrip.booking.rowData;

import android.os.Parcel;
import android.os.Parcelable;

import com.google.gson.annotations.SerializedName;
import com.myecotrip.myecotrip.base.CommonModel;

/**
 * Created by Gopal kumar on 18-08-2017.
 */

public class AvailableSeatResponse extends CommonModel implements Parcelable {


    /**
     * content : {"trailId":5,"travelDate":"2018-10-18","noOfTrekkers":13,"pricePerPerson":450,"total":5850,"serviceCharges":380.25,"totalPayable":6230.25}
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

    public static class ContentBean implements Parcelable {
        /**
         * trailId : 5
         * travelDate : 2018-10-18
         * noOfTrekkers : 13
         * pricePerPerson : 450
         * total : 5850
         * serviceCharges : 380.25
         * totalPayable : 6230.25
         */

        private String travelDate;
        private int noOfTrekkers;
        private int pricePerPerson;
        private int total;
        private double serviceCharges;
        private double totalPayable;
        private String trailName;
        private String  trailLogo;
        public String getTrailName() {
            return trailName;
        }

        public void setTrailName(String trailName) {
            this.trailName = trailName;
        }

        private int trailId;

        public int getTrailId() {
            return trailId;
        }

        public void setTrailId(int trailId) {
            this.trailId = trailId;
        }

        public String getTravelDate() {
            return travelDate;
        }

        public void setTravelDate(String travelDate) {
            this.travelDate = travelDate;
        }

        public int getNoOfTrekkers() {
            return noOfTrekkers;
        }

        public void setNoOfTrekkers(int noOfTrekkers) {
            this.noOfTrekkers = noOfTrekkers;
        }

        public int getPricePerPerson() {
            return pricePerPerson;
        }

        public void setPricePerPerson(int pricePerPerson) {
            this.pricePerPerson = pricePerPerson;
        }

        public int getTotal() {
            return total;
        }

        public void setTotal(int total) {
            this.total = total;
        }

        public double getServiceCharges() {
            return serviceCharges;
        }

        public void setServiceCharges(double serviceCharges) {
            this.serviceCharges = serviceCharges;
        }

        public double getTotalPayable() {
            return totalPayable;
        }

        public void setTotalPayable(double totalPayable) {
            this.totalPayable = totalPayable;
        }

        public ContentBean() {
        }

        @Override
        public int describeContents() {
            return 0;
        }

        @Override
        public void writeToParcel(Parcel dest, int flags) {
            dest.writeString(this.travelDate);
            dest.writeInt(this.noOfTrekkers);
            dest.writeInt(this.pricePerPerson);
            dest.writeInt(this.total);
            dest.writeDouble(this.serviceCharges);
            dest.writeDouble(this.totalPayable);
            dest.writeString(this.trailName);
            dest.writeInt(this.trailId);
            dest.writeString(this.trailLogo);
        }

        protected ContentBean(Parcel in) {
            this.travelDate = in.readString();
            this.noOfTrekkers = in.readInt();
            this.pricePerPerson = in.readInt();
            this.total = in.readInt();
            this.serviceCharges = in.readDouble();
            this.totalPayable = in.readDouble();
            this.trailName = in.readString();
            this.trailId = in.readInt();
            this.trailLogo = in.readString();
        }

        public static final Creator<ContentBean> CREATOR = new Creator<ContentBean>() {
            @Override
            public ContentBean createFromParcel(Parcel source) {
                return new ContentBean(source);
            }

            @Override
            public ContentBean[] newArray(int size) {
                return new ContentBean[size];
            }
        };

        public String getTrailLogo() {
            return trailLogo;
        }
    }

    public static class ResponseBean implements Parcelable {
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

        @Override
        public int describeContents() {
            return 0;
        }

        @Override
        public void writeToParcel(Parcel dest, int flags) {
            dest.writeInt(this.statuscode);
            dest.writeInt(this.error);
            dest.writeString(this.sys_msg);
            dest.writeString(this.message);
        }

        public ResponseBean() {
        }

        protected ResponseBean(Parcel in) {
            this.statuscode = in.readInt();
            this.error = in.readInt();
            this.sys_msg = in.readString();
            this.message = in.readString();
        }

        public static final Creator<ResponseBean> CREATOR = new Creator<ResponseBean>() {
            @Override
            public ResponseBean createFromParcel(Parcel source) {
                return new ResponseBean(source);
            }

            @Override
            public ResponseBean[] newArray(int size) {
                return new ResponseBean[size];
            }
        };
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeParcelable(this.content, flags);
        dest.writeParcelable(this.response, flags);
    }

    public AvailableSeatResponse() {
    }

    protected AvailableSeatResponse(Parcel in) {
        this.content = in.readParcelable(ContentBean.class.getClassLoader());
        this.response = in.readParcelable(ResponseBean.class.getClassLoader());
    }

    public static final Parcelable.Creator<AvailableSeatResponse> CREATOR = new Parcelable.Creator<AvailableSeatResponse>() {
        @Override
        public AvailableSeatResponse createFromParcel(Parcel source) {
            return new AvailableSeatResponse(source);
        }

        @Override
        public AvailableSeatResponse[] newArray(int size) {
            return new AvailableSeatResponse[size];
        }
    };
}
