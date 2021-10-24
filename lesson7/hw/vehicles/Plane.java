package lesson7.hw.vehicles;

public class Plane extends FlyingVehicle {
	
	private int maxDistance;

	public Plane(int passenegrs, int maxDistance) {
		super(passenegrs);
		this.maxDistance = maxDistance;
	}

	public int getMaxDistance() {
		return maxDistance;
	}
	public void setMaxDistance(int maxDistance) {
		this.maxDistance = maxDistance;
	}

	@Override
	public void fly() {
		System.out.println("The plane is flying.");
		
	}

	@Override
	public void land() {
		System.out.println("The plane is on land.");
	}
	
}
