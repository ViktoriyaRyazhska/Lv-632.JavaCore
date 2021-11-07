package com.softserve.javaCore.homework4;

import java.util.Scanner;

public class FloatAndIntNumbers {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter float number 1 ");
		checkingRange(Float.parseFloat(sc.nextLine()));
		System.out.println("Enter float number 2 ");
		checkingRange(Float.parseFloat(sc.nextLine()));
		System.out.println("Enter float number 3 ");
		checkingRange(Float.parseFloat(sc.nextLine()));
		
		System.out.println("Enter the int numbers ");
		findMax (Integer.parseInt(sc.nextLine()), Integer.parseInt(sc.nextLine()), Integer.parseInt(sc.nextLine()));
	}
	
	static void checkingRange (float x) {
		if (x>=-5 && x<=5)
			System.out.println("Number is in range [-5,5] ");
		else
			System.out.println("Number is not in range [-5,5] ");
	}
	
	
	static void findMax (int x, int y, int z) {
		 if (x>y && x>z) 
			 System.out.println("max value is "+x);
			
		 if (y>x && y>z) 
			 System.out.println("max value is "+y);
			 
		 else
			 System.out.println("max value is "+z);
	}
	
}
