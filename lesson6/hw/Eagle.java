package lesson6.hw;

public class Eagle extends FlyingBird {
    
	public Eagle (String feathers, String layEggs) {
		super(feathers, layEggs);
	}

	public Eagle() {
		super();
	}
	
	@Override
	public String toString() {
		return "Eagle has " + getFeathers() +
				" feathers and lays " + getLayEggs() + ".";
	}
}
