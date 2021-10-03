
public class Swallow extends FlyingBird{
	private int weigth;
	
	public void fly() {
		System.out.println("Color of swallow - " + this.getFeathers() + ", lays eggs in  - " + this.getLayEggs()
				+ ", has wings size - " + this.getWingsSize() + " and his weigth is -" + this.weigth+" kg.");
	}

	public Swallow() {
		super();
	}

	public Swallow(String s1,String s2,int i,int weigth) {
		super(s1,s2,i);
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
		return "Swallow [weigth=" + weigth + "]";
	}
	
	
	
}
