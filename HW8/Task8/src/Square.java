
public class Square implements Shape {
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
	public Square() {};



	public void print() {
		System.out.print ("This is square");
		
	}

	@Override
	public String toString() {
		return "Square [x=" + x + ", y=" + y + "]";
	}
	
}