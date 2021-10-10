package lesson4.hw;

import java.util.ArrayList;
import java.util.Scanner;

public class Tasks {
	public static void main(String[] args) {		
		Scanner scanner = new Scanner(System.in);
		
		
		int[] array1 = new int[3];
		for (int i = 0; i < array1.length; i++) {
			System.out.println("Type " + (i + 1) + " int number");
			array1[i] = scanner.nextInt();
		}
		System.out.println(max(array1));
		System.out.println(min(array1));
		
		
		float[] array2 = new float[3];
		for (int i = 0; i < array2.length; i++) {
			System.out.println("Type " + (i + 1) + " float number");
			array2[i] = scanner.nextFloat();
			belongTo(array2[i]);
		}
		
	}
	
	
	static public int min (int [] array) {
		int min = array[0];
		for (Integer currentInt : array ) {
			if (currentInt < min) {
				min = currentInt;
			}
		}
		return min;
	}
	
	static public int max (int [] array) {
		int max = array[0];
		for (Integer currentInt : array ) {
			if (currentInt > max) {
				max = currentInt;
			}
		}
		return max;
	}
	
	static public void belongTo (float a) {
		if (a >= -5 && a <= 5) {
			System.out.println("The number belongs to the range");
		} else {
			System.out.println("The number doesn't belong to the range");
		}
	}

}
