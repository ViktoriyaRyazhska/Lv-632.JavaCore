package com.company;

public class Chicken extends NonFlyingBird {
    protected boolean male;

    public Chicken() {
        this.male = false;
    }

    public Chicken(boolean male) {
        super();
        this.male = male;
    }

    public Chicken(String feathers, String wingsType){
        super(feathers, wingsType);
        this.male = false;
    }

    public Chicken(String feathers, String wingType, boolean male) {
        super(feathers, wingType);
        this.male = male;
    }

    public boolean isMale() {
        return male;
    }

    public void setMale(boolean male) {
        this.male = male;
    }

    @Override
    public void fly() {
        System.out.println("The chicken cant fly and she doesn't need to");
    }

    @Override
    public String toString() {
        return feathers + ", " +
                wingType + ", " +
                ( (male)? "male" : "female" );
    }
}


