
public class Task13 {

	  private static int NUM = 2520;

	  public static void main(String[] args) {

			System.out.println(
						"The smallest positive number that is evenly divisible by all of the numbers from 1 to 20 is: "
									+ dividedByEeachOfNumbers());
	  }

	  public static int dividedByEeachOfNumbers() {
			boolean found = false;
			while (!found) {
				  NUM += 2520;
				  boolean isDividable = true;
				  for (int j = 11; j <= 20; j++) {
						if (NUM % j != 0) {
							  isDividable = false;
							  break;
						}
				  }
				  if (isDividable) {
						found = true;
				  }
			}
			return NUM;
	  }
}
