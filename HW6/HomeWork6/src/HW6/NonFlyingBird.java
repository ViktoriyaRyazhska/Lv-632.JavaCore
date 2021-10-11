package HW6;

public class NonFlyingBird extends Bird {

	private String notfly;
	
	public String getFly() {
		return notfly;
	}

	public void setFly(String notfly) {
		this.notfly = notfly;
	}

	public NonFlyingBird() {}
	
	public NonFlyingBird(String feathers, String layEggs, String notfly) {
		super(feathers, layEggs);
		this.notfly=notfly;
	}
	
	@Override
	public void fly() {
		System.out.println ("This bird can not fly.");
	}

	@Override
	public String toString() {
		return "NonFlyingBird [notfly=" + notfly + "]";
	}
	@Override
	public void println() {
		System.out.println ("Feathers= "+ super.getFeathers()+" LayEggs= "+super.getLayEggs()+" NonFlyingBird="+ notfly );
	}
}