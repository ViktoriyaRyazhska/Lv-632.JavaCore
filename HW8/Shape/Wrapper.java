
public class Wrapper<T extends Shape> {
	// T буде повертати елементи Shape;
	private T t;

	public Wrapper(T t) {

		this.t = t;
	}

	public T getT() {
		return t;
	}

	public void setT(T t) {
		this.t = t;
	}

}
