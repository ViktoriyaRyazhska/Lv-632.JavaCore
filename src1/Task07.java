import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Task07 {

	static BufferedReader br = new BufferedReader(new InputStreamReader((System.in)));

	public static void execute7() {
		System.out.println("Input a number to define the factorial: ");
		int number = 0;
		try {
			number = Integer.parseInt(br.readLine());
		} catch (NumberFormatException | IOException e) {
			e.printStackTrace();
		}
		List<Integer> parts = new ArrayList<>();
		long temp = 1;
		for (int i = 1; i <= number; i++) {
			temp *= i;
			parts.add(i);
		}
		System.out.print(number + "!= ");
		for (int a = 0; a < parts.size(); a++) {
			System.out.print(parts.get(a) + "*");
		}
		System.out.print("=" + " " + temp);
	}

}
