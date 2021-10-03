
public class Truck extends Car{
	
		
	
	public Truck(String model, int maxSpeed, int year) {
		super(model, maxSpeed, year);
	}
	@Override
	public void run() {
		System.out.println("Truck runs!");
	}
	@Override
	public void stop() {
		System.out.println("Truck stoped!");
	}
	
	
}
