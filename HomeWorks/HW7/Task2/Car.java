package Task2;

public class Car extends GroundVehicle {

    private String model;

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    @Override
    public void drive() {
        System.out.println("Car is drive |Model: "+getModel()+" |Passengers: "+getPassengers());
    }
}
