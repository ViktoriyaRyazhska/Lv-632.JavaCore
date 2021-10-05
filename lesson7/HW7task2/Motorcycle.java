package HW7task2;

public class Motorcycle extends GroundVehicle {
	private int maxSpeed;

	public Motorcycle(int passengers, int maxSpeed) {
		super(passengers);
		this.maxSpeed=maxSpeed;
	}
	public void drive() {
		System.out.println("Motorcycle's maxSpeed "+getMaxSpeed()+ "km");

	}

	public int getMaxSpeed() {
		return maxSpeed;
	}

	public void setMaxSpeed(int maxSpeed) {
		this.maxSpeed = maxSpeed;
	}

}
