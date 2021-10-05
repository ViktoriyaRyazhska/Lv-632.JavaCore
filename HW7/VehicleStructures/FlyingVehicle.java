
public abstract class FlyingVehicle extends Passengers implements Vehicle  {


	abstract void fly();
	abstract void land();
	
	
	public FlyingVehicle() {
		super();
	}

	public FlyingVehicle(int passengers) {
		super(passengers);
	}
	
}
