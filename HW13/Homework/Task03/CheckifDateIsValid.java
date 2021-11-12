package lesson013f;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.time.format.ResolverStyle;

public class CheckifDateIsValid {

	  public static void main(String[] args) {

			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			System.out.println("Input a valid DATE [mm.dd.yy] format: ");
			String date = null;
			
			try {
				  while ((date = br.readLine()) != null) {

						System.out.println("You entered this date for verification: " + date);
						System.out.println(validateDate(date));
				  }

			} catch (IOException e) {
				  System.err.println(e.getMessage());
			}
	  }

	  public static boolean validateDate(String date) {
			boolean valid = false;
			try {
				  LocalDate.parse(date,
							  DateTimeFormatter.ofPattern("MM.dd.uu").withResolverStyle(ResolverStyle.STRICT));
				                                                    // ResolverStyle.STRICT for 30, 31 days checking, and also leap year
				  valid = true;

			} catch (DateTimeParseException e) {
				  System.err.println("Invalid date format!");

				  valid = false;
			}
			return valid;
	  }

}
