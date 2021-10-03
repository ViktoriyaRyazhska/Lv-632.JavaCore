import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class appl {

	public static void main(String[] args) throws NumberFormatException, IOException {
		Employee [] my = new Employee[5];
		my [0]= new Employee ("Svetlana", 4, 20);
		my [1]= new Employee ("Tania", 2, 23);
		my [2]= new Employee ("Alex", 4, 12);
		my [3]= new Employee ("Vera", 5, 34);
		my [4]= new Employee ("Lida", 2, 54);
		
		
		for (int i = 0; i < my.length; i++) {
	           System.out.println(my[i]);
			}
		
	int numberofdepartment =0;
	BufferedReader br = new BufferedReader(						// information certain department 
	new InputStreamReader(System.in));
	System.out.println("Input number certain department ");
	numberofdepartment = Integer.parseInt(br.readLine());
															//all employees of a certain department (enter department number in the console);
int col=0;

	for (int i = 0; i < my.length; i++) {
		my[i].getDepartment();
	if (my[i].getDepartment() == numberofdepartment)
		{ col++;
	System.out.println("This is all employees of a certain department   "+ my[i]);
		}
										}				
	if (col == 0)											// if don't print anything
	System.out.println("This is no employees of a certain department");
    
	
    														//arrange workers by the field salary in descending order.
	Employee temp = new Employee();
	for (int i = 0; i < my.length - 1; i++) {
		for (int j = i + 1; j < my.length; j++) {
			my[i].getSalary();
			if (my[i].getSalary() < my[j].getSalary()) {
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
		
	

	
	
	
