
public class Task14 {

	  
	        // Algorithm:
			// Solve for ways all sums less than 200 can be made with 1p,
			// then 2p etc. As the larger coins are used, add the previously found
			// solutions.
			// Do this by referencing the solution for the sub problem: (current sum
			// - coin value) and adding it on.
	  
	  
	  private static int sum = 200;

	  public static void execute14() {

			int[] coinSizes = { 1, 2, 5, 10, 20, 50, 100, 200 };
			int[] combinations = new int[sum + 1];

			combinations[0] = 1;

			for (int i = 0; i < coinSizes.length; i++) {
				  for (int j = coinSizes[i]; j <= sum; j++) {
						combinations[j] += combinations[j - coinSizes[i]];
				  }
			}

			System.out.println("How many different ways can the 2 pound sterling be made using any number of coins: "
						+ combinations[200]);
	  }
}