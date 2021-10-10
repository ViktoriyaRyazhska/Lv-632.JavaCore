package com.softserve.javaCore.homework1;

import java.util.Scanner;

/* Flower bed is shaped like a circle. Calculate the perimeter and area by entering the radius. Output obtained results.
 */
public class Homework1Task1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter radius value r = ");
		int r = Integer.parseInt(sc.nextLine());
		double perimeter = 2*Math.PI*r;
		double area = Math.PI*r*r; 		
		System.out.println("perimeter = "+perimeter);
		System.out.println("area = "+area);
	
	}

}
