package lesson7.hw.vehicles;

public abstract class GroundVehicle extends Passengers implements Vehicle {

	public GroundVehicle(int passenegrs) {
		super(passenegrs);
	}
	
	public abstract void drive();

}
