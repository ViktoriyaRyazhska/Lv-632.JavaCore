package lesson005b;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;

public class Appl {

	public static void main(String[] args) throws NumberFormatException, IOException {

		Employee empl01 = new Employee("Mikka Luster", 1, 2000);
		Employee empl02 = new Employee("Jon Mixon", 2, 1550);
		Employee empl03 = new Employee("Julia Brindle", 1, 2180);
		Employee empl04 = new Employee("Andrew Midson-Slettbakk", 1, 3500);
		Employee empl05 = new Employee("Cindy Corn", 2, 1400);
		Employee empl06 = new Employee("Dominika Misztela", 3, 1000);
		Employee empl07 = new Employee("Mohammed Rhiswan", 1, 3000);
		Employee empl08 = new Employee("John Burgess", 1, 2150);

		System.out.println("Count the Number of Objects in a Class: " + Employee.numberofobjects);

		Employee[] empls = new Employee[8];
		empls[0] = empl01;
		empls[1] = empl02;
		empls[2] = empl03;
		empls[3] = empl04;
		empls[4] = empl05;
		empls[5] = empl06;
		empls[6] = empl07;
		empls[7] = empl08;

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Enter the department number [for example - 1 OR 2 OR 3]: ");
		int depnumb = Integer.parseInt(br.readLine());

		for (Employee s : empls) {
			if (depnumb == s.getDepNumber()) {
				System.out.print(s.toString());
			}
		}
		
//		Simple method of sorting an array
		System.out.print("\nSort by salary - simple metod (Y/N): ");
		String fieldY = br.readLine();
		if (fieldY.equalsIgnoreCase("Y")) {
			Employee tmp;
			for (int i = 0; i < empls.length; i++) {
				for (int j = i + 1; j < empls.length; j++) {
					if (empls[i].getSalary() < empls[j].getSalary()) {
						tmp = empls[i];
						empls[i] = empls[j];
						empls[j] = tmp;
					}
				}
			}
			for (int i = 0; i < empls.length; i++) {
				System.out.println(empls[i].toString());
			}
		} else {

//			Complex method of sorting an array
			System.out.print("\nSort any field - complex method [for example - from 1 to "
					+ (empl01.getColumnCount() - 1) + " ]: ");
			restart: while (true) {
				int fieldN = Integer.parseInt(br.readLine());

				if ((fieldN < 1) || (fieldN > (empl01.getColumnCount() - 1))) {
					System.out.print("Try again: ");
					continue restart;
				} else {

					if (fieldN == 1) {
						Arrays.sort(empls, Comparator.comparing(Employee::getName));
						System.out.println(Arrays.toString(empls));
					}
					if (fieldN == 2) {
						Arrays.sort(empls, Comparator.comparing(Employee::getDepNumber));
						System.out.println(Arrays.toString(empls));
					}
					if (fieldN == 3) {
						Arrays.sort(empls, Comparator.comparing(Employee::getSalary));
						System.out.println(Arrays.toString(empls));
					}
				}
				break restart;
			}
		}
	}
}
