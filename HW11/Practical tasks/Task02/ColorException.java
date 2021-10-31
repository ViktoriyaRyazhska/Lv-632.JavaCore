package lesson011c;

@SuppressWarnings("serial")
public class ColorException extends Exception {
	  public ColorException(String msg) {
			super("Invalid color");
	  }

	  public ColorException() {
	  }
}