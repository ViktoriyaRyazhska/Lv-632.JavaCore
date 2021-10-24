package lesson5.hw;

import java.util.Arrays;
import java.util.Scanner;

public class TasksHW {
	public static void main (String[] atgs) {
		
		
		//1.
		int [] months = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number of month");
		int numberOfMonth = scan.nextInt();
		if (1 <= numberOfMonth && numberOfMonth <= 12) {
			System.out.println("This month has " + (months[numberOfMonth - 1]) + " days");
		} else {
			System.out.println("Wrong Input");
		}
		
		
		//2.
		int [] numbers = { 1, 9, 6, 30, 15, 7, 3, 96, -22, 10};
		int countPositive = 0;
		for (int i = 0; i < 5; i++) {
			if (numbers[i] > 0) {
				countPositive++;
			}
		}
		if (countPositive == 5) {
			int sum = 0;
			for (int i = 0; i < 5; i++) {
				sum += numbers[i]; 
			}
			System.out.println("Sum of 5 first numbers: " + sum);
		} else {
			int prod = 1;
			for (int i = 5; i < numbers.length; i++) {
				prod *= numbers[i]; 
			}
			System.out.println("Product of 5 last numbers: " + prod);
		}
		
		
		//3.
		//Second positive number
		int [] numbers2 = { 2, 6, -7, 15, -11};
		int counter = 0;
		int secondPositiveIndex = -1;
		for (int i = 0; i < numbers2.length; i++) {
			if (numbers2[i] > 0) {
				counter++;
				if (counter == 2) {
					secondPositiveIndex = i;
					break;
				}
			}
		}
		//min number
		int min = numbers2[0];
		for (int i = 0; i < numbers2.length; i++) {
			if (numbers2[i] < min) {
				min = numbers2[i];
			}
		}
		System.out.println("Minimum number: " + min + "\nPosition of second positive number: " + secondPositiveIndex);
		
		//Entering until the first negative
		int product = 1;
		while (true) {
			System.out.println("Type integer number");
			int a = scan.nextInt();
            if (a > 0) {
            	product *= a;               
            } else {
                break;
            }
		}
		System.out.println(product);
	}

}
