import java.util.Scanner;

public class Numbers {
	static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {

		int a = 0;
		enterNumber(a);
		enterNumber(a);
		enterNumber(a);

	}

	public static void enterNumber(int x) {

		System.out.println("Enter number to know is it odd or not");
		x = input.nextInt();

		if (x % 2 == 0)
			System.out.println("Its odd");
		else
			System.out.println("Its not");
	}

}