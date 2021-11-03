import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Task02 {

	  public static void main(String[] args) throws NumberFormatException, IOException {

			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			System.out.println("Enter number...");
			int userNumber = Integer.parseInt(br.readLine());
			List<Integer> parts = new ArrayList<Integer>();
			int temp = userNumber;
			for (int number = 2; number <= temp; number++) {
				  while ((temp % number) == 0) {
						temp /= number;
						parts.add(number);
				  }
			}
			System.out.println(
						"The number " + userNumber + " is the composition of the multiplication of numbers " + parts);
	  }

}
