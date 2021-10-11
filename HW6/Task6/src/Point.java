//Point with attributes x and y

public class Point {

	private double x;
	private double y;
	
	public double getX() {
		return x;
	}
	public void setX(double x) {
		this.x = x;
	}
	public double getY() {
		return y;
	}
	public void setY(double y) {
		this.y = y;
	}
	
	public Point() {}
	
	public Point (double x, double y) {
		this.x = x;
		this.y = y;
	}
	@Override
	public String toString() {
		return "[x=" + x + ", y=" + y + "]";
	}
	
	public void print () {
		System.out.println(this);
	}	
}