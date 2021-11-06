import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class Task08 {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static String[] ones = { "", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten",
			"eleven", "twelve", " thirteen", " fourteen", " fifteen", " sixteen", " seventeen", "eighteen",
			"nineteen" };
	static String[] tens = { "", "", "twenty", " thirty", " forty", " fifty", " sixty", " seventy", " eighty",
			"ninety" };

	public static void execute8() throws NumberFormatException, IOException {
		System.out.println("Enter number in range from 1 to 1 000 000 ");
		int userNumber = Integer.parseInt(br.readLine());
		if (userNumber > 0 && userNumber <= 1000000) {
			System.out.println(thousands1000(userNumber));
		} else {
			System.out.println("Number not in range from 1 to 1 000 000 ");
		}
	}

	private static String ones(int a) {
		return ones[a] ;
	}

	private static String tens(int a) {
		int integer = a / 10;
		int rest = a % 10;
		String result = tens[integer] + " " + ones(rest);
		return result;
	}

	private static String hundreds(int a) {
		int integer = a / 100;
		int rest = a % 100;
		String result = "";
		if (integer >= 20) {
			result = ones(integer) + " hundred ";
		}
		if (rest < 20) {
			result += ones(rest);
		} else {
			result += tens(rest);
		}
		return result;
	}

	private static String thousands1000(int a) {
		int integer = a / 1000;
		int rest = a % 1000;
		String result = "";
		if (integer == 1000) {
			result = "one million";
		} else if (integer > 99) {
			result = hundreds(integer) + " thousand" + " ";
		} else if (integer >= 20) {
			result = tens(integer) + " thousand" + " ";
		} else if (integer >= 1 && integer < 20) {
			result = ones(integer) + " thousand" + " ";
		}
		return firstUpperCase(result + hundreds(rest));
	}

	public static String firstUpperCase(String word) {
		if(word == null || word.isEmpty()) return "";
		return word.substring(0, 1).toUpperCase() + word.substring(1);
	}
}
