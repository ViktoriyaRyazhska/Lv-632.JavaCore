
public class Plane extends FlyingVehicle {

	private int maxDistance;

	public Plane() {
		super();
	}

	public Plane(int passengers, int maxDistance) {
		super(passengers);
		this.maxDistance = maxDistance;
	}

	public int getMaxDistance() {
		return maxDistance;
	}

	public void setMaxDistance(int maxDistance) {
		this.maxDistance = maxDistance;
	}

	@Override
	void fly() {
		System.out.println("Plane flyes! Number of passengers = " + this.getPassengers() + " max distance = "
				+ this.getMaxDistance());
	}

	@Override
	void land() {
		System.out.println("Plane isnt flying");
	}

}
