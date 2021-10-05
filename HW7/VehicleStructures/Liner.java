
public class Liner extends WaterVehicle {
	private int floors;

	public Liner() {
		super();
	}

	public Liner(int passenger,int floors) {
		super(passenger);
		this.floors = floors;
	}
	
	
	public int getFloors() {
		return floors;
	}

	public void setFloors(int floors) {
		this.floors = floors;
	}

	@Override
	public void isSailing() {
		System.out.println("Liner sails in sea or ocean. Number of floars = "+this.getFloors()+" "
						+ "Number of passengers = "+this.getPassengers());
	}
}
