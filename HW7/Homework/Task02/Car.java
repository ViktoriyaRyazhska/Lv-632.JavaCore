package lesson007m;

public class Car extends GroundVehicle {
	private String model;

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public Car(int passengers, String model) {
		super(passengers);
		this.model = model;
	}

	@Override
	public void drive() {
		System.out.println("Ground Vehicle the car has a model: " + getModel() + ". Passenger capacity: "
				+ super.getPassengers());
	}

}