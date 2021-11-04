
public class Task12 {

	  public static void execute12() {

			int start = 1;
			int end = 1000;

			int sum = 0;
			for (int i = start; i <= end; i++) {
				  if ((i % 3 == 0) || (i % 5 == 0))
						sum += i;
			}
			System.out.print("Sum of all the multiples of 3 or 5 below 1000: " + sum);
	  }
}

