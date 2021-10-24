package lesson7.hw.vehicles;

public class Bus extends GroundVehicle {
	
	private String route;

	public Bus(int passenegrs, String route) {
		super(passenegrs);
		this.route = route;
	}

	public String getRoute() {
		return route;
	}
	public void setRoute(String route) {
		this.route = route;
	}

	@Override
	public void drive() {
		System.out.println("The bus is driving.");
	}
}
