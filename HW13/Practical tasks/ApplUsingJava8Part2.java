package lesson013b;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Month;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.time.format.TextStyle;
import java.time.temporal.TemporalAdjusters;
import java.util.Locale;

public class ApplUsingJava8Part2 {

	  public static void main(String[] args) {

//get current day
			LocalDate currentDate = LocalDate.now();
			System.out.println("Current day: "
						+ currentDate.getDayOfWeek().getDisplayName(TextStyle.FULL_STANDALONE, Locale.getDefault()));

//get all MONDAYS 2021
			int year = 2021;
			LocalDate now = LocalDate.of(year, Month.JANUARY, 1);
			LocalDate MONDAY = now.with(TemporalAdjusters.firstInMonth(DayOfWeek.MONDAY));
			do {
				  System.out.println(MONDAY.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL)));
				  MONDAY = MONDAY.plus(Period.ofDays(7));
			} while (MONDAY.getYear() == year);
	  }

}