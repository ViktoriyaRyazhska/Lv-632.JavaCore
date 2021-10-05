package HW7task2;

public class Bus extends GroundVehicle {
	private String route;
	

	public Bus(String route, int passengers) {
		super(passengers);
		this.route=route;
	}
	public String getRoute() {
		return route;
	}
	public void setRoute(String route) {
		this.route = route;
	}
	public void drive() {
		System.out.println("The bus on route "+ getRoute()+", "+getPassengers()+" people on boart");

	}
	
}
