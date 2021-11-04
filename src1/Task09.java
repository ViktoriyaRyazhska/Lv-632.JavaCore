import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;

public class Task09 {

	  public static void main(String[] args) {

			int rand_int = 0;
			int n = 0;
			int countR = 0;
			Random rand = new Random();
			BufferedReader br = new BufferedReader(new InputStreamReader((System.in)));
			System.out.print("Enter RANDOM number: ");

			try {
				  n = Integer.parseInt(br.readLine());
			} catch (IOException e) {
				  e.printStackTrace();
			}

			for (int i = 1; i <= n; i++) {
				  rand_int = rand.nextInt(2);
					if (rand_int == 1) {
						  countR++;
					}
				  System.out.println("0 or 1 Random Number: " + rand_int);
			}

			  System.out.println("-------------------------------");
			  System.out.println("Number ONE generates: " + countR + " times");
	  }

}
