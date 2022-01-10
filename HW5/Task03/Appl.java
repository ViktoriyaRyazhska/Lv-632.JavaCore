package lesson005c;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.time.Month;

public class Appl {

	public static void main(String[] args) throws NumberFormatException, IOException {

		Month12 month01 = new Month12(1, Month.of(1), (Month.of(1).length(false)));
		Month12 month021 = new Month12(2, Month.of(2), (Month.of(2).length(false)));
		Month12 month022 = new Month12(2, Month.of(2), (Month.of(2).length(true)));
		Month12 month03 = new Month12(3, Month.of(3), (Month.of(3).length(false)));
		Month12 month04 = new Month12(4, Month.of(4), (Month.of(4).length(false)));
		Month12 month05 = new Month12(5, Month.of(5), (Month.of(5).length(false)));
		Month12 month06 = new Month12(6, Month.of(6), (Month.of(6).length(false)));
		Month12 month07 = new Month12(7, Month.of(7), (Month.of(7).length(false)));
		Month12 month08 = new Month12(8, Month.of(8), (Month.of(8).length(false)));
		Month12 month09 = new Month12(9, Month.of(9), (Month.of(9).length(false)));
		Month12 month10 = new Month12(10, Month.of(10), (Month.of(10).length(false)));
		Month12 month11 = new Month12(11, Month.of(11), (Month.of(11).length(false)));
		Month12 month12 = new Month12(12, Month.of(12), (Month.of(12).length(false)));

		Month12[] months = new Month12[13];
		months[0] = month01;
		months[1] = month021;
		months[2] = month022;
		months[3] = month03;
		months[4] = month04;
		months[5] = month05;
		months[6] = month06;
		months[7] = month07;
		months[8] = month08;
		months[9] = month09;
		months[10] = month10;
		months[11] = month11;
		months[12] = month12;

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print(
				"Enter month number of the year to see the number of days in that month  [for example - from 1 to 12]: ");
		restart: while (true) {
			int numb = Integer.parseInt(br.readLine());
			if ((numb < 1) || (numb > 12)) {
				System.out.print("Try again: ");
				continue restart;
			} else {
				Month12.numbOfDaysInMonth(months, numb);
			}
			break restart;
		}
	}
}
