
public class Chicken extends NonFlyingBird {
	private int weigth;
	
	public void fly() {
		System.out.println("Chickens color - "+this.getFeathers()+", lays eggs " + this.getLayEggs()+ ", has wings size - " 
	+ this.getSize() + " and his weigth is -" + this.weigth+" kg.");
	}

	
	
	public Chicken() {
		super();
	}



	public Chicken(String s1 ,String s2, int x,int weigth) {
		super(s1,s2,x);
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
		return "Chicken [weigth=" + weigth + "]";
	}
	
	
	
}
