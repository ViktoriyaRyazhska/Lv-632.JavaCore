package lesson5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class appl {

	public static void main(String[] args) throws NumberFormatException, IOException {
		Employee [] emp = new Employee[5];
		emp[0]= new Employee("Ivan", 3 , 2000);
		emp[1]= new Employee("Olga", 1 , 5000);
		emp[2]= new Employee("Vasil", 3 , 3500);
		emp[3]= new Employee("Oleg", 2 , 3900);
		emp[4]= new Employee("Petro", 1 , 6500);
	
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("Enter number from 1 to 3");
		int n =Integer.parseInt(br.readLine());
		for (int i=0; i<emp.length;i++ ) {
			if(n==emp[i].getDepNumber()) {
				System.out.println(emp[i].toString());
			}
		}
				System.out.println("Sorting workers by salary:");
		Employee tmp;
		for (int i=0; i<emp.length;i++) {
			for (int j = i + 1; j < emp.length; j++) {
			if(emp[i].getSalary()<emp[j].getSalary()) {
				tmp=emp[i];
				emp[i]=emp[j];
				emp[j]=tmp;	
			}
		}
		}
		for (int i=0; i<emp.length;i++) {
		System.out.println(emp[i].toString());
		}

	}
}
	

	
