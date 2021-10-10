package com.company;

public class Penguin extends NonFlyingBird{
    protected float size;

    public Penguin(){
        super();
        this.size = 0.2f;
    }

    public Penguin(float size) {
        super();
        this.size = size;
    }

    public Penguin(String feathers, String wingsType){
        super(feathers, wingsType);
        this.size = 0.2f;
    }

    public Penguin(String feathers, String wingsType, float size){
        super(feathers, wingsType);
        this.size = size;
    }

    public float getSize() {
        return size;
    }

    public void setSize(float size) {
        this.size = size;
    }

    @Override
    public void fly() {
        System.out.println("The penguin cant fly but he can swim");
    }

    @Override
    public String toString() {
        return feathers + ", " +
                wingType + ", " +
                size + "m";
    }
}