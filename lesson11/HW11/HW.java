package lesson11.HW11;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class HW {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	public static void main(String[] args) {
		div();
		readNumber();

	}

	private static void div() {
		try {
			System.out.println("Enter firs number...");
			double a = Double.parseDouble(br.readLine());
			System.out.println("Enter second number...");
			double b = Double.parseDouble(br.readLine());
			double numb = 0;
			numb = a / b;
			System.out.printf("Result of dividing: " + numb + "\n");
		} catch (ArithmeticException | IOException | NumberFormatException e) {
			System.err.println(e.getMessage());
		}
	}

	private static void readNumber() {
		try {
			System.out.println("Enter lower limit of range: ");
			int start = Integer.parseInt(br.readLine());
			System.out.println("Enter upper limit of range: ");
			int end = Integer.parseInt(br.readLine());
			if (end > start) {
				for (int i = 1; i < 11; i++) {
					System.out.printf("Enter %d integer numrer ...\n", i);
					String line = br.readLine();
					if (line.matches("[0-9]+")) {
						int number = Integer.parseInt(line);
						if (number > start && number < end) {
							System.out.println(number + " in range");
						} else
							System.out.printf("%d - not in range, enter integer from %d to %d\n", number, start, end);
					} else {
						System.out.println("Enter only integer numbers");
					}
				}
			} else
				System.out.println("Upper limit should be larger than lower.");
		} catch (IOException | NumberFormatException e) {
			System.err.println(e.getMessage());
		}
	}

}
