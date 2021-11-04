package lesson011f;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ReadNumberInRange {

	  private static final int START = 1;
	  private static final int END = 100;

	  public static void main(String[] args) {
			BufferedReader br = new BufferedReader(new InputStreamReader((System.in)));
			for (int i = 1; i < 11; i++) {

				  try {
						isInRangeinputInt(getUserInput(br));
				  } catch (ArgumentOutOfRangeException e) {
						System.err.println(e.getMessage());
				  }
			}
	  }

	  public static boolean itsInteger(String input) {
			return input.matches("\\d+");
	  }

	  public static int getUserInput(BufferedReader br) {
			System.out.printf("Please enter number in the range from %d to %d: ", START, END);
			int inputInt = 0;
			try {
				  String input = br.readLine();
				  if (itsInteger(input))
						inputInt = Integer.parseInt(input);
			} catch (NumberFormatException | IOException e) {
				  System.err.println("Number Format Exception occured!");
			}
			return inputInt;
	  }

	  private static boolean isInRange(int inputInt, int start, int end) {
			return inputInt >= START && inputInt <= END;
	  }

	  public static void isInRangeinputInt(int inputInt) throws ArgumentOutOfRangeException {
			if (isInRange(inputInt, START, END)) {
				  System.out.println("Congratulations! This number is in the Range!\n");
			} else {
				  throw new ArgumentOutOfRangeException("The number entered is out of range.\n");
			}
	  }

}
