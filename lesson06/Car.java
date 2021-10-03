package lesson6;

public abstract class Car {

	String model;
	 int maxSpeed;
	 int yearOfManufacture;
	public Car(String model, int maxSpeed, int yearOfManufacture) {
		this.model=model;
		this.maxSpeed=maxSpeed;
		this.yearOfManufacture=yearOfManufacture;
	}
	public void run() {
		System.out.println("car run");
	}
	public void stop() {
		System.out.println("car stop");
	}
}
