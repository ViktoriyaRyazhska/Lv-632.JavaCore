package lesson11.hw;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main11 {
	
	public static void main(String[] args) {
		
		//1.
		try {
			System.out.println(div(6, 0));
		} catch (ArithmeticException e) {
			System.err.println(e.getMessage());
		} 
		
		//2.
		Scanner scan = new Scanner(System.in);
		try {
				for (int i = 0; i < 10; i++) {
					readNumber(1 + 10*i, 10 + 10*i, scan);
				}				
		} catch (InputMismatchException e) {
				System.err.println("You entered not an integer number");
		} catch (IllegalArgumentException e){
				System.err.println(e.getMessage());
		} catch (Exception e) {
				System.err.println("Unknown error");
		} finally {
				scan.close();
		}
		
	}
	
	public static double div(double a, double b) throws ArithmeticException {
		if (b == 0) {
			throw new ArithmeticException("/ by zero!");
		} else {
			return a / b;
		}
	}
	
	public static int readNumber(int start, int end, Scanner scan) throws IllegalArgumentException, InputMismatchException, Exception {
		System.out.printf("Please enter a number between %d and %d\n", start, end);
		int number = scan.nextInt();
		if (number >= start && number <= end) {
			return number;
		} else {
			throw new IllegalArgumentException(String.format("The input number is not between %d and %d" , start, end));
		}
	}

}
