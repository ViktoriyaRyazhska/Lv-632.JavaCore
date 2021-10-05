
public abstract class WaterVehicle extends Passengers implements Vehicle {

	abstract void isSailing();

	public WaterVehicle() {
		super();
	}

	public WaterVehicle(int passengers) {
		super(passengers);
	}

}
