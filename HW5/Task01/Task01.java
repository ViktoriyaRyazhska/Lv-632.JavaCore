package lesson005a;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.concurrent.ThreadLocalRandom;
import java.util.stream.IntStream;

public class Task01 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Enter the length of the array [for example 10]: ");
		int arrlength = Integer.parseInt(br.readLine());
		int[] randomNumbers = new int[arrlength];
		for (int i = 0; i < randomNumbers.length; i++)
			randomNumbers[i] = ThreadLocalRandom.current().nextInt(-(arrlength), (arrlength));

		System.out.println("Array of integers: ");
		for (int list : randomNumbers)
			System.out.print(list + " ");
		System.out.print("\n ");

	
		
//		The biggest numbers => VARIANT 1
		int numberMax = Arrays.stream(randomNumbers).max().orElse(0);
		System.out.println("\nMax: " + numberMax);

//		The biggest numbers => VARIANT 2		
		int max1 = randomNumbers[0];
		int index = 0;
		int countN;
		for (int i = 1; i < randomNumbers.length; i++) {
			if (max1 < randomNumbers[i]) {
				max1 = randomNumbers[i];
				index = i;
				countN = 1;
			} else if (max1 == randomNumbers[i])
				countN++;
		}
				System.out.println("Max: " + max1 + " is in " + (index + 1) + " place. "
				+ "The occurrence count of the largest number is: " + countN);


		
//		The sum of positive and count numbers in the array => VARIANT 1
		int sumPositive = IntStream.of(randomNumbers).filter(i -> i > 0).sum();
		int countPositive = (int) IntStream.of(randomNumbers).filter(i -> i > 0).count();
		int sumNegative = IntStream.of(randomNumbers).filter(i -> i < 0).sum();
		int countNegative = (int) IntStream.of(randomNumbers).filter(i -> i < 0).count();
		System.out.println("\nCoutn Positive: " + countPositive + " Total sum: " + sumPositive);
		System.out.println("Coutn Negative: " + countNegative + " Total sum: " + sumNegative);

//		The sum of and count positive numbers in the array => VARIANT 2
		int countPos = 0;
		int sumP = 0;
		int countNeg = 0;
		int sumN = 0;
		for (int j = 0; j < randomNumbers.length; j++) {
			if (randomNumbers[j] >= 0) {
				sumP += randomNumbers[j];
				countPos++;
			} else {
				sumN += randomNumbers[j];
				countNeg++;
			}
		}
		System.out.println("\nCoutn Positive: " + countPos + " Total sum: " + sumP);
		System.out.println("Coutn Negative: " + countNeg + " Total sum: " + sumN);

		
		
//		The amount of negative numbers in the array
		isMoreNegOrPos(countPos, countNeg);
	}

	public static void isMoreNegOrPos(int countPos, int countNeg) {
		if (countPos > countNeg) {
			System.out.println("Positive numbers - more: " + countPos);
		} else {
			System.out.println("Negative numbers - more: " + countNeg);
		}
	}
	
}
