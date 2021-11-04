package Lesson6.ClassTasks;

public class Truck extends Car{

    public Truck(String model, int maxSpeed, int yearOfManufacture) {
        super(model, maxSpeed, yearOfManufacture);
    }

    @Override
    public void run() {
        System.out.println("Truck " + getModel() + " runs");
    }

    @Override
    public void stop() {
        System.out.println("Truck " + getModel() + "stops");

    }

    @Override
    public String toString() {
        return "Car " + getModel() + " max speed " + getMaxSpeed() + " year of manufacture " + getYearOfManufacture();
    }
}
