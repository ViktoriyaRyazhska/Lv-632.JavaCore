package lesson5;

public class lesson5 {

	public static void main(String[] args) {
		int [] numbers = {2, 4, 5, 21, -5, 4, 76};
		  int max =numbers[0];
		  int sum=0;
		  for (int i=0; i<numbers.length; i++) {
			  if(numbers[i]> max) {max=numbers[i];} 
			  if (numbers[i]>0) {sum+=numbers[i];}
		  }
		  System.out.println("maximum number "+ max);
		  System.out.println("sum of positive numbers "+sum);
		  int countN=0;
		  int countP=0;
		  for(int i=0; i<numbers.length; i++) {
			  if(numbers[i]<0) {countN++;}
			  else if(numbers[i]>=0) {countP++;}
		  }
		  System.out.println("count of negative numbers  "+ countN);
		  if(countN>countP) {
			  System.out.println("Count of negative number is bigger ");
		  }
		  else System.out.println("Count of positive number is bigger");
	}
}
