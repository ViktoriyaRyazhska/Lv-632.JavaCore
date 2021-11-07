package lesson011d;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ReadNumberAndDiv {

	  public static void main(String[] args) {
			BufferedReader br = new BufferedReader(new InputStreamReader((System.in)));
			double numerator = 0.0;
			double denominator = 0.0;
			double quotient = 0.0;
			
			numerator = getUserInput(br);
			denominator = getUserInput(br);
			quotient = div(numerator, denominator);
			System.out.println("\nQuotient: " + quotient);

	  }

	  public static boolean isDouble(double innum) {
			return (innum % 1) != 0;
	  }

	  public static double getUserInput(BufferedReader br) {
			double innum = 0.0;
			System.out.print("Please enter number =>Double: ");
						try {
				  innum = Double.parseDouble(br.readLine());
				  if (isDouble(innum))
						System.out.println("Entered number =>DOUBLE: " + innum + "\n");
				  else
						System.out.println("Entered number =>INTEGER: " + innum + "\n");

			} catch (NumberFormatException | IOException e) {
				  System.err.println("Number Format Exception occured. " + e);
			}
			return innum;
	  }

	  public static double div(double numerator, double denominator) throws ArithmeticException {
			try {
				  if (denominator == 0)
						throw new ArithmeticException(
									"Argument 'divisor' is 0. Divided by zero operation cannot possible!");
			} catch (ArithmeticException e) {
				  System.err.println(e.getMessage());
			}
			return numerator / denominator;
	  }

}
