package com.example.lovecanadaapplication.Model;

import java.io.Serializable;

public class CanadaAttraction  implements Serializable
{
    private String placeID;
    private String placeName;
    private String address;
    private String city;
    private String province;
    private String description;
    private String link;
    private int imgPlace;
    public CanadaAttraction() {

    }

    public int getImgPlace() {
        return imgPlace;
    }

    public void setImgPlace(int imgPlace) {
        this.imgPlace = imgPlace;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public CanadaAttraction(String placeID, String placeName, String address, String city, String province, String description, String link,int imgPlace) {
        this.placeID = placeID;
        this.placeName = placeName;
        this.address = address;
        this.city = city;
        this.province = province;
        this.description = description;
        this.link = link;
        this.imgPlace = imgPlace;
    }

    public String getPlaceID() {
        return placeID;
    }

    public void setPlaceID(String placeID) {
        this.placeID = placeID;
    }

    public String getPlaceName() {
        return placeName;
    }

    public void setPlaceName(String placeName) {
        this.placeName = placeName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
