package Lesson6.ClassTasks;

public class Sedan extends Car{
    public Sedan(String model, int maxSpeed, int yearOfManufacture) {
        super(model, maxSpeed, yearOfManufacture);
    }

    @Override
    public void run() {
        System.out.println("Sedan " + getModel() + " runs");
    }

    @Override
    public void stop() {
        System.out.println("Sedan " + getModel() + " stops");

    }

    @Override
    public String toString() {
        return "Car " + getModel() + " max speed " + getMaxSpeed() + " year of manufacture " + getYearOfManufacture();
    }
}
