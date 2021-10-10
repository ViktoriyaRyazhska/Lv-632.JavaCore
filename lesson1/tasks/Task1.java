package lesson1.tasks;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
    	System.out.println("Type the number a");
    	Scanner scanner = new Scanner(System.in);
    	int a = scanner.nextInt();
    	System.out.println("Type the number b");
    	int b = scanner.nextInt();
    	scanner.close();
    	
    	System.out.print("a + b = " + (a + b) + "\na - b = " + (a - b) +
    			"\na * b = " + (a * b) + "\na / b = " + (1.0 * a / b));		
	}
}
