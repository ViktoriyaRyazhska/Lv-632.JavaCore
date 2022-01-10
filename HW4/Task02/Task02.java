package lesson004b;

import java.text.DateFormatSymbols;
import java.util.Locale;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Task02 {

	public static void main(String[] args) throws Exception {

		System.out.print("Enter the day NUMBER of the week: ");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int day = Integer.parseInt(br.readLine());

		String[] locales = { "uk", "pl", "ru", "en", "es", "fr", "de" };

		for (int i = 0; i < locales.length; i++) {

			DateFormatSymbols dfs = new DateFormatSymbols(new Locale(locales[i]));
			String[] nameDayOfWeek = dfs.getWeekdays();
			int dayOfWeek;
			for (dayOfWeek = 1; dayOfWeek < nameDayOfWeek.length; dayOfWeek++) {
				if (dayOfWeek == day) {
					switch (day) {
					case 1:
						System.out.println(locales[i] + " " + nameDayOfWeek[dayOfWeek].toUpperCase());
						break;
					case 2:
						System.out.println(locales[i] + " " + nameDayOfWeek[dayOfWeek].toUpperCase());
						break;
					case 3:
						System.out.println(locales[i] + " " + nameDayOfWeek[dayOfWeek].toUpperCase());
						break;
					case 4:
						System.out.println(locales[i] + " " + nameDayOfWeek[dayOfWeek].toUpperCase());
						break;
					case 5:
						System.out.println(locales[i] + " " + nameDayOfWeek[dayOfWeek].toUpperCase());
						break;
					case 6:
						System.out.println(locales[i] + " " + nameDayOfWeek[dayOfWeek].toUpperCase());
						break;
					case 7:
						System.out.println(locales[i] + " " + nameDayOfWeek[dayOfWeek].toUpperCase());
						break;
					default:
						System.out.println("Invalid input! Please enter week number between 1-7.");
					}
				}
			}
		}
	}
}