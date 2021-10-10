package com.company;

public class Swallow extends FlyingBird{
    protected float weight;

    public Swallow(){
        super();
        this.weight = 0.01f;
    }

    public Swallow(float weight) {
        super();
        this.weight = weight;
    }

    public Swallow(String feathers, float wingsWidth){
        super(feathers, wingsWidth);
        this.weight = 0.01f;
    }

    public Swallow(String feathers, float wingsWidth, float weight){
        super(feathers, wingsWidth);
        this.weight = weight;
    }

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    @Override
    public void fly() {
        System.out.println("The swallow flies fast");
    }

    @Override
    public String toString() {
        return feathers + ", " +
                wingsWidth + ", " +
                weight + "kg";
    }
}