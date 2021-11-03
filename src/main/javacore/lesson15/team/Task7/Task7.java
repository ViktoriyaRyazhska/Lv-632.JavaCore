
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task7 {
	
	
	public void run() throws IOException {
		int fact = 1; 
		int	num; 
		int count;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter a number for: ");
		num = Integer.parseInt(br.readLine());
		for (count = num; count > 0; count--) {
			fact = fact * count;
		}
		System.out.println("Factorial of " + num + " is " + fact);
	}
}
