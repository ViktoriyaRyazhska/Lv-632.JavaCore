
public class Truck extends Car {

	public Truck(String model, int maxSpeed, int yearOfManufacture) {
		super(model, maxSpeed, yearOfManufacture);
	}
	
	@Override
	public void run() {
		System.out.println("My car Truck model " + this.getModel() + ", year of "+this.getYearOfManufacture() +", run max speed " + this.getMaxSpeed());
				
}

	@Override
	public void stop() {
		System.out.println("My car Truck model " + this.getModel() + ", year of "+ this.getYearOfManufacture() + ", stop when speed is "+ (this.getMaxSpeed()-this.getMaxSpeed())); 
	}

}