package com.company;

public class Car {
    public String type;
    int yearOfProduction;
    float engineCapacity;

    public Car(String type, int yearOfProduction, float engineCapacity) {
        this.type = type;
        this.yearOfProduction = yearOfProduction;
        this.engineCapacity = engineCapacity;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getYearOfProduction() {
        return yearOfProduction;
    }

    public void setYearOfProduction(int yearOfProduction) {
        this.yearOfProduction = yearOfProduction;
    }

    public float getEngineCapacity() {
        return engineCapacity;
    }

    public void setEngineCapacity(float engineCapacity) {
        this.engineCapacity = engineCapacity;
    }

    public String Reuslt() {
        return "Car:" +
                "model=" + type +
                ", year=" + yearOfProduction +
                ", engineCapacity=" + engineCapacity;
    }
}
