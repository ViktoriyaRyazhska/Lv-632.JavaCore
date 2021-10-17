
public class Boat extends WaterVehicle {
	int volume;
	
	public int getVolume() {
		return volume;
	}

	public void setVolume(int volume) {
		this.volume = volume;
	}

	public Boat () {};
	
	@Override
	public void isSailing() {};
}
