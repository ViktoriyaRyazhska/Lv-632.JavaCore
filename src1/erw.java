import java.util.Random;

public class erw {

	public static void main(String[] args) {
		Random r = new Random();
		int min = 566;
		int max = 7886;
		int diff = max - min;
		for (int i = 1; i <= 10; i++) {
			System.out.println(r.nextInt(diff));
		}

	}

}
