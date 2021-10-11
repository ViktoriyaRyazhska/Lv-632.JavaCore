package lesson006d;

public class Line {

	private Point point1;
	private Point point2;

	public Line(Point point1, Point point2) {
		this.point1 = point1;
		this.point2 = point2;
	}

	public Point getPoint1() {
		return point1;
	}

	public Point getPoint2() {
		return point2;
	}

	@Override
	public String toString() {
		return "Point1 " + getPoint1() + ", Point2 " +  getPoint2();
	}

	public void print() {
		System.out.println(this);
	}

}
