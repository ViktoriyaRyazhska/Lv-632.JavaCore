package com.company;

public abstract class FlyingBird extends Bird{
    protected float wingsWidth;

    public FlyingBird() {
        super();
        this.wingsWidth = 0.0f;
    }

    public FlyingBird(String feathers) {
        super(feathers);
        this.wingsWidth = 0.0f;
    }

    public FlyingBird(String feathers, float wingsWidth) {
        super(feathers);
        this.wingsWidth = wingsWidth;
    }

    public float getWingsWidth() {
        return wingsWidth;
    }

    public void setWingsWidth(float wingsWidth) {
        this.wingsWidth = wingsWidth;
    }

    @Override
    public void fly() {
        System.out.println("The bird starts flying");
    }
}