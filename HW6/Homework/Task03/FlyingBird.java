package lesson006f;

public class FlyingBird extends Bird {

	private int sizeWings;

	public int getSizeWings() {
		return sizeWings;
	}

	public void setSizeWings(int sizeWings) {
		this.sizeWings = sizeWings;
	}

	public FlyingBird(String feathers, String layEggs, int sizeWings) {
		super(feathers, layEggs);
		this.sizeWings = sizeWings;
	}

	@Override
	public String toString() {
		return super.toString() + ", size wings - " + getSizeWings();
	}

	@Override
	public void fly() {
		System.out.println("Flying bird: " + this);
	}

}
