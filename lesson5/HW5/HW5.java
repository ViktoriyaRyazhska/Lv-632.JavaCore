package HW5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class HW5 {

	public static void main(String[] args) throws NumberFormatException, IOException {
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		
		int[] monthDays = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31} ;
		System.out.println("Enter month's number:");
		int n = Integer.parseInt(br.readLine());
		int i;
		for (i=0;i<monthDays.length;i++)
			if(n==i+1) {
				System.out.println("This month has - "+monthDays[i]+" days");
			}
		
		// Enter 10 integer numbers. Calculate the sum of first 5 elements if they are positive or product of last 5 element in the other case.
		System.out.println("2nd task:");
		int[] numbers = {21, 3, 4, 4, 34, 2, 8, -7, 9, 10};
		int sum=0;
		int a;
		int count=0;
		int product=1;
		for(a=0;a<5;a++) {
			if(numbers[a]>0) 
				count++;
				sum+=numbers[a];		
		}
		for (a=5;a<numbers.length;a++) {
				product*=numbers[a];
			}
			if(count==5) 
			System.out.println("First 5 numbers are positive, their sum - "+sum);			
			else 
         	System.out.println("Product of the last 5 numbers - "+product);	
			
		// next task
			System.out.println("3d task:");
			int min=numbers[0];
			int count1=0;
			int aMin=0;
			for (a=0;a<numbers.length;a++) {
				if(numbers[a]>0) 
					count1++;
				if(count1==2) {
					System.out.println("Position of second positive number -"+(a+1));
				}
				if(numbers[a]<min) {
					min=numbers[a];
					aMin=a;		
				}
			}
			System.out.println("Mimimun number "+min+", its pisition "+(aMin+1));	
			
			
		
	}

}
