package com.company;

public abstract class NonFlyingBird extends Bird{
    protected String wingType;

    public NonFlyingBird() {
        this.wingType = "none";
    }

    public NonFlyingBird(String feathers) {
        super(feathers);
        this.wingType = "none";
    }

    public NonFlyingBird(String feathers, String wingType){
        super(feathers);
        this.wingType = wingType;
    }

    public String getWingType() {
        return wingType;
    }

    public void setWingType(String wingType) {
        this.wingType = wingType;
    }

    @Override
    public void fly() {
        System.out.println("This bird cant fly");
    }
}