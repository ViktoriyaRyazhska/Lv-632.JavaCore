package lesson11;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class class_task {

	public static void main(String[] args) {
		int a = 0;
		int b = 0;

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		try {
			System.out.println("Enter the length of the first side...");
			a = Integer.parseInt(br.readLine());
			System.out.println("Enter the length of the second side...");
			b = Integer.parseInt(br.readLine());
		} catch (IOException e) {
			System.err.println("Not a number.");
		}
		try {
			squareRectangl(a, b);
		} catch (MyException t) {
			System.out.println(t);
		}
	}

	public static void squareRectangl(int n1, int n2) throws MyException {
		if (n1 > 0 && n2 > 0) {
			System.out.println("Square is: " + (n1 * n2));
		} else {
			throw new MyException("numbers less than 0");
		}
	}
}

@SuppressWarnings("serial")
class MyException extends Exception {
	public MyException(String msg) {
		super(msg);
	}

}
