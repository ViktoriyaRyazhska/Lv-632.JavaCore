package lesson011c;

@SuppressWarnings("serial")
public class TypeException extends Exception {
	  public TypeException(String msg) {
			super("Invalid type");
	  }

	  public TypeException() {
	  }
}