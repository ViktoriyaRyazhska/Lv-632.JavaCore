
public class thirdHW5 {

	public static void main(String[] args) {
															//Enter 5 integer numbers
		int [] numbers = {1,-2,-4,6,8};
															//position of second positive number
		int b=0;
		for (int i =0;i<numbers.length;i++) {
			if (numbers[i]>=0) {
				b++;
				if (b==2) System.out.println("Position of second positive = "+ (i+1));
								}
			
		}	
														//minimum and its position in the array
		int min = numbers[0];
		int imin = 0;
		int i = 0;
		while (i < numbers.length) {
			if (numbers[i] < min) {
				min = numbers[i];
				imin = i;
			}
			i++;
		}
		System.out.print("Minimum = " + min);
		System.out.println(" is in " + (imin + 1) + " place");
	}
}