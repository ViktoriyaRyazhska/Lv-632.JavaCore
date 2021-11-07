package com.softserve.javaCore.homework5;

import java.util.Scanner;

/*Ask user to enter the number of month. Read the value and write the amount of days in this month (create array with amount days of each month).
*/

public class Task1 {

	public static void main(String[] args) {
		
		int numberOfMonth = scanNumber();
		int [] monthDays = {31,28,31,30,31,30,31,31,30,31,30,31};
		
		
		if (numberOfMonth<=0 && numberOfMonth>12)
		{
			System.out.println("wrong number of month");
		}
		
		else {
													
			System.out.println("The month "+  numberOfMonth + " has "+ monthDays[numberOfMonth-1] +" days");
		}	
		
	}

	private static int scanNumber() {
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter the number of month");
		int numberOfMonth =  Integer.parseInt(sc.nextLine());
		return numberOfMonth;
	}

	/*private static void printArray(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}*/

}
