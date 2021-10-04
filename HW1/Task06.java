package lesson001;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task06 {

	public static void main(String[] args) throws IOException {
		double c1, c2, c3, t1, t2, t3;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Standard unit per minute and Duration of phone calls to the FIRST country");
		System.out.print("²nput Standard unit per minute, ($): ");
		c1 = Double.parseDouble(br.readLine());
		System.out.print("²nput Duration of phone calls, min: ");
		t1 = Double.parseDouble(br.readLine());

		System.out.println("Standard unit per minute and Duration of phone calls to the SECOND country");
		System.out.print("²nput Standard unit per minute, ($): ");
		c2 = Double.parseDouble(br.readLine());
		System.out.print("²nput Duration of phone calls, min: ");
		t2 = Double.parseDouble(br.readLine());
		
		System.out.println("Standard unit per minute and Duration of phone calls to the THIRD country");
		System.out.print("²nput Standard unit per minute, ($): ");
		c3 = Double.parseDouble(br.readLine());
		System.out.print("²nput Duration of phone calls, min: ");
		t3 = Double.parseDouble(br.readLine());
		
		System.out.println("The cost of calls to the FIRST country ($): " + (c1*t1));
		System.out.println("The cost of calls to the SECOND country ($): " + (c2*t2));
		System.out.println("The cost of calls to the THIRD country ($): " + (c3*t3));
		System.out.println("TOTAL ($): " + ((c1*t1)+(c2*t2)+(c3*t3)));
		}
}
