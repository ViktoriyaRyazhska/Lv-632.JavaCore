package lesson007m;

public class Liner extends WaterVehicle {

	private int floors;

	public int getFloors() {
		return floors;
	}

	public void setFloors(int floors) {
		this.floors = floors;
	}

	public Liner(int passengers, int floors) {
		super(passengers);
		this.floors = floors;
	}

	@Override
	public void isSalling() {
		System.out.println("Water Vehicle the liner has floors: " + getFloors() + ". Passenger capacity: " + super.getPassengers());
	}

}