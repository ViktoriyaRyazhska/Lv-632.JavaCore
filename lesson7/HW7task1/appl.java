package HW7;

import java.util.Arrays;
import java.util.Comparator;



public class appl {

	public static void main(String[] args) {

		Employee[] emp = new Employee[5];
		emp[0] = new SalariedEmployee("Andriy", "314823994", 350, 40);
		emp[1] = new SalariedEmployee("Olga", "12363335", 400, 137);
		emp[2] = new ContractEmployee("Evgen", "4622", 12000);
		emp[3] = new ContractEmployee("Segiy", "4394", 14600);
		emp[4] = new SalariedEmployee("Nazar", "948262649", 500, 40);

		for (Employee a : emp) {
			System.out.println(a.calculatePay());
		}
		Arrays.sort(emp, new Comparator<Employee>() {

			@Override
			public int compare(Employee o1, Employee o2) {
				return o1.calculatePay()-o2.calculatePay();
			}
		});
		
		System.out.println("sorting--------------------------------------------");
		for (Employee b : emp) {
			System.out.println(b.toString());
		}

	}

}