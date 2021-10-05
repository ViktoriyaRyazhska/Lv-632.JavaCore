package HW7task2;

public class FlyingVehicle extends Passengers implements Vehicle {
	private String Vname;

	public FlyingVehicle(String Vname, int passengers) {
		super(passengers);
		this.Vname = Vname;
	}

	public String getVname() {
		return Vname;
	}

	public void setVname(String vname) {
		Vname = vname;
	}

	public void fly() {

	}

	public void land() {

	}
}
