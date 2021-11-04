import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//  For example, start with 10.
//  10 is even so we divide by 2 to get 5.
//  5 is odd so we multiply it by 3 and add 1 to get 16.
//  16 is even so we divide by 2 to get 8.
//  8 is even so we divide by 2 to get 4.
//  4 is even so we divide by 2 to get 2.
//  2 is even so we divide by 2 to get 1.
//  The sequence we got was 10, 5, 16, 8, 4, 2, 1.

public class Task10 {

	  public static void execute10() {

			int num = 0;
			int ctr = 0;
			BufferedReader br = new BufferedReader(new InputStreamReader((System.in)));

			System.out.print("Find the number of steps you will get 1: ");
			try {
				  num = Integer.parseInt(br.readLine());
			} catch (NumberFormatException | IOException e) {
				  e.printStackTrace();
			}

			while (num != 1) {

				  System.out.print(num + " ");
				  if (num % 2 == 0) {
						num = num / 2;
						ctr += 1;
				  } else {
						num = (3 * num + 1) / 2;
						ctr += 1;
				  }
			}
			System.out.println("=>" + ctr + " steps.");

	  }
}
