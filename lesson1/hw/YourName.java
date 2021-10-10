package lesson1.hw;

import java.util.Scanner;

public class YourName {
	public static void main(String[] args) {
		String name;
		String address;
		Scanner scanner = new Scanner(System.in);
		System.out.println("What is your name?");
		name = scanner.next();
		System.out.println("Where do you live, " + name + "?");
		address = scanner.next();
		scanner.close();
		System.out.println("Name: " + name + "; Address: " + address);
	}

}
