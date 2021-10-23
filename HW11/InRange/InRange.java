import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class InRange {


	public static void main(String[] args) throws Exception {
		int start = 0;
		int end = 50;
		int[] array = new int[10];

		System.out.println("Enter 10 numbers in range from 0 to 50");
		Scanner input = new Scanner(System.in);
		for (int i = 0; i < array.length; i++) {
			try {
				array[i] = input.nextInt();
			} catch (InputMismatchException e) {
				System.err.println("You didnt enter a number.");
			}

			if (array[i] < start ^ array[i] > end) {
				System.out.println("Not in range!");
			}
		}
		System.out.println(Arrays.toString(array));
		input.close();
	}
}
