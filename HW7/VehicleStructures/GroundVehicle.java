
public abstract class GroundVehicle extends Passengers implements Vehicle {
	
	abstract void drive();
	
	public GroundVehicle() {
		super();
	}

	public GroundVehicle(int passengers) {
		super(passengers);
	}
	
	
}
