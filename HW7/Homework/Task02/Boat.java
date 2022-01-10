package lesson007m;

public class Boat extends WaterVehicle {
	private int Volume;

	public int getVolume() {
		return Volume;
	}

	public void setVolume(int volume) {
		Volume = volume;
	}

	public Boat(int passengers, int volume) {
		super(passengers);
		Volume = volume;
	}

	@Override
	public void isSalling() {
		System.out.println("Water Vehicle average the boat volume: " + getVolume() + ". Passenger capacity: " + super.getPassengers());
	}
	
}