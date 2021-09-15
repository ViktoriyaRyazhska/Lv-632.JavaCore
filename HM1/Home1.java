import java.util.Scanner;

public class Home1 {
	
	public static void main (String[]args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("The radius of the circle is: ");
		double rad = sc.nextDouble();
		System.out.println("Perimeter = " + (2 * rad * Math.PI));
		System.out.println("Area is = " +(Math.PI * rad * rad));
		
	}

}
