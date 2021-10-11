
public class Sedan extends Car {

	public Sedan(String model, int maxSpeed, int yearOfManufacture) {
		super(model, maxSpeed, yearOfManufacture);
	}

	
	@Override
	public void run() {
		System.out.println("My car Sedan model " + this.getModel() + ", year of "+this.getYearOfManufacture() +", run max speed " + this.getMaxSpeed());
		
	}

	@Override
	public void stop() {
		System.out.println("My car Sedan model " +this.getModel() + ", year of "+ this.getYearOfManufacture() + ", stop when speed is "+ (this.getMaxSpeed()-this.getMaxSpeed())); 
	}

}