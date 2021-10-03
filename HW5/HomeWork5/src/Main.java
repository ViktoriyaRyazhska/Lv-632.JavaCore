import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		Car [] my = new Car[4];
		my [0]= new Car ("Hyundai", 1994, 1.4f);
		my [1]= new Car ("Ria", 2020, 2.0f);
		my [2]= new Car ("Mazda", 2021, 1.2f);
		my [3]= new Car ("Ceed", 2002, 0.9f);
		
		
		
		for (int i = 0; i < my.length; i++) {
	           System.out.println(my[i]);
			}
		
	int yearofmodel =0;
	BufferedReader br = new BufferedReader(						// information certain model year 
	new InputStreamReader(System.in));
	System.out.println("Input year of model certain ");
	yearofmodel= Integer.parseInt(br.readLine());
															//certain model year  (enter year in the console);
int col=0;

	for (int i = 0; i < my.length; i++) {
		my[i].getYear();
	if (my[i].getYear() == yearofmodel)
		{ col++;
	System.out.println("This is model of a certain year  "+ my[i]);
		}
										}				
	if (col == 0)											// if don't print anything
	System.out.println("This is no model of a certain year ");
    
	
	System.out.println("Ordered by the field year ");		//ordered by the field year
	Car temp = new Car();
	for (int i = 0; i < my.length - 1; i++) {
		for (int j = i + 1; j < my.length; j++) {
			my[i].getYear();
			if (my[i].getYear() < my[j].getYear()) {
				temp = my[i];
				my[i] = my[j];
				my[j] = temp;
			}
		}
	}
	for (int i = 0; i < my.length; i++) {
		System.out.println(my[i]);
	}
	}
}
		
	

	
	
	

