package com.dicoding.coronalive.Model;

import android.os.Parcel;
import android.os.Parcelable;

public class Simpstomp implements Parcelable {
    private String photo;
    private String name;
    private String description;

    public Simpstomp(){

    }

    protected Simpstomp(Parcel in) {
        photo = in.readString();
        name = in.readString();
        description = in.readString();
    }

    public static final Creator<Simpstomp> CREATOR = new Creator<Simpstomp>() {
        @Override
        public Simpstomp createFromParcel(Parcel in) {
            return new Simpstomp(in);
        }

        @Override
        public Simpstomp[] newArray(int size) {
            return new Simpstomp[size];
        }
    };

    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(photo);
        dest.writeString(name);
        dest.writeString(description);
    }
}
