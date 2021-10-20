package lesson008g;

public class Wrapper<T> {
	  private T value;

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