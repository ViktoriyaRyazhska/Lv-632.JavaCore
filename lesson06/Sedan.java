package lesson6;

public class Sedan extends Car {

	public Sedan(String model, int maxSpeed, int yearOfManufacture) {
		super(model, maxSpeed, yearOfManufacture);
		
	}
	public void run() {
		System.out.println("Sedan "+model+" run, max speed is "+maxSpeed);
	}
	public void stop() {
		System.out.println("Sedan "+model+" stop, year of manufacture "+yearOfManufacture);
	}
}
