package lesson6.CW6.model;

public abstract class Car {
    private String model;
    private int maxSpeed;
    private int yeaOfManufacture;

    public abstract void run();

    public abstract void stop();

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public int getYeaOfManufacture() {
        return yeaOfManufacture;
    }

    public void setYeaOfManufacture(int yeaOfManufacture) {
        this.yeaOfManufacture = yeaOfManufacture;
    }

    public Car(String model, int maxSpeed, int yeaOfManufacture) {
        this.model = model;
        this.maxSpeed = maxSpeed;
        this.yeaOfManufacture = yeaOfManufacture;
    }
}
