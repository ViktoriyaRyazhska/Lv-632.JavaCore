package lesson6;

public class Line {
public Point point;
public Point point2;


public Line(Point point, Point point2) {
this.point=point;
this.point2=point2;
}

public void print() {
	System.out.println("Line contains: "+point+point2);
}
@Override
public String toString() {
	return "Line [point=" + point + ", point2=" + point2 + "]";
}


}
