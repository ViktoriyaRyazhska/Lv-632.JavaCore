import java.util.Scanner;

public class Home1n3n1 {
	public static void main (String[]args) {
		
		int c1 = 2;
		int c2 = 5;
		int c3 = 10;
		Scanner sc = new Scanner(System.in);
		System.out.println("Call duration to the first country : ");
		int t1 = sc.nextInt();
		System.out.println("Call duration to the second country : ");
		int t2 = sc.nextInt();
		System.out.println("Call duration to the third country : ");
		int t3 = sc.nextInt();
		System.out.println("First country: " + c1 * t1 );
		System.out.println("Second country : " + c2 * t2 );
		System.out.println("Third country : " + c3 * t3 );
		System.out.println("Total : " + (c1 * t1 + c2 * t2 + c3 * t3));
	}

}
