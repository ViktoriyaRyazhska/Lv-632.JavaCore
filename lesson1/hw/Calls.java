package lesson1.hw;

import java.util.Scanner;

public class Calls {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter cost per minutes (to Russia)");
		double costPerMinRus = scanner.nextDouble();
		System.out.println("How many minutes did you speak?");
		double numberOfMinutesRus = scanner.nextDouble();
		double costOFCallsRus = costPerMinRus * numberOfMinutesRus;
		System.out.println("Enter cost per minutes (to England)");
		double costPerMinEng = scanner.nextDouble();
		System.out.println("How many minutes did you speak?");
		double numberOfMinutesEng = scanner.nextDouble();
		double costOFCallsEng = costPerMinEng * numberOfMinutesEng;
		System.out.println("Enter cost per minutes (to USA)");
		double costPerMinUSA = scanner.nextDouble();
		System.out.println("How many minutes did you speak?");
		double numberOfMinutesUSA = scanner.nextDouble();
		double costOFCallsUSA = costPerMinUSA * numberOfMinutesUSA;
		scanner.close();
		
		System.out.print("Cost of calls: \nRussia - " + costOFCallsRus +
				"\nEngland - " + costOFCallsEng + "\nUSA - " + costOFCallsUSA
				+ "\nTotal costs: " + (costOFCallsRus + costOFCallsEng + costOFCallsUSA));
	}

}
