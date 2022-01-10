package lesson001;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task02 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Examples of arithmetic operations. ²nput a few numbers that aren't 0");
		System.out.print("²nput the first number: ");
		double a = Double.parseDouble(br.readLine());
		System.out.print("²nput the second number: ");
		double b = Double.parseDouble(br.readLine());

		if ((a == 0) || (b == 0)) {
			System.out.println("²nput a few numbers that aren't 0 !!!");
		} else {
			System.out.println("Adding numbers: " + (a + b));
			System.out.println("Subtracting numbers: " + (a - b));
			System.out.println("Ìultiplying numbers: " + (a * b));
			System.out.println("Dividing numbers: " + (a / b));
			System.out.println("Computing the remainder resulting from dividing number: " + (a % b));
		}
	}
}
