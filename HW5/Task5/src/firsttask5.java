
public class firsttask5 {

	public static void main(String[] args) {
													//Create an array of ten integers. Display
		int [] numbers = new int [10];
		numbers [0]=-5;
		numbers [1]=1;
		numbers [2]=2;
		numbers [3]=3;
		numbers [4]=4;
		numbers [5]=-10;
		numbers [6]=-20;
		numbers [7]=-30;
		numbers [8]=-30;
		numbers [9]=-50;
											//sum of these numbers
		int sum = 0;
		for (int i = 0; i < numbers.length; i++) { sum += numbers[i];}
		System.out.println("Sum = " + sum);


											//the biggest of these numbers
		int max = numbers[0];
		int imax = 0;
		int i = 0;
		while (i < numbers.length) {
			if (numbers[i] > max) {
				max = numbers[i];
				imax = i;
			}
			i++;
		}
		System.out.print("Biggest = " + max);
		System.out.println(" is in " + (imax + 1) + " place");

											//the sum of positive numbers in the array
		int sum1 = 0;
		for (int a =0; a < numbers.length; a++) {
			{
				if (numbers[a]>0)
				sum1 += numbers[a];
			}
		}
		System.out.println("The sum of positive numbers in the array = " + sum1);
											//the amount of negative numbers in the array
		
		int sum2 = 0;
		for (int b =0; b < numbers.length; b++) {
			{
				if (numbers[b]<0)
				sum2 += numbers[b];
			}
		}
		System.out.println("The sum of negative numbers in the array = " + sum2);
											//What values there are more: negative or positive?

		int neg = 0;
		int pos = 0;
		for (int c=0; c<numbers.length;c++) {
			if (numbers[c]>=0)
			pos ++;
			if (numbers[c]<0)
			neg ++;
			}
		System.out.println("The positive = " + pos);
		System.out.println("The negative = " + neg);
		if (neg>pos) {
			System.out.println("More negative numbers(((");
		}
		else {
			System.out.println("More positive numbers)))");
		}
		
	}

}