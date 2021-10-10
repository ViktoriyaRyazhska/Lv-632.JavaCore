package lesson006c;

public abstract class Car {
	private String model;
	private int maxSpeed;
	private int yearOfManufacture;

	public abstract void run();

	public abstract void stop();

	public String getModel() {
		return model;
	}

	public int getMaxSpeed() {
		return maxSpeed;
	}

	public int getYearOfManufacture() {
		return yearOfManufacture;
	}

	protected Car(String model, int maxSpeed, int yearOfManufacture) {
		this.model = model;
		this.maxSpeed = maxSpeed;
		this.yearOfManufacture = yearOfManufacture;
	}

	@Override
	public String toString() {
		return model + "[ " + maxSpeed + " " + yearOfManufacture + " ]";
	}

	public void print() {
		System.out.println("Car: " + this.getModel());
	}

}
