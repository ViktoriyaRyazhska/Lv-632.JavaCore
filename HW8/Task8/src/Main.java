
public class Main {

	public static void main(String[] args) {
		Wrapper <Shape> squareWrapper = new Wrapper <>(new Square());
		 System.out.println(squareWrapper.get());
		Wrapper <Shape> circleWrapper = new Wrapper <>(new Circle());
		 System.out.println(circleWrapper.get());
		 }
}