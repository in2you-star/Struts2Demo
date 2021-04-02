package com.myIt.pojo;

public class House {
    private int houseId;
    private String title;
    private Street street;

    public House() {
    }

    public House(int houseId, String title, Street street) {
        this.houseId = houseId;
        this.title = title;
        this.street = street;
    }

    public int getHouseId() {
        return houseId;
    }

    public void setHouseId(int houseId) {
        this.houseId = houseId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Street getStreet() {
        return street;
    }

    public void setStreet(Street street) {
        this.street = street;
    }
}
