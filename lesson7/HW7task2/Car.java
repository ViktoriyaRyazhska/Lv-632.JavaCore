package HW7task2;

public class Car extends GroundVehicle {
	private String model;

	public Car(String model, int passengers) {
		super(passengers);
		this.model=model;
	}
	public void drive() {
		System.out.println(getModel()+" can transport "+getPassengers()+" people");

	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}

}
