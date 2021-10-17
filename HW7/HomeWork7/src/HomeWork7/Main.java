package HomeWork7;

import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		
		Employee [] employee = new Employee [5];
		employee[0]= new SalariedEmployee ("Svetlana", 3,5, 24);
		employee[1]= new SalariedEmployee ("Tania", 5,5, 23);
		employee[2]= new ContractEmployee ("Vera", 13,5);
		employee[3]= new ContractEmployee ("Kolja", 45,1);
		employee[4]= new  SalariedEmployee ("Gala", 19,1,8);
		
		for (int i = 0; i < employee.length; i++) {
			System.out.println(employee[i]);
		}	
		System.out.println();
		
		Arrays.sort(employee);
		for (int i = 0; i < employee.length; i++) {
			System.out.println(employee[i]);
		}	
	}
}