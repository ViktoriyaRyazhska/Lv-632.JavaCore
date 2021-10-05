package lesson005c;

import java.time.LocalDate;
import java.time.Month;

public class Month12 {

	private Month name;
	private int days;
	private int numMon;

	public Month getName() {
		return name;
	}

	public void setName(Month name) {
		this.name = name;
	}

	public int getDays() {
		return days;
	}

	public void setDays(int days) {
		this.days = days;
	}

	public int getNomMon() {
		return numMon;
	}

	public void setNomMon(int nomMon) {
		this.numMon = nomMon;
	}

	public Month12(int numMon, Month name, int days) {
		this.name = name;
		this.days = days;
		this.numMon = numMon;
	}

	@Override
	public String toString() {
		return name + " has " + days + " days "+"\n";
	}

	public static void numbOfDaysInMonth(Month12[] months, int numb) {
		if (numb != 2) {
			for (int i = 0; i < months.length; i++) {
				if (numb == months[i].numMon) {
					System.out.println(months[i]);
				}
			}
		}
		if (numb == 2) {
			if ((LocalDate.now().getYear()) % 4 == 0 && (LocalDate.now().getYear()) % 100 != 0
					|| (LocalDate.now().getYear()) % 400 == 0) {
				System.out.println("Is a leap year! " + months[2]);
			} else {
				System.out.println("Is not a leap year! " + months[1]);
			}
		}
	}
	
}
