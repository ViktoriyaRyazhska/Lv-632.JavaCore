package HW6;

public class Chicken extends NonFlyingBird {
	private double mass;
	
	public double getMass() {
		return mass;
	}

	public void setMass(double mass) {
		this.mass = mass;
	}
	
	public Chicken() {}
	
	public Chicken(String feathers, String layEggs,String notfly, double mass) {
		super(feathers, layEggs, notfly);
		this.mass=mass;
	}	
	
	@Override
	public void fly() {
		System.out.println ("This bird is Chicken. He does not fly(");
	}

	@Override
	public String toString() {
		return "Chicken [mass=" + mass + "]";
	}
	@Override
	public void println() {
		System.out.println ("Feathers= "+ super.getFeathers()+" LayEggs= "+super.getLayEggs()+ " Mass of bird = "+ mass + "");
	}
}