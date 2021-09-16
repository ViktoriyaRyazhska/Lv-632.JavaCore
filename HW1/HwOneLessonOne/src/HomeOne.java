import java.util.Scanner;

public class HomeOne {
	
	public static void main (String[] args) {
		
		
		System.out.println("Enter radius to calculate perimeter and area");
		Scanner scan = new Scanner(System.in);
		double radius = scan.nextDouble();
		double area = Math.PI * radius * radius;
		double perimeter = 2 * Math.PI * radius;
		
		System.out.println(" Perimeter is : " + perimeter);
		System.out.println(" Area is : " + area);
		scan.close();
		
	}

}
