package lesson10.HW10;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class task3 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Entre sentences...");
		String text = scan.nextLine();
		Pattern pat = Pattern.compile("\\$(\\d*)(\\.\\d{2})");
		Matcher match = pat.matcher(text);

		if (match.find()) {
			System.out.println(match.group());
		}
	}

}
