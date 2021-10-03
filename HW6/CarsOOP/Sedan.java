
public class Sedan extends Car {
	
	
	public Sedan(String model, int maxSpeed, int year) {
		super(model, maxSpeed, year);
	}

	@Override
	public void run() {
		System.out.println("Sedan runs!");
	}
	
	@Override
	public void stop() {
		System.out.println("Sedan stoped!");
	}
}
