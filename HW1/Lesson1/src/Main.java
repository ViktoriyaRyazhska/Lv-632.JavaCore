import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter two numbers to se results ");
		int a = Integer.parseInt(br.readLine());
		int b = Integer.parseInt(br.readLine());
		
       System.out.println("a + b = "+(a+b));
       System.out.println("a - b = "+(a-b));
       System.out.println("a * b = "+(a*b));
       System.out.println("a / b = "+(a/b));
       
       System.out.println("How are you?");
       Scanner scanner = new Scanner(System.in);
       String state = scanner.next();
       System.out.println("You are: " + state);
       scanner.close();
	}

}
