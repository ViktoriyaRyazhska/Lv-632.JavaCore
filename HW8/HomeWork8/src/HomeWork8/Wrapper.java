package HomeWork8;
//Create Wrapper<T>  class with private field of T type which is called value;

public class Wrapper<T> {
	
	private T value;

//In Wrapper class create public constructor and setValue and getValue methods for value field.

	public T getValue() {
		return value;
	}

	public void setValue(T value) {
		this.value = value;
	}
	
	public Wrapper(T value) {
		this.value = value;
	}

}