package lesson10.HW10;

import java.util.Scanner;

public class task3 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Entre numbres...");
		String text = scan.nextLine();
		String[] numb = text.split(" ");
		Double[] number = new Double[numb.length];
		for (int i = 0; i < numb.length; i++) {
			number[i] = Double.parseDouble(numb[i]);
			System.out.printf("$ %.2f\n", number[i]);
		}

	}

}
