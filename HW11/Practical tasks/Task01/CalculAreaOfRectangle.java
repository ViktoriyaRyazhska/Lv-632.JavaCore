package lesson011b;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import lesson011b.Rectangle.NegativeNumberException;

class Rectangle {

	  int a;
	  int b;
	  int area;

	  void squareRectangle(int a, int b) throws NegativeNumberException, IllegalArgumentException {
			if (a < 0 || b < 0)
				  throw new NegativeNumberException("Negative number not permitted!");
			if (a == 0 || b == 0)
				  throw new IllegalArgumentException("Argument 'multiplier' is 0");
			else {
				  area = this.a * this.b;
				  System.out.println("\nArea of rectangle is: " + area);
			}
	  }

	  @SuppressWarnings("serial")
	  class NegativeNumberException extends Exception {
			public NegativeNumberException(String msg) {
				  super("Negative Number Exception: negative numbers not permitted!");
			}

			public NegativeNumberException() {
			}
	  }

}

public class CalculAreaOfRectangle {

	  public static void main(String[] args) {
			System.out.println("The area of a rectangle formula is => Length X Breadth");
			Rectangle rectangle = new Rectangle();
			BufferedReader br = new BufferedReader(new InputStreamReader((System.in)));

			try {
				  System.out.print("Enter the length (any valid integer): ");
				  rectangle.a = Integer.parseInt(br.readLine());
				  System.out.println("You entered: " + rectangle.a);
				  System.out.print("\nEnter the breadth (any valid integer): ");
				  rectangle.b = Integer.parseInt(br.readLine());
				  System.out.println("You entered: " + rectangle.b);

			} catch (NumberFormatException e) {
				  System.err.println("Number Format Exception occured");
			} catch (IOException e) {
				  e.printStackTrace();
			}

			try {
				  rectangle.squareRectangle(rectangle.a, rectangle.b);
			} catch (NegativeNumberException e) {
				  System.err.println(e.getMessage());
			} catch (IllegalArgumentException m) {
				  System.err.println(m.getMessage());
			}
	  }

}