package lesson006d;

public class ColorLine extends Line {
	private String color;

	public String getColor() {
		return color;
	}

	public ColorLine(Point point1, Point point2, String color) {
		super(point1, point2);
		this.color = color;
	}

	@Override
	public String toString() {
		return super.toString() + ", color is " + getColor();
	}

	public void print() {
		System.out.println(this);
	}

}
