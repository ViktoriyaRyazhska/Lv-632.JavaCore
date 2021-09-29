import java.util.Scanner;

public class NegativeNumber {
	public static void main(String[] args) {
		System.out.println("Enter 5 numbers");
		
		int[] array = new int[5];
		doMethod(array);
		 
	}
	public static void doMethod(int[] args) {
		Scanner input = new Scanner(System.in);
		//Fill array.
		for(int i = 0;i<args.length;i++) {
			args[i] = input.nextInt();
			if(args[i]<0) {System.out.println("You entered negative number! ");
				break;}
		}
		input.close();
		//Count of same numbers.
		int sumOfSame = 0;
		for(int i = 0;i<args.length;i++) {
			for(int j = i+1;j<args.length;j++) {
				if(args[i]==args[j]) {sumOfSame+=args[i]+args[j];}
			}
		}
		System.out.println("Sum of same numbers is = "+ sumOfSame);
	}
}
