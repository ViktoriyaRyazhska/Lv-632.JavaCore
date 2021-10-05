package HW7task2;

public class WaterVehicle extends Passengers implements Vehicle {
	private String Vname;

	public WaterVehicle(String Vname, int passengers) {
		super(passengers);
		this.Vname=Vname;
	}

	public void isSalling() {
	}

	public String getName() {
		return Vname;
	}

	public void setName(String Vname) {
		this.Vname = Vname;
	}

}
