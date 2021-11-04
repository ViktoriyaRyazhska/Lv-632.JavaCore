package lesson6.CW6.model;

public class Sedan extends Car {
    private int numberOfPassengers;

    @Override
    public void run() {
        System.out.println("Sedan run");
    }

    @Override
    public void stop() {
        System.out.println("Sedan run");
    }

    public Sedan(String model, int maxSpeed, int yeaOfManufacture, int numberOfPassengers) {
        super(model, maxSpeed, yeaOfManufacture);
        this.numberOfPassengers = numberOfPassengers;
    }

    public int getNumberOfPassengers() {
        return numberOfPassengers;
    }

    public void setNumberOfPassengers(int numberOfPassengers) {
        this.numberOfPassengers = numberOfPassengers;
    }

    @Override
    public String toString() {
        return "Sedan{" +
                "model='" + super.getModel() + '\'' +
                ", maxSpeed=" + super.getMaxSpeed() +
                ", yeaOfManufacture=" + super.getYeaOfManufacture() +
                ", numberOfPassengers=" + numberOfPassengers +
                '}';
    }
}
