import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.time.LocalDate;
										//three private fields: firstName, lastName and birthYear (the birthday year)
public class Person {
private String firstName;
private String lastName;
private int birthYear;
										//default constructor and constructor with 2 parameters (first and last names)
	 Person() {
	}

	 public Person (String firstName, String lastName) {
		 this.firstName = firstName;
		 this.lastName = lastName;
	 }
	 									//properties for access to these fields
	 public String getfirstName() { 	
		 return firstName;
	 }
	 public void setfirstName (String firstName) {
		 this.firstName = firstName;
	 }
	
	 public String getlastName() {
		 return lastName;
	 }
	 public void setlastName(String lastName) {
		 this.lastName = lastName;
	 }
	
	 public int getbirthYear() {
		return birthYear;
	}
	 public void setbirthYear(int birthYear) {
		this.birthYear = birthYear;
	}	
	// methods:
	 										// getAge() - to calculate the age of person
	 public int getAge()
	 {
	     LocalDate today = LocalDate.now();
	     int age=today.getYear();
	     return age-birthYear;
	  }
	 										//input() - to input information about person
	public void input() throws IOException	{								
		BufferedReader br = new BufferedReader(						//output() - to output information about person
				new InputStreamReader(System.in));
		System.out.println("Input firstname");
		String text = br.readLine();
		setfirstName(text);
		System.out.println("Input lastname");
		text = br.readLine();
		setlastName(text);
		System.out.println("Input year of person");
		int year= Integer.parseInt(br.readLine());
		setbirthYear(year);
		}
	
	public void input2() throws IOException	{								
		BufferedReader br = new BufferedReader(						//output() - to output information about person
				new InputStreamReader(System.in));
		System.out.println("Input year of person");
		int year= Integer.parseInt(br.readLine());
		setbirthYear(year);
		}
																	//output() - to output information about person										
		public void output() throws IOException	{						
		System.out.println("firstname "+ firstName);
		System.out.println("lastname "+ lastName);
		System.out.println("year "+ birthYear);
		}
		
	 public void changeName (String fn,String ln){						//changeName(String fn, String ln) - to change the first name or/and last name of person
		 setfirstName(fn);
		 setlastName(ln);
		 }
	 
}
	