package lesson6.hw;

public class NonFlyingBird extends Bird {
	
	public NonFlyingBird(String feathers, String layEggs) {
		super(feathers, layEggs);
	}
	
	public NonFlyingBird() {
		super();
	}
    
	@Override
	public void fly() {
		System.out.println("This bird is not able to fly.");
	}
}
