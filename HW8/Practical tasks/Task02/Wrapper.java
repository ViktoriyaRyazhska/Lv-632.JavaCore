package lesson008c;

public class Wrapper<T extends Shape> {

	  private T t;

	  public void set(T t) {
			this.t = t;
	  }

	  public T get() {
			return t;
	  }

	  public Wrapper(T t) {
	  }

	  Wrapper<Shape> circleWrp = new Wrapper<>(new Circle(10.50));
	  Wrapper<Shape> squareWrp = new Wrapper<>(new Square(14.44));
//			Wrapper<String> strWrp = new Wrapper<>("Hello");
//			Wrapper<Integer> intWrp = new Wrapper<>(31);

}
