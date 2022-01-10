package lesson001;

import java.util.Scanner;

public class Task04 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Calculating perimeter and area of the Circle. ");
		System.out.print("Input radius of the Circle:  ");
		double radius = sc.nextDouble();

		// Perimeter of the Circle is given by P=2*Pi*R
		double perimeter = 2*Math.PI*radius;
		System.out.println("Perimeter of the Circle: " + perimeter);

		// Area of the Circle is given by A=Pi*R*R
		double area = Math.PI*(radius*radius);
		System.out.println("Area of the Circle: " + area);
		sc.close();
	}
}
