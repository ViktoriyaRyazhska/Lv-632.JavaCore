//Line which contains two object of Point class

public class Line extends Point  {
	
	private Point Pointline1; 			 //create 1 object of point class
	private Point Pointline2;			//create 2 object of point class
	
										// create get & set
	public Point getPointline1() {
		return Pointline1;
	}

	public void setPointline1(Point pointline1) {
		Pointline1 = pointline1;
	}

	public Point getPointline2() {
		return Pointline2;
	}

	public void setPointline2(Point pointline2) {
		Pointline2 = pointline2;
	}
									// constructor
	public Line () {} 
	
	public Line (Point Pointline1) {
		this.Pointline1=Pointline1;
	} 
	
	public Line (Point Pointline1, Point Pointline2) {
		//super();										//????????
		this.Pointline1=Pointline1;
		this.Pointline2=Pointline2;
	} 
	
	@Override
	public String toString() {
		return "Line [First object" + Pointline1 + ", Second object" + Pointline2 + "]";
	}

	public void print () {
		System.out.println(this);
	}
}