package lesson8;

public class Wrapper<T extends Shape> {

	public Wrapper(T Shape) {

		Wrapper<Circle> circleWrapper = new Wrapper<>(new Circle(2));
		Wrapper<Square> squareWrapper = new Wrapper<>(new Square(3));
		Wrapper<String> stringWrapper = new Wrapper<>("Hello");
		Wrapper<Square> squareWrapper2 = new Wrapper<>(new Square(4));
	}
}