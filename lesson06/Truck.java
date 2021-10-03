package lesson6;

public class Truck extends Car{

	public Truck(String model, int maxSpeed, int yearOfManufacture) {
		super(model, maxSpeed, yearOfManufacture);
	
	}
 
	public void run() {
		System.out.println("Truck "+model+" run");
	}
	public void stop() {
		System.out.println("Truck "+model+" stop");
	}
	}
	
	

	
	
	
	


