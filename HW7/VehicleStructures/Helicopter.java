
public class Helicopter extends FlyingVehicle {

	private int weigth;
	private int maxHeigth;

	public Helicopter() {
		super();
	}

	public Helicopter(int passengers, int weigth, int maxHeigth) {
		super(passengers);
		this.weigth = weigth;
		this.maxHeigth = maxHeigth;
	}

	public int getWeigth() {
		return weigth;
	}

	public void setWeigth(int weigth) {
		this.weigth = weigth;
	}

	public int getMaxHeigth() {
		return maxHeigth;
	}

	public void setMaxHeigth(int maxHeigth) {
		this.maxHeigth = maxHeigth;
	}

	@Override
	void fly() {
		System.out.println("Helicopter flyes! Number of passengers = " + this.getPassengers() + " his weigth = "
				+ this.getWeigth() + " and maximum heigth = " + this.getMaxHeigth());
	}

	@Override
	void land() {
		System.out.println("Helicopter stands on land");
	}

}
