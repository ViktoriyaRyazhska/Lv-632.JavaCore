import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task06 {

	  public static void execute6() {

			String str = null;
			System.out.print("Enter a long sentence: ");
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

			try {
				  str = br.readLine().toLowerCase();
			} catch (IOException e) {
				  e.printStackTrace();
			}

			String[] words = str.split("\\s+");
			System.out.println("Word Count is: " + words.length);
	  }
}
