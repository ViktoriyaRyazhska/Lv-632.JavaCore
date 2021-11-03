import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;

public class Date {
	public static void main(String[] args) {

		System.out.println(trueDate("08,06,21"));
		System.out.println(trueDate("08.03.19"));
		System.out.println(trueDate("04.03.2021"));
	}

	public static boolean trueDate(String date) {
		DateTimeFormatter date1 = DateTimeFormatter.ofPattern("MM.dd.yy");
		try {
			LocalDate.parse(date, date1);

		} catch (DateTimeParseException e) {
			return false;
		}
		return true;
	};
}
