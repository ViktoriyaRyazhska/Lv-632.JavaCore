package HW7task2;

public class Boat extends WaterVehicle {
	private int Volume;

	public Boat(String Vname, int passengers, int Volume) {
		super(Vname, passengers);
		this.Volume = Volume;
	}

	public void isSalling() {
		System.out.println(getPassengers() + " people in rhe boat");
	}

	public int getVolume() {
		return Volume;
	}

	public void setVolume(int volume) {
		Volume = volume;
	}

}
