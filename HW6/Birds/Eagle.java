
public class Eagle extends FlyingBird {
	private int weigth;

	public void fly() {
		System.out.println("Color of eagle - " + this.getFeathers() + ", lays eggs in  - " + this.getLayEggs()
				+ ", has wings size - " + this.getWingsSize() + " and his weigth is -" + this.weigth+" kg.");
	}

	

	public Eagle(String s1,String s2, int wings,int weigth) {
		super(s1, s2, wings);
		this.weigth = weigth;
	}
	
	
	public int getWeigth() {
		return weigth;
	}

	public void setWeigth(int weigth) {
		this.weigth = weigth;
	}

	@Override
	public String toString() {
		return "Eagle [weigth=" + weigth + "]";
	}

}
