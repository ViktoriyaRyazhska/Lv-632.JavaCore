//In main() method create array of Line and add some Line and ColorLine to it. Call method print() for all of it. 

public class Main {

	public static void main(String[] args) {
		
		Line [] line = new Line[3];
		
		line [0] = new Line((new Point (6,8.6)), new Point (4.2,6));
		line [1] = new Line((new Point (4,3)), new Point (7,1));
		line [2] = new Line((new Point (7,5.5)), new Point (3,8));
		
		for (int i = 0; i < line.length; i++) {
			line[i].print();
		}		
		
		ColorLine cl = new ColorLine ((new Line (new Point (7,5), new Point (3,8))), "red");
		cl.print();
	}
}