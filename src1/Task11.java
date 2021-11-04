import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Task11 {

	  public static void execute11() {

			System.out.println("A credit card number must have between 13 and 16 digits. It must start with:\n"
						+ "4 for Visa cards\n" + "5 for Master cards\n" + "37 for American Express cards\n"
						+ "6 for Discover cards\n" + "The problem can be solved by using Luhn algorithm.\n");

			String cardNumber = null;
			BufferedReader br = new BufferedReader(new InputStreamReader((System.in)));
			System.out.print("Enter between 13 and 16 digits: ");

			try {
				  cardNumber = br.readLine();
			} catch (IOException e) {
				  e.printStackTrace();
			}

			boolean validCreditCardNumber = isValidCreditCardNumber(cardNumber);

			if (validCreditCardNumber) {
				  System.out.println(cardNumber + " =>is valid as per luhn algorithm");
			} else {
				  System.out.println(cardNumber + " =>is not valid as per luhn algorithm");
			}
	  }

	  public static boolean isValidCreditCardNumber(String cardNumber) {
			int[] cardIntArray = new int[cardNumber.length()];

			for (int i = 0; i < cardNumber.length(); i++) {
				  char c = cardNumber.charAt(i);
				  cardIntArray[i] = Integer.parseInt("" + c);
			}

			for (int i = cardIntArray.length - 2; i >= 0; i = i - 2) {
				  int num = cardIntArray[i];
// ----------------------------------------------------------------------step 1
				  num = num * 2;
				  if (num > 9) {
// ----------------------------------------------------------------------step 2
						num = num % 10 + num / 10;
				  }
				  cardIntArray[i] = num;
			}
// ----------------------------------------------------------------------step 3
			int sum = sumDigits(cardIntArray);

			System.out.println(sum);
// ----------------------------------------------------------------------step 4
			if (sum % 10 == 0) {
				  return true;
			}
			return false;
	  }

	  public static int sumDigits(int[] arr) {
			return Arrays.stream(arr).sum();
	  }

}
