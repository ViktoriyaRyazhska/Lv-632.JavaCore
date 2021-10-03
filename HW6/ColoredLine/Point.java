
public class Point {
	private int a;
	private int b;
	
	public void print() {
		System.out.println("Its a point! and its attributes are: a = "+ this.a+ " and b = "+ this.b);
	}
	
	
	public int getA() {
		return a;
	}


	public void setA(int a) {
		this.a = a;
	}


	public int getB() {
		return b;
	}


	public void setB(int b) {
		this.b = b;
	}


	public Point() {}
	
	
	public Point(int a, int b) {
		this.a = a;
		this.b = b;
	}


	@Override
	public String toString() {
		return "Point [a=" + a + ", b=" + b + "]";
	}
	
	
}
