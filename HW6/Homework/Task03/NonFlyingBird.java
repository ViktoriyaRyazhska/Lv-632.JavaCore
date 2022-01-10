package lesson006f;

public class NonFlyingBird extends Bird {

	private int bodyMass;

	public int getBodyMass() {
		return bodyMass;
	}

	public void setBodyMass(int bodyMass) {
		this.bodyMass = bodyMass;
	}

	public NonFlyingBird(String feathers, String layEggs, int bodyMass) {
		super(feathers, layEggs);
		this.bodyMass = bodyMass;
	}

	@Override
	public String toString() {
		return super.toString() + ", body mass - " + getBodyMass();
	}

	@Override
	public void fly() {
		System.out.println("Non-flying bird: " + this);
	}

}
