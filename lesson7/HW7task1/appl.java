package HW7;

import java.util.Arrays;
import java.util.Comparator;

public class appl {

	public static void main(String[] args) {

		Employee[] emp = new Employee[3];
		emp[0] = new SalariedEmployee("Andriy", "314823994", 350, 40,1);
		emp[1] = new SalariedEmployee("Olga", "12363335", 400, 137,1);
//		emp[2] = new ContractEmployee("Evgen", "4622", 12000);
//		emp[3] = new ContractEmployee("Segiy", "4394", 14600);
		emp[2] = new SalariedEmployee("Nazar", "948262649", 500, 40,1);

		for (Employee a : emp) {
			a.calculatePay();
		
		}
		System.out.println("--------------------------------------");
		Arrays.sort(emp, new SalariedEmployee.SortSalary());
		
		for(Employee b:emp) {
			System.out.println(b);
	
		}
	
		
	}
	
	
}