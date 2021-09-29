import java.util.Arrays;
import java.util.Scanner;

public class FiveIntegers {
	public static void main(String[] args) {
		int[] array = new int[5];
		find(array);
	}
	
	public static void find(int[] args) {
		Scanner input = new Scanner(System.in);
		//Fill array.
		for (int i = 0;i<args.length;i++) {
			System.out.println("Enter a number.");
			args[i] = input.nextInt();
			}
		input.close();
		System.out.println("Your numbers are = "+Arrays.toString(args));
		//Finding second positive.
		int positiveCounter=0;
		for(int j = 0;j<args.length;j++ ) {
			
			if(args[j]>0) {positiveCounter++;}
			if(positiveCounter==2) {System.out.println("Your second positive number is - " + args[j]+ " at index "+ j+" position "+(j+1));}
		}
		//Finding minimum.
		int min = args[0];
		int minIndex = 0;
		for(int x = 0;x<args.length;x++) {
			   if(min > args[x])
	            {
	                min = args[x];
	                minIndex=x;
	            }
			   
		}
		System.out.println("Minimum = "+min+" at index -" + minIndex);
	}
	
		
	
}
