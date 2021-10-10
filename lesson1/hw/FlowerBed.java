package lesson1.hw;

import java.util.Scanner;

public class FlowerBed {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the radius");
		double radius= scanner.nextDouble();
		scanner.close();
		double perimeter = 2 * Math.PI * radius;
		double area = Math.PI * radius * radius;
		System.out.print("Perimeter = " + perimeter + ", Area = " + area);
	}

}
