package lesson6.hw;

public class Chicken extends NonFlyingBird {
	
	public Chicken(String feathers, String layEggs) {
		super(feathers, layEggs);
	}

	public Chicken() {
		super();
	}

	@Override
	public String toString() {
		return "Chicken has " + getFeathers() +
				" feathers and lays " + getLayEggs() + ".";
	}
}
