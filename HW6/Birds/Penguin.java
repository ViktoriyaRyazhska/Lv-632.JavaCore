
public class Penguin extends NonFlyingBird {
	
	private int weigth;

	public void fly() {
		System.out.println("Penguins color - "+this.getFeathers()+", lays eggs " + this.getLayEggs()+ ", has wings size - " 
	+ this.getSize() + " and his weigth is -" + this.weigth+" kg.");
	}	
	
	public Penguin() {
		super();
	}

	public Penguin(String s1,String s2,int size, int weigth) {
		super(s1,s2,size);
		this.weigth = weigth;
	}

	@Override
	public String toString() {
		return "Penguin [weigth=" + weigth + "]";
	}
	
	
	
}
