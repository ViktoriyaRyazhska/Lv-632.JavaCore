package lesson6;

public class Main {

	public static void main(String[] args) {
	

	Line[] Line= new Line[3];
	Line[0]=new Line(new Point(3,4), new Point(5,8));
	Line[1]=new ColorLine(new Point(6,7),new Point (8,9),"green");
	Line[2]=new ColorLine(new Point(3,5),new Point (5,6),"black");
	

	System.out.println(Line[0]);
	System.out.println(Line[1]);
	System.out.println(Line[2]);
	Line[0].print();
	Line[1].print();

	}
}
