package HW7task2;

public class Plane extends FlyingVehicle {

	private int maxDistance;

	public Plane(String Vname, int passengers, int maxDistance) {
		super(Vname, passengers);
		this.maxDistance = maxDistance;
	}
	@Override
	public void fly() {
		System.out.println("Plane "+getVname()+ " in flight, there are "+getPassengers()+" passengers");

	}
	@Override
	public void land() {
		System.out.println(getVname()+" has landed, flew "+maxDistance+"km");

	}

	public int getMaxDistance() {
		return maxDistance;
	}

	public void setMaxDistance(int maxDistance) {
		this.maxDistance = maxDistance;
	}

}
