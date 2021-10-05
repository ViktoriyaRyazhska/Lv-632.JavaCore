package HW7task2;

public class Helicopter extends FlyingVehicle {
	private int weight;
	private int maxHeight;
	
	

	public Helicopter(String Vname, int passengers, int weight, int maxHeight) {
		super(Vname, passengers);
		this.maxHeight=maxHeight;
		this.weight=weight;
		
	}
	@Override
	public void fly() {
		System.out.println("Helicopter "+getVname()+" is flying "+getPassengers()+" people on boart");
	}
	@Override
	public void land() {
		System.out.println("Helicopter "+getVname()+" has landed, maxHeight - "+getMaxHeight()+"meters");

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
}
