
public class FlyingBird extends Bird {
	private int wingsSize;

	

	public FlyingBird() {
		super();
	}

	public FlyingBird(String s1, String s2, int wingsSize) {
		super(s1, s2);
		this.wingsSize = wingsSize;
	}

	public int getWingsSize() {
		return wingsSize;
	}

	public void setWingsSize(int wingsSize) {
		this.wingsSize = wingsSize;
	}
	
	
	
	@Override
	public String toString() {
		return "FlyingBird [wingsSize=" + wingsSize + "]";
	}

	@Override
	public void fly() {
		System.out.println("New bird that flyes. Color - "+this.getFeathers()+" lays eggs in = "+this.getLayEggs()+" and wings size = "+ this.wingsSize);
	}
}
