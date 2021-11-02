package lesson011f;

@SuppressWarnings("serial")
public class ArgumentOutOfRangeException extends Exception {
	  public ArgumentOutOfRangeException(String msg) {
			super("Invalid in range! The number entered is out of range.\n");
	  }

	  public ArgumentOutOfRangeException() {
	  }
}