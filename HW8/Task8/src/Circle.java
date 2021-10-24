
public class Circle implements Shape {
	
	private int x;
	private int y;
		
	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}
	public Circle() {};

	public void print() {
		System.out.print ("This is circle");
		
	}

	@Override
	public String toString() {
		return "Circle [x=" + x + ", y=" + y + "]";
	}
	
}