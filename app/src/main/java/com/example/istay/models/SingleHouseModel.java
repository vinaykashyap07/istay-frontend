package com.example.istay.models;

import java.util.ArrayList;

public class SingleHouseModel {

    private String houseId;
    private String houseName;
    private String houseAddress;
    private String privateRoomPrice;
    private String twinSharingPrice;
    private String TripleSharingPrice;
    private String occupancy;
    private String forWhom;
    private String distFromInfyInKm;
    private String distFromInfyInMin;
    private String AboutProperty;
    private String rating;
    private ArrayList<String> images;


    public String getHouseId() {
        return houseId;
    }

    public void setHouseId(String houseId) {
        this.houseId = houseId;
    }

    public String getHouseName() {
        return houseName;
    }

    public void setHouseName(String houseName) {
        this.houseName = houseName;
    }

    public String getHouseAddress() {
        return houseAddress;
    }

    public void setHouseAddress(String houseAddress) {
        this.houseAddress = houseAddress;
    }

    public String getPrivateRoomPrice() {
        return privateRoomPrice;
    }

    public void setPrivateRoomPrice(String privateRoomPrice) {
        this.privateRoomPrice = privateRoomPrice;
    }

    public String getTwinSharingPrice() {
        return twinSharingPrice;
    }

    public void setTwinSharingPrice(String twinSharingPrice) {
        this.twinSharingPrice = twinSharingPrice;
    }

    public String getTripleSharingPrice() {
        return TripleSharingPrice;
    }

    public void setTripleSharingPrice(String tripleSharingPrice) {
        TripleSharingPrice = tripleSharingPrice;
    }

    public String getForWhom() {
        return forWhom;
    }

    public void setForWhom(String forWhom) {
        this.forWhom = forWhom;
    }

    public String getDistFromInfyInKm() {
        return distFromInfyInKm;
    }

    public void setDistFromInfyInKm(String distFromInfyInKm) {
        this.distFromInfyInKm = distFromInfyInKm;
    }

    public String getDistFromInfyInMin() {
        return distFromInfyInMin;
    }

    public void setDistFromInfyInMin(String distFromInfyInMin) {
        this.distFromInfyInMin = distFromInfyInMin;
    }

    public String getAboutProperty() {
        return AboutProperty;
    }

    public void setAboutProperty(String aboutProperty) {
        AboutProperty = aboutProperty;
    }

    public String getRating() {
        return rating;
    }

    public void setRating(String rating) {
        this.rating = rating;
    }

    public String getOccupancy() {
        return occupancy;
    }

    public void setOccupancy(String occupancy) {
        this.occupancy = occupancy;
    }

    public ArrayList<String> getImages() {
        return images;
    }

    public void setImages(ArrayList<String> images) {
        this.images = images;
    }
}
