package lesson15.team.Task7;

import java.io.BufferedReader;
import java.io.IOException;

public class Task7 {

	public void getTask7(BufferedReader reader) throws IOException {
		int fact = 1; 
		int	num; 
		int count;
		System.out.println("Enter a number for: ");
		num = Integer.parseInt(reader.readLine());
		for (count = num; count > 0; count--) {
			fact = fact * count;
		}
		System.out.println("Factorial of " + num + " is " + fact);
	}
}