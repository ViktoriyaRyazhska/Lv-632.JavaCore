import java.util.Scanner;

public class DaysInMonth {
	public static void main(String[] args) {
		int[] daysInMonth = { 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };

		numberOfDays(daysInMonth);

	}

	// Method to know how much days.
	public static void numberOfDays(int[] day) {
		System.out.println("Enter the number of month to see how many days it has ");
		Scanner input = new Scanner(System.in);
		int numberOfMonth = input.nextInt();

		for (int i = 0; i < day.length; i++) {
			if (i == numberOfMonth - 1) {
				System.out.println(numberOfMonth + " month has - " + day[i] + " days");
			}

		}

		input.close();
	}
}
