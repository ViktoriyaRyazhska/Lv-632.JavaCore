package lesson004a;

import java.util.Scanner;

public class Task01 {
	
	static int countEven = 0;
	static int countOdd = 0;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] mas = new int[3];
		System.out.println("Please, input 3 digits");
		for (int i = 0; i < mas.length; i++) {
			System.out.print("Input " + (i + 1) + "-st/nd/th digit: ");
			try {
				mas[i] = Integer.parseInt(sc.nextLine());
			} catch (Exception e) {
				System.out.print("Try again: ");
				sc.nextLine();
			}
		}

		System.out.println("\nOdd numbers:");
		for (int i = 0; i < mas.length; i++) {
			if (mas[i] % 2 == 0) {
				System.out.print(mas[i] + " ");
				countOdd++;
			}
		}

		System.out.println("\nEven numbers:");
		for (int i = 0; i < mas.length; i++) {
			if (mas[i] % 2 != 0) {
				System.out.print(mas[i] + " ");
				countEven++;
			}
		}
		
		System.out.println("\nCount Odd numbers: " + countOdd);
		System.out.println("Count Even numbers: " + countEven);
		sc.close();
	}
}
