package lesson004f;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.concurrent.ThreadLocalRandom;

public class Task05_1 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Enter the length of the array [for example 20]: ");
		int arrlength = Integer.parseInt(br.readLine());
		int[] randomNumbers = new int[arrlength];
		for (int i = 0; i < randomNumbers.length; i++)
			randomNumbers[i] = ThreadLocalRandom.current().nextInt(-(arrlength), (arrlength));

		System.out.println("Array of integers: ");
		for (int list : randomNumbers)
			System.out.print(list + " ");
	    	System.out.print("\n");

//		belong to the range in the array [-5,5]
		int inRange = 0;
		int notRrange = 0;
		for (int i = 0; i < randomNumbers.length; i++) {
			if (randomNumbers[i] >= -5 && randomNumbers[i] <= 5) {
				inRange++;
			} else {
				notRrange++;
			}
		}
		
		System.out.println("\nAre they all belong to the range [-5,5]:");
		System.out.println("Are in the range: " + inRange + "\nAre not in the range: " + notRrange);

//		max and min values in the array
		int arrMax = 0;
		int jMax = 0;
		int j = 0;
		while (j < randomNumbers.length) {
			if (randomNumbers[j] > arrMax) {
				arrMax = randomNumbers[j];
				jMax = j;
			}
			j++;
		}

		int arrMin = 0;
		int jMin = 0;
		int b = 0;
		while (b < randomNumbers.length) {
			if (randomNumbers[b] < arrMin) {
				arrMin = randomNumbers[b];
				jMin = b;
			}
			b++;
		}
		
		System.out.println("\nMax and min values in the array:");
		System.out.println("Max: " + arrMax + " is in " + (jMax + 1) + " place");
		System.out.println("Min: " + arrMin + " is in " + (jMin + 1) + " place");	
	}
}
