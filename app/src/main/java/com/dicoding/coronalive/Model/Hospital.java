package com.dicoding.coronalive.Model;

import android.os.Parcel;
import android.os.Parcelable;

public class Hospital implements Parcelable {

    public Hospital(){

    }
    private String nameHosp;
    private String imageHosp;
    private String addresHosp;
    private String telphoneHosp;
    private String messageHosp;
    private String ambulanceHosp;
    private String urlHosp;

    protected Hospital(Parcel in) {
        nameHosp = in.readString();
        imageHosp = in.readString();
        addresHosp = in.readString();
        telphoneHosp = in.readString();
        messageHosp = in.readString();
        ambulanceHosp = in.readString();
        urlHosp = in.readString();
    }

    public static final Creator<Hospital> CREATOR = new Creator<Hospital>() {
        @Override
        public Hospital createFromParcel(Parcel in) {
            return new Hospital(in);
        }

        @Override
        public Hospital[] newArray(int size) {
            return new Hospital[size];
        }
    };


    public String getUrlHosp() {
        return urlHosp;
    }

    public void setUrlHosp(String urlHosp) {
        this.urlHosp = urlHosp;
    }

    public String getNameHosp() {
        return nameHosp;
    }

    public void setNameHosp(String nameHosp) {
        this.nameHosp = nameHosp;
    }

    public String getImageHosp() {
        return imageHosp;
    }

    public void setImageHosp(String imageHosp) {
        this.imageHosp = imageHosp;
    }

    public String getAddresHosp() {
        return addresHosp;
    }

    public void setAddresHosp(String addresHosp) {
        this.addresHosp = addresHosp;
    }

    public String getTelphoneHosp() {
        return telphoneHosp;
    }

    public void setTelphoneHosp(String telphoneHosp) {
        this.telphoneHosp = telphoneHosp;
    }

    public String getMessageHosp() {
        return messageHosp;
    }

    public void setMessageHosp(String messageHosp) {
        this.messageHosp = messageHosp;
    }

    public String getAmbulanceHosp() {
        return ambulanceHosp;
    }

    public void setAmbulanceHosp(String ambulanceHosp) {
        this.ambulanceHosp = ambulanceHosp;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(nameHosp);
        dest.writeString(imageHosp);
        dest.writeString(addresHosp);
        dest.writeString(telphoneHosp);
        dest.writeString(messageHosp);
        dest.writeString(ambulanceHosp);
        dest.writeString(urlHosp);
    }
}
