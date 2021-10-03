package lesson6;

public class ColorLine extends Line {
 public Point point;
 public Point point2;
 
	String color;
public ColorLine(Point point, Point point2, String color) {
	super(point,point2);
	this.point=point;
	this.point2=point2;
	this.color=color;
	
}
@Override
public void print() {
	System.out.println("Line contains: "+point+point2+color);
}

@Override
public String toString() {
	return "ColorLine [point=" + point + ", point2=" + point2 + ", color=" + color + "]";
}
			

}
