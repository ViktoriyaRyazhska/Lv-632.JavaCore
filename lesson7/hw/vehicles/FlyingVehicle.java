package lesson7.hw.vehicles;

public abstract class FlyingVehicle extends Passengers implements Vehicle {

	public FlyingVehicle(int passenegrs) {
		super(passenegrs);
	}
	
	public abstract void fly();
	
	public abstract void land();

}
