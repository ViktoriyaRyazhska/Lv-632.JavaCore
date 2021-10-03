
public class Line extends Point {
	
	private Point somePoint1;
	private Point somePoint2;
	
	public void print() {
		System.out.println("Now its a line ;)");
	}
	
	public Line() { }


	public Line(Point somePoint1, Point somePoint2) {
		super();
		this.somePoint1 = somePoint1;
		this.somePoint2 = somePoint2;
	}


	public Point getSomePoint1() {
		return somePoint1;
	}


	public void setSomePoint1(Point somePoint1) {
		this.somePoint1 = somePoint1;
	}


	public Point getSomePoint2() {
		return somePoint2;
	}


	public void setSomePoint2(Point somePoint2) {
		this.somePoint2 = somePoint2;
	}


	@Override
	public String toString() {
		return "Line [somePoint1=" + somePoint1 + ", somePoint2=" + somePoint2 + "]";
	}
	
	
	

	
		
}
