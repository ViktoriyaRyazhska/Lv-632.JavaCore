package HW7task2;

public class Liner extends WaterVehicle {

	private int floors;

	public Liner(String Vname, int passengers, int floors) {
		super(Vname, passengers);
		this.floors=floors;
	}
	
	@Override
	public void isSalling() {
		System.out.println(floors * getPassengers() + " people on board");
	}

	public int getFloors() {
		return floors;
	}

	public void setFloors(int floors) {
		this.floors = floors;
	}

	
}
