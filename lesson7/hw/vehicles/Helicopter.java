package lesson7.hw.vehicles;

public class Helicopter extends  FlyingVehicle {
	
	private int weight;
	private int maxHeight;
	
	public Helicopter(int passenegrs, int weight, int maxHeight) {
		super(passenegrs);
		this.weight = weight;
		this.maxHeight = maxHeight;
	}

	public int getWeight() {
		return weight;
	}
	public void setWeight(int weight) {
		this.weight = weight;
	}
	public int getMaxHeight() {
		return maxHeight;
	}
	public void setMaxHeight(int maxHeight) {
		this.maxHeight = maxHeight;
	}

	@Override
	public void fly() {
		System.out.println("The helicopter is flying.");
	}

	@Override
	public void land() {
		System.out.println("The helicopter is on land.");
	}	

}
