import java.util.Scanner;

public class fourHW5 {

	public static void main(String[] args)  {
		
		Scanner input = new Scanner(System.in); 				// We declare Scanner
		System.out.println("Enter array length: ");
	    int product=1;
	    int size = input.nextInt(); 							// We read the size of the array from the keyboard and write it to size
	    int array[] = new int[size]; 							// Create an int array of size
	    System.out.println("Insert array elements:");
	    														//Let's go through the entire array, filling it
	    for (int i = 0; i < size; i++) {
	    	array[i] = input.nextInt();						// Fill the array with elements entered from the keyboard
	        if (array[i]<0) {
	        	System.out.println ("My array has length "+i);// Organize entering integers until the first negative number 
	        	size=i;
	        	break;		}  
	    }
	       System.out.println ("Inserted array elements:");
	   		for (int i = 0; i < size; i++) {
	        System.out.print (" " + array[i]); 					//Displaying the resulting array
	   										}
	    System.out.println();
	 	    														//Count the product of all entered even numbers
	    for (int i = 0; i < size; i++) {
	    	if (array[i] % 2==0) {
	    		 product= product*array [i];}
	    	}
	    System.out.println("Count the product of all entered even numbers = " + product);
	   
	    input.close();
	    }
		
}