
public class Bus extends GroundVehicle {

	private String route;

	public Bus() {
		super();
	}

	public Bus(int passengers, String route) {
		super(passengers);
		this.route = route;
	}

	public String getRoute() {
		return route;
	}

	public void setRoute(String route) {
		this.route = route;
	}

	@Override
	void drive() {
		System.out.println("Bus is driving to " + this.route + ". Number of passengers = " + this.getPassengers());
	}

}
