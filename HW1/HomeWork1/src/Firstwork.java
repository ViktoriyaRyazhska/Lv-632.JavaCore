import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Firstwork {

	public static void main(String[] args) throws NumberFormatException, IOException {
	   
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Input radius of flower bed like circle?"); // circle
		double radius = Double.parseDouble(br.readLine());
		final double Pi = 3.1415926536;
		System.out.println("Pi = " + Pi);
		System.out.println("Area - S = Pi*radius^2 = " + Pi*(radius*radius));
		System.out.println("Perimeter - P = 2*Pi*radius = " + (2*Pi*radius));

	}

}
