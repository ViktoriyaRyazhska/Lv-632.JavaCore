import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		String userNameString;
		System.out.println("Enter your full name in console:");
		Scanner input = new Scanner(System.in);
		userNameString = input.nextLine();
		
		
		String[] nameArray = userNameString.split(" ");
		
		String fName = nameArray[0];
		String lName = nameArray[1];
		String pName = nameArray[2];
		
		
		System.out.println("Name of person:"+fName);
		System.out.println("Surname :"+lName);
		System.out.println("Patronymic:"+pName);
		
		input.close();
 	}

	
}
