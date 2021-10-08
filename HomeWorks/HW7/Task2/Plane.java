package Task2;

public class Plane extends FlyingVehicle {

    private int maxDistance;

    public Plane (){}

    public int getMaxDistance() {
        return maxDistance;
    }

    public void setMaxDistance(int maxDistance) {
        this.maxDistance = maxDistance;
    }

    @Override
    public void fly() {
        System.out.println("Plane is flying |Max distance: "+getMaxDistance()+" |Passengers: "+getPassengers());
    }

    @Override
    public void land() {
        System.out.println("Plane is landing");
    }
}
