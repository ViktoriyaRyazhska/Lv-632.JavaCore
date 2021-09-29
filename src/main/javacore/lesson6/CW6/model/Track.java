package lesson6.CW6.model;

public class Track extends Car{
    private int carrying;

    @Override
    public void run() {
        System.out.println("Track run");
    }

    @Override
    public void stop() {
        System.out.println("Track stop");
    }

    public Track(String model, int maxSpeed, int yeaOfManufacture, int carrying) {
        super(model, maxSpeed, yeaOfManufacture);
        this.carrying = carrying;
    }

    public int getCarrying() {
        return carrying;
    }

    public void setCarrying(int carrying) {
        this.carrying = carrying;
    }

    @Override
    public String toString() {
        return "Track{" +
                "model='" + super.getModel() + '\'' +
                ", maxSpeed=" + super.getMaxSpeed() +
                ", yeaOfManufacture=" + super.getYeaOfManufacture() +
                ", carrying=" + carrying +
                '}';
    }
}
