package lesson7.hw.vehicles;

public class Motorcycle extends GroundVehicle {
	
	private int maxSpeed;
	
	public Motorcycle(int passenegrs, int maxSpeed) {
		super(passenegrs);
		this.maxSpeed = maxSpeed;
	}

	public int getMaxSpeed() {
		return maxSpeed;
	}
	public void setMaxSpeed(int maxSpeed) {
		this.maxSpeed = maxSpeed;
	}
	
	@Override
	public void drive() {
		System.out.println("The motorcycle is driving.");
	}

}
