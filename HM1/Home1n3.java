import java.util.Scanner;

public class Home1n3 {
	public static void main (String[]args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Price for the first country per minute ");
		int c1 = sc.nextInt();
		System.out.println("Price for the second country per minute : ");
		int c2 = sc.nextInt();
		System.out.println("Price for the third country per minute : ");
		int c3 = sc.nextInt();
		System.out.println("Call duration to the first country : ");
		int t1 = sc.nextInt();
		System.out.println("Call duration to the second country : ");
		int t2 = sc.nextInt();
		System.out.println("Call duration to the third country : ");
		int t3 = sc.nextInt();
		System.out.println(c1 * t1 );
		System.out.println(c2 * t2 );
		System.out.println(c3 * t3 );
		System.out.println(c1 * t1 + c2 * t2 + c3 * t3);
	}

}
