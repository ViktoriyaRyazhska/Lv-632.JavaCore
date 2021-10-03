
public class NonFlyingBird extends Bird {
	private int size;

	@Override
	public void fly() {
		System.out.println("It cant fly=(");
	}

	public NonFlyingBird() {
		super();
	}

	public NonFlyingBird(String s1,String s2,int size) {
		super(s1,s2);
		this.size = size;
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}
	
	
	
}
