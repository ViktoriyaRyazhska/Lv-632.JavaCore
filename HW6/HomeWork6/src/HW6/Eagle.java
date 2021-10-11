package HW6;

public class Eagle extends FlyingBird {
	private double hyperopia;
	
	public double getHyperopia() {
		return hyperopia;
	}

	public void setHyperopia(double hyperopia) {
		this.hyperopia = hyperopia;
	}

	public Eagle() {}
	
	public Eagle(String feathers, String layEggs,String notfly, double hyperopia) {
		super(feathers, layEggs, notfly);
		this.hyperopia=hyperopia;
	}	
	
	@Override
	public void fly() {
		System.out.println ("This bird is Eagle. He is flying!");
	}

	@Override
	public String toString() {
		return "Eagle [hyperopia=" + hyperopia + "]";
	}
	@Override
	public void println() {
		System.out.println ("Feathers= "+ super.getFeathers()+" LayEggs= "+super.getLayEggs()+ " Fly= "+ super.getFly() +" Hyperopia of bird = "+ hyperopia + "");
	}
}