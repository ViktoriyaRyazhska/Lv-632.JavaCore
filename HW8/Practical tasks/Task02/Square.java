package lesson008c;

public class Square implements Shape {

	  public double side;
	  
	  public Square(double side) {
			this.side = side;
	  }

	  @Override
	  public double getArea() {
			return side * side;
	  }

}