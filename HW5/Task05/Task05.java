package lesson005f;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.concurrent.ThreadLocalRandom;

public class Task05 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Enter the length of the array [for example 10]: ");
		int arrlength = Integer.parseInt(br.readLine());
		int[] mas = new int[arrlength];
		for (int i = 0; i < mas.length; i++)
			mas[i] = ThreadLocalRandom.current().nextInt(-(arrlength), (arrlength));

		System.out.println("Array of integers: ");
		for (int list : mas) {
			System.out.print(list + " ");
		}
		
//----------------------------------------------------
			int countA = 0;
			for (int i = 0; i < mas.length; i++) {
				if (mas[i] > 0) {
					countA++;
				}
			}

//----------------------------------------------------			
			
			int pos2 = mas[0];
			int countP = 0;
			int countL = 0;
			int positP = 0;
			if (countA > 1) {
				for (int i = 0; i < mas.length; i++) {
					if (mas[i] > 0) {
						countP++;
						if (countP == 2) {
							pos2 = mas[i];
							positP = i;
							countL = 1;
						}
					} else if (pos2 == mas[i])
						countL++;
				}
			} else {
				System.out.print("\n=====Positive numbers are missing!===== ");
			}
//----------------------------------------------------			
			
			int min1 = mas[0];
			int countM = 0;
			int positM = 0;
			for (int i = 0; i < mas.length; i++) {
				if (min1 > mas[i]) {
					min1 = mas[i];
					positM = i;
					countM = 1;
				} else if (min1 == mas[i])
					countM++;
			}

//----------------------------------------------------	
		
		System.out.println("\nThe array has " + countA + " positive numbers! ");
		System.out.println("\nPosition of second positive number:");
		System.out.println("The number: " + pos2 + " is in " + (positP + 1) + " place. "
		+ "The occurrence count of the largest number is: " + countL);
		System.out.println("\nMinimum and its position in the array:");
		System.out.println("Min: " + min1 + " is in " + (positM + 1) + " place. "
		+ "The occurrence count of the largest number is: " + countM);
	}

}
