package task10;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SecontTask10 {

	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
	    System.out.println("Enter surname, name and patronymic");
	    String name = reader.readLine();

	    String []arr = name.split(" ");
	    
	    System.out.println("Full name " + arr[0] + arr[1].charAt(0)+ arr[2].charAt(0));
	    System.out.println("Name " + arr[1]);
	    System.out.println("Name " + arr[1] + " Middle name " + arr[0] + " Last name "+ arr[2]);
		
	}

}
