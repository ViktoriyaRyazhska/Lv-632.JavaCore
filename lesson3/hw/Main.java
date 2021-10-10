package lesson3.hw;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Person pers1 = new Person("Leo", "Messi");
		pers1.setBirthYear(1987);
		
		Person pers2 = new Person();
		pers2.changeName("LeBron", "James");
		pers2.setBirthYear(1984);
		
		Person pers3 = new Person();
		pers3.setFirstName("Angelina");
		pers3.setLastName("Jolie");
		pers2.setBirthYear(1984);
		
		Person pers4 = new Person();
		
		Person pers5 = new Person();
		Scanner scanner = new Scanner(System.in);
		pers5.input(scanner);
		scanner.close();
		
		pers1.output();
	}

}
