package lesson006d;

public class Appl {

	public static void main(String[] args) {

		Line[] lines = new Line[4];

		lines[0] = new Line(new Point(31, 61), new Point(5, 31));
		lines[1] = new Line(new Point(11, 31), new Point(31, 61));
		lines[2] = new ColorLine(new Point(4, 11), new Point(7, 19), "BLACK");
		lines[3] = new ColorLine(new Point(2, 14), new Point(14, 50), "TANGO");

		for (Line line : lines) {
			line.print();
		}
	}

}
