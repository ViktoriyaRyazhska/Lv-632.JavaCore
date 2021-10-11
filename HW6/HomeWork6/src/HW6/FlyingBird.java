package HW6;

public class FlyingBird extends Bird {
	private String fly;
	
	public String getFly() {
		return fly;
	}
	
	public void setFly(String fly) {
		this.fly = fly;
	}

	public FlyingBird() {}
	
	public FlyingBird(String feathers, String layEggs, String fly) {
		super(feathers, layEggs);
		this.fly=fly;
	}
	
	
	@Override
	public void fly() {
		System.out.println ("This bird can fly.");
	}
	
	
	@Override
	public String toString() {
		return "FlyingBird [fly=" + fly + "]";
	}

	@Override
	public void println() {
		System.out.println ("Feathers= "+ super.getFeathers()+" LayEggs= "+super.getLayEggs()+" FlyingBird="+ fly );
	}
}