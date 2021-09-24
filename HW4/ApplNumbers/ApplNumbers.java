import java.util.Scanner;

public class ApplNumbers {

	public static void main(String[] args) {
		//First task choosing range of float numbers.
		System.out.println("Enter three float numbers to know if they are in range [-5,5] ");

		Scanner input = new Scanner(System.in);

		float a, b, c;

		a = input.nextFloat();
		b = input.nextFloat();
		c = input.nextFloat();

		if ((a > -5) && (a < 5) && (b > -5) && (b < 5) && (c > -5) && (c < 5)) {
			System.out.println("Yes, they are in range [-5,5]");
		} else {
			System.out.println("Not in range [-5,5]");
		}
		
		//Second task choosing maximum of three.
		System.out.println("Enter three inger number to know which is maximum ");
		
		int d,e,f;
		
		d = input.nextInt();
		e = input.nextInt();
		f = input.nextInt();
		
		if ((d>e)&&(d>f)) {System.out.println("Your first number is maximum");}
		else if ((e>d)&&(e>f)) {System.out.println("Your second number is maximum");}
		else {System.out.println("Your third number is maximum");}
		input.close();

	}

}
