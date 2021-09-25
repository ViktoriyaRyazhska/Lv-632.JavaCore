package lesson1.tasks;

import java.util.Scanner;

public class Task2 {
	public static void main(String[] args) {
		System.out.println("How are you?");
		Scanner scanner = new Scanner(System.in);
		String answer = scanner.next();
		scanner.close();
		System.out.println("You are " + answer);
	}
}
