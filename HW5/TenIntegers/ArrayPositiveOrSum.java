import java.util.Scanner;

public class ArrayPositiveOrSum {
	public static void main(String[] args) {
		int[] array = new int[10];
		countArray(array);
		
	}
	
	public static void countArray(int[] args) {
		int sumOfFive = 0;
		int sumLastFive = 0;
		
		Scanner input = new Scanner(System.in);
		for(int i = 0;i<args.length;i++) {
			System.out.println("Enter a number.");
			args[i] = input.nextInt();
			sumOfFive+=args[i];
			
			
			if((i==4)&(sumOfFive>0)) {System.out.println("Sum of first 5 numbers is = "+sumOfFive);}
			if (i>4) {sumLastFive+=args[i];}
			
		}
		System.out.println("Entered 10 integers.");
		System.out.println("Sum of last five integers = "+sumLastFive) ;
	}
}
