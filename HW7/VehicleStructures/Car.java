
public class Car extends GroundVehicle {
	
	private String model;
	
	
	
	public Car() {
		super();
	}

	

	public Car(String model,int passengers) {
		super(passengers);
		this.model = model;
	}



	@Override
	void drive() {
		System.out.println("Car rides. Cars model - "+this.model+" Number of passengers -"+this.getPassengers());
	}

}
