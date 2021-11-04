
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task01 {

	  public static void execute1() {

			int n = 0;
			int a = 1;
			int b = 1;
			int c = 1;
			BufferedReader br = new BufferedReader(new InputStreamReader((System.in)));

			System.out.print("Please enter length: ");
			try {
				  n = Integer.parseInt(br.readLine());
			} catch (NumberFormatException | IOException e) {
				  e.printStackTrace();
			}
			
			System.out.print("Fibonacci Series: ");
			for (int i = 1; i <= n; i++) {
				  a = b;
				  b = c;
				  c = a + b;
				  System.out.print(a + " ");
			}
			System.out.println();
	  }

}
