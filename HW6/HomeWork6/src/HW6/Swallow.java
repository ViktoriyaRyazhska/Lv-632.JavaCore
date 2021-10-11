package HW6;

public class Swallow extends FlyingBird {
	private double mouth;
	
	public double getMouth() {
		return mouth;
	}

	public void setMouth(double mouth) {
		this.mouth = mouth;
	}

	public Swallow() {}
	
	public Swallow(String feathers, String layEggs,String notfly, double mouth) {
		super(feathers, layEggs, notfly);
		this.mouth=mouth;
	}	
	
	@Override
	public void fly() {
		System.out.println ("This bird is Swallow. She is flying!");
	}

	@Override
	public String toString() {
		return "Swallow [mouth=" + mouth + "]";
	}
	@Override
	public void println() {
		System.out.println ("Feathers= "+ super.getFeathers()+" LayEggs= "+super.getLayEggs()+ " Mouth size = "+ mouth + "");
	}
}