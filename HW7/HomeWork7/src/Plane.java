
public class Plane extends FlyingVehicle {
	int maxDistance;

	public int getMaxDistance() {
		return maxDistance;
	}

	public void setMaxDistance(int maxDistance) {
		this.maxDistance = maxDistance;
	}
	public Plane () {};
	
	@Override
	public void fly () {};
	@Override
	public void land () {};
}
