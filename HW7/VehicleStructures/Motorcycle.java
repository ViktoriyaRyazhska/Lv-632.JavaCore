
public class Motorcycle extends GroundVehicle {

	private int maxSpeed;

	public Motorcycle() {
		super();
	}

	public Motorcycle(int passengers, int maxSpeed) {
		super(passengers);
		this.maxSpeed = maxSpeed;
	}

	
	
	public int getMaxSpeed() {
		return maxSpeed;
	}

	public void setMaxSpeed(int maxSpeed) {
		this.maxSpeed = maxSpeed;
	}

	@Override
	void drive() {
		System.out.println("Motorcycle rides at spead = "+this.maxSpeed+". Number of passengers = "+this.getPassengers());
	}

}
