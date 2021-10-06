package lesson005g;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task06 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int productP = 1;
		int inputN = 0;

		System.out.println("Please enter a positive number. \nOr enter a negative number to exit!:");
		boolean flag;
		while (true) {
			try {
				inputN = Integer.parseInt(br.readLine());
				if (inputN < 0) {
					break;
				} else {
					if ((inputN % 2) == 0) {
						productP = productP * inputN;
					}
				}
				flag = true;
			} catch (Exception e) {
				System.out.print("Try again: ");
				flag = false;
			}
		}
		System.out.println("Count the product of all entered even numbers: " + productP);
	}
}
