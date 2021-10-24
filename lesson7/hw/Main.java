package lesson7.hw;

import java.util.Arrays;

public class Main {
	
	public static void main(String[] args) {
		
		Employee[] list = new Employee[4];
		list[0] = new ContractEmployee("Jack", "112548", 40, 40);
		list[1] = new ContractEmployee("John", "127948", 25, 35);
		list[2] = new SalariedEmployee("Mike", "458963", 1300);
		list[3] = new SalariedEmployee("Nick", "742583", 1200);
		System.out.println(Arrays.toString(list));
		Arrays.sort(list);
		System.out.println(Arrays.toString(list));
	}

}
