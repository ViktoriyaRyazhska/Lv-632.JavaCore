package lesson6.hw;

public class Swallow extends FlyingBird {
    
	public Swallow(String feathers, String layEggs) {
		super(feathers, layEggs);
	}

	public Swallow() {
		super();
	}
	
	@Override
	public String toString() {
		return "Swallow has " + getFeathers() +
				" feathers and lays " + getLayEggs() + ".";
	}

}
