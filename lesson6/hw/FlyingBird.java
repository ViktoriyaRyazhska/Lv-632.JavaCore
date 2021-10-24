package lesson6.hw;

public class FlyingBird extends Bird {

	public FlyingBird(String feathers, String layEggs) {
		super(feathers, layEggs);
	}
	
	public FlyingBird() {
		super();
	}

	@Override
	public void fly() {
		System.out.println("This bird is able to fly.");
	}
}
