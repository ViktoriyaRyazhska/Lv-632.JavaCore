
public class PointAndLine {
	public static void main(String[] args) {
		Point somePoint = new Point(2,5);
		somePoint.print();
		System.out.println(somePoint.toString());;
		
		Line someLine = new Line(new Point(3,2), new Point(4,3));
		someLine.print();
		System.out.println(someLine.toString());
		
		ColorLine colored = new ColorLine((new Line(new Point(3,2), new Point(4,3))),Colors.BLACK);
		colored.print();
		System.out.println(colored.toString());
		
	}
}
