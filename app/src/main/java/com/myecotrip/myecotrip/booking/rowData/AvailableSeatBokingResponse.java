package com.myecotrip.myecotrip.booking.rowData;

import android.os.Parcel;
import android.os.Parcelable;

import com.google.gson.annotations.SerializedName;
import com.myecotrip.myecotrip.base.CommonModel;

import java.util.List;

/**
 * Created by Dell_PC on 9/16/2017.
 */

public class AvailableSeatBokingResponse extends CommonModel implements Parcelable {


    /**
     * content : {"trailId":5,"travelDate":"2017-08-18","noOfTrekkers":5,"pricePerPerson":450,"trailName":"Savanadurga","trailLogo":"/assets/img/trails/1503043630.jpg","billDetails":[{"name":"Total price","value":2250},{"name":"Service charges","value":146.25},{"name":"Total trip","value":2396.25}]}
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
         * travelDate : 2017-08-18
         * noOfTrekkers : 5
         * pricePerPerson : 450
         * trailName : Savanadurga
         * trailLogo : /assets/img/trails/1503043630.jpg
         * billDetails : [{"name":"Total price","value":2250},{"name":"Service charges","value":146.25},{"name":"Total trip","value":2396.25}]
         */

        private int trailId;
        private String travelDate;
        private int noOfTrekkers;
        private int pricePerPerson;
        private String trailName;
        private String trailLogo;
        private List<BillDetailsBean> billDetails;

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

        public String getTrailName() {
            return trailName;
        }

        public void setTrailName(String trailName) {
            this.trailName = trailName;
        }

        public String getTrailLogo() {
            return trailLogo;
        }

        public void setTrailLogo(String trailLogo) {
            this.trailLogo = trailLogo;
        }

        public List<BillDetailsBean> getBillDetails() {
            return billDetails;
        }

        public void setBillDetails(List<BillDetailsBean> billDetails) {
            this.billDetails = billDetails;
        }

        public static class BillDetailsBean implements Parcelable {
            /**
             * name : Total price
             * value : 2250
             */

            private String name;
            private double value;

            protected BillDetailsBean(Parcel in) {
                name = in.readString();
                value = in.readDouble();
            }

            public static final Creator<BillDetailsBean> CREATOR = new Creator<BillDetailsBean>() {
                @Override
                public BillDetailsBean createFromParcel(Parcel in) {
                    return new BillDetailsBean(in);
                }

                @Override
                public BillDetailsBean[] newArray(int size) {
                    return new BillDetailsBean[size];
                }
            };

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }

            public double getValue() {
                return value;
            }

            public void setValue(double value) {
                this.value = value;
            }

            @Override
            public int describeContents() {
                return 0;
            }

            @Override
            public void writeToParcel(Parcel parcel, int i) {
                parcel.writeString(name);
                parcel.writeDouble(value);
            }
        }

        @Override
        public int describeContents() {
            return 0;
        }

        @Override
        public void writeToParcel(Parcel dest, int flags) {
            dest.writeInt(this.trailId);
            dest.writeString(this.travelDate);
            dest.writeInt(this.noOfTrekkers);
            dest.writeInt(this.pricePerPerson);
            dest.writeString(this.trailName);
            dest.writeString(this.trailLogo);
            dest.writeTypedList(this.billDetails);
        }

        public ContentBean() {
        }

        protected ContentBean(Parcel in) {
            this.trailId = in.readInt();
            this.travelDate = in.readString();
            this.noOfTrekkers = in.readInt();
            this.pricePerPerson = in.readInt();
            this.trailName = in.readString();
            this.trailLogo = in.readString();
            this.billDetails = in.createTypedArrayList(BillDetailsBean.CREATOR);
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

        protected ResponseBean(Parcel in) {
            statuscode = in.readInt();
            error = in.readInt();
            sys_msg = in.readString();
            message = in.readString();
        }

        public static final Creator<ResponseBean> CREATOR = new Creator<ResponseBean>() {
            @Override
            public ResponseBean createFromParcel(Parcel in) {
                return new ResponseBean(in);
            }

            @Override
            public ResponseBean[] newArray(int size) {
                return new ResponseBean[size];
            }
        };

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
        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(statuscode);
            parcel.writeInt(error);
            parcel.writeString(sys_msg);
            parcel.writeString(message);
        }
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

    public AvailableSeatBokingResponse() {
    }

    protected AvailableSeatBokingResponse(Parcel in) {
        this.content = in.readParcelable(ContentBean.class.getClassLoader());
        this.response = in.readParcelable(ResponseBean.class.getClassLoader());
    }

    public static final Parcelable.Creator<AvailableSeatBokingResponse> CREATOR = new Parcelable.Creator<AvailableSeatBokingResponse>() {
        @Override
        public AvailableSeatBokingResponse createFromParcel(Parcel source) {
            return new AvailableSeatBokingResponse(source);
        }

        @Override
        public AvailableSeatBokingResponse[] newArray(int size) {
            return new AvailableSeatBokingResponse[size];
        }
    };
}
