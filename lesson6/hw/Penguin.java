package lesson6.hw;

public class Penguin extends NonFlyingBird{
    
	public Penguin(String feathers, String layEggs) {
		super(feathers, layEggs);
	}

	public Penguin() {
		super();
	}
    
	@Override
	public String toString() {
		return "Penguin has " + getFeathers() +
				" feathers and lays " + getLayEggs()  + ".";
	}
}
