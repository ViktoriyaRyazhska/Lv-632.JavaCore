package introduction;

import java.util.Scanner;

public class Circle {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("¬вед≥ть рад≥ус");
		double radius= scanner.nextDouble();
		scanner.close();
		double perimeter = 2 * Math.PI * radius;
		double area = Math.PI * radius * radius;
		System.out.print("ѕериметр круга: " + perimeter + ", площадь: " + area);
	}

}
