package lesson1;
import java.util.Scanner;
import jdk.javadoc.internal.doclets.toolkit.taglets.SummaryTaglet;
import java.math.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main{
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Task 1 \nArea of a circle, perimeter of a circle. Enter the radius");
		Scanner scan = new Scanner(System.in);
		int radius = scan.nextInt();
		double perimeter = 2 * 3.14 * radius;
		double area = 3.14 * Math.pow(radius,2);
		System.out.printf("Your perimeter:"+"%.2f", perimeter);
		System.out.printf("\nYour area:"+"%.2f", area);
		
		//Task 2
		System.out.println("\nTask 2\nWrite your name:");
		String name = br.readLine();
		System.out.println("What city do you live in " + name + "?");
		String location = br.readLine();
		System.out.printf("So " + name + " now we know that you live in the city " + location + ", haha)");
		
		//Task 3
		System.out.println("\nTask 3\nCalculation of call costs: ");
		System.out.println("First country: England\nwrite the price per minute first: ");
		double price_c1 = scan.nextInt();
		System.out.println("And number of minutes: ");
		double time_t1= scan.nextInt();
		System.out.println("Second country: France\nwrite the price per minute first: ");
		double price_c2 = scan.nextInt();
		System.out.println("And number of minutes: ");
		double time_t2= scan.nextInt();
		System.out.println("Third country: Ukraine\nwrite the price per minute first: "
				+ "");
		double price_c3 = scan.nextInt();
		System.out.println("And number of minutes: ");
		double time_t3= scan.nextInt();
		System.out.printf("So, price for calls in England: " + price_c1 * time_t1+"\n"+ 
				"price for calls in France: " + price_c2 * time_t2+"\n"+
				"price for calls in Ukraine: " + price_c3 * time_t3+"\n"+
				"Total amount: "+  (price_c1 * time_t1 + price_c2 * time_t2 + price_c3 * time_t3));	
	}
}
