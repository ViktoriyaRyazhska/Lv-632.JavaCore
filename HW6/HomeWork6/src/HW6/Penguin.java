package HW6;

public class Penguin extends NonFlyingBird {
	private double height;
	
	public double getHeight() {
		return height;
	}

	public void setHeight (double height) {
		this.height = height;
	}
	
	public Penguin() {}
	
	public Penguin(String feathers, String layEggs,String notfly, double height) {
		super(feathers, layEggs, notfly);
		this.height=height;
	}	
	
	@Override
	public void fly() {
		System.out.println ("This bird is Penguin. He does not fly(");
	}

	@Override
	public String toString() {
		return "Penguin [height=" + height + "]";
	}
	@Override
	public void println() {
		System.out.println ("Feathers= "+ super.getFeathers()+" LayEggs= "+super.getLayEggs()+ " Bird height = "+ height + "");
	}
}