package Task2;

public class Helicopter extends FlyingVehicle {

    private int weight;
    private int maxHeight;

    public Helicopter (){}

    public int getMaxHeight() {
        return maxHeight;
    }

    public void setMaxHeight(int maxHeight) {
        this.maxHeight = maxHeight;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    @Override
    public void fly() {
        System.out.println("Helicopter is flying |Weight: "+getWeight()+" |Max height: "+getMaxHeight()+" |Passengers: "+getPassengers());
    }

    @Override
    public void land() {
        System.out.println("Helicopter is landing");
    }
}
