package lesson005d;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.concurrent.ThreadLocalRandom;

public class Task04 {
	static int countA = 0;

	public static void main(String[] args) throws IOException {

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

		System.out.print("\nCalculate The <=" + countAllPosNumb(mas) + " elements of an array: ");
		int numMas = Integer.parseInt(br.readLine());
		System.out.println("Sum of first " + numMas + " positive elements - " + sumPositNumbFirst(mas, numMas));
		System.out.println("Product of last " + numMas + " elements (not zero) - " + productLastElemOfArr(mas, numMas));

	}


	public static int countAllPosNumb(int mas[]) {
		for (int i = 0; i < mas.length; i++) {
			if (mas[i] > 0) {
				countA++;
			}
		}
		return countA;
	}

	public static int sumPositNumbFirst(int mas[], int numMas) {
		int countF = 0;
		int sumF = 0;
		if (countA >= numMas) {
			for (int f = 0; f < mas.length; f++) {
				if (mas[f] > 0) {
					countF++;
					if (countF <= numMas) {
						sumF += mas[f];
					}
				}
			}
		}
		return sumF;
	}

	public static int productLastElemOfArr(int mas[], int numMas) {
		int countL = 0;
		int productL = 1;
		for (int l = mas.length - 1; l >= 0; l--) {
			if (mas[l] != 0) {
				countL++;
				if (countL <= numMas) {
					productL = productL * mas[l];
				}
			}
		}
		return productL;
	}

}
