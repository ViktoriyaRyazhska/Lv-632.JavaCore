
public class secontHW5 {

	public static void main(String[] args) {
		int [] numbers = {-1,2,4,6,8,1,1,1,1,100}; 		//Enter 10 integer numbers
		int sum=0;
		int product = 1;
		int i =0;											//Calculate the sum of first 5 elements if they are positive 
													// or product of last 5 element in the other case
	
	    for (i=0; i<5;i++) 			{
	   	if (numbers[i]>0) sum += numbers[i];
	    if (numbers[i]<0) {
	    	 				System.out.println("First 5 elements are not positive (");
	    	 				for (int j=5; j<10;j++) {	 
	    	 				if (numbers[j]>0) product= product*numbers [j];
	    	 	   					 				}
	    	 				System.out.println("Product of last 5 elements "+product);
	    	 				break;
	    	 	     		}
	    							}
	    if (i==5) System.out.println("Sum of first 5 elements "+ sum);
	  							
	 }
	
}