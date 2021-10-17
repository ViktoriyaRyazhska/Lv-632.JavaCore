package lesson007m;

public class Plane extends FlyingVehicle {

	private int maxDistance;

	public int getMaxDistance() {
		return maxDistance;
	}

	public void setMaxDistance(int maxDistance) {
		this.maxDistance = maxDistance;
	}

	public Plane(int passengers, int maxDistance) {
		super(passengers);
		this.maxDistance = maxDistance;
	}

	@Override
	public void fly() {
		System.out.println("Flying Vehicle a plane is fly max distance: " + getMaxDistance());
	}

	@Override
	public void land() {
		System.out.println("Flying Vehicle a plane is land passengers: " + super.getPassengers());
	}

}