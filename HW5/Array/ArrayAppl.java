
public class ArrayAppl {

	public static void main(String[] args) {

		int[] array = { -1, 8, 7, -3, 2, 4, -5, 9, 0, 6 };

		int maxArray = array[0];

		int positiveCounter = 0;
		int negativeCounter = 0;
		int sumPositive = 0;
		int sumNegative = 0;

		// Choosing MAX value of array.
		for (int i = 0; i < array.length; i++)

			if (array[i] > maxArray) {
				maxArray = array[i];

			}
		System.out.println("Maximum number in array = " + maxArray);

		// Positive and negative numbers of array.
		for (int j = 0; j < array.length; j++) {
			if (array[j] > 0) {
				sumPositive += array[j];
				positiveCounter++;
			} else {
				sumNegative += array[j];
				negativeCounter++;
			}
		}

		System.out.println("Count of postive numbers = " + positiveCounter + " and their sum = " + sumPositive);
		System.out.println("Count of negative numberes = " + negativeCounter + " and their sum = " + sumNegative);
		
		postiveOrNegative(positiveCounter,negativeCounter);
	}
	
	//Choosing which is more: positive or negative.
	public static void postiveOrNegative(int positive, int negative) {
		if (positive > negative) {
			System.out.println("More of positives ");
		} else {
			System.out.println("More of negatives");
		}

	}
}
