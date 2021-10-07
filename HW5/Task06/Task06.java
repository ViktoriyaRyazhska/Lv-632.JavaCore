package lesson005g;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task06 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int productP = 1;
		int inputN = 0;
		int countN = 0;
		int countE = 0;

		System.out.println("Please enter a positive number. \nOr enter a negative number to exit!:");
		boolean flag;
		while (true) {
			try {
				inputN = Integer.parseInt(br.readLine());
				if (inputN < 0) {
					break;
				} else {
					if ((inputN ^ 1) == inputN + 1) {
						productP = productP * inputN;
						countE++;
					}
					countN++;
				}
				flag = true;
			} catch (Exception e) {
				System.out.print("Try again: ");
				flag = false;
			}
		}
		System.out.println("Numbers entered, TOTAL: " + countN + ". From them -  " + countE + " even numbers");
		System.out.println("Count the product of all entered even numbers: " + productP);
	}
}
