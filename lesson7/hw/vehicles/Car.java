package lesson7.hw.vehicles;

public class Car extends GroundVehicle {
	
	private String model;

	public Car(int passenegrs, String model) {
		super(passenegrs);
		this.model = model;
	}

	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}

	@Override
	public void drive() {
		System.out.println("The car is driving.");
	}
	
}
