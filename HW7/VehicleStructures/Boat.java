
public class Boat extends WaterVehicle {

	private int volume;

	public Boat() {
		super();
	}

	public Boat(int passenger, int volume) {
		super(passenger);
		this.volume = volume;
	}

	public int getVolume() {
		return volume;
	}

	public void setVolume(int volume) {
		this.volume = volume;
	}

	@Override
	public void isSailing() {
		System.out.println("Boat is sailing. Number of passengers = "+this.getPassengers()+" Volume = "+this.volume);
	}

}
