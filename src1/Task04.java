import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task04 {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	public static void execute4() {
		final char[] louds = { 'a', 'e', 'i', 'o', 'u', 'y' };
		String str = null;
		int counter = 0;
		System.out.print("Enter a long word: ");

		try {
			str = br.readLine().toLowerCase();
		} catch (IOException e) {
			e.printStackTrace();
		}

		char[] charArray = str.toCharArray();

		for (char let1 : charArray) {
			for (char let2 : louds) {
				if (let1 == let2) {
					counter++;
				}
			}
		}
		System.out.println("Calculate number of loud letters: " + counter);

	}
}