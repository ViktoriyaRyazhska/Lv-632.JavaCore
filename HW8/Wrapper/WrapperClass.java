
public class WrapperClass<T> {
	T value;

	public WrapperClass(T value) {
		this.value = value;
	}

	public T getValue() {
		return value;
	}

	public void setValue(T value) {
		this.value = value;
	}

}
