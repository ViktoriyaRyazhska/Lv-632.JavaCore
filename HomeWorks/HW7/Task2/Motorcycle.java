package Task2;

public class Motorcycle extends GroundVehicle {

    private int maxSpeed;

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    @Override
    public void drive() {
        System.out.println("Motorcycle is drive |Max Speed: "+getMaxSpeed()+" |Passengers: "+getPassengers());
    }
}
