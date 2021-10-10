package lesson4.hw;

import java.util.Scanner;

public enum HTTPError {
	BADREQUEST, UNAUTHORIZED, PAYMENTREQUIRED, FORBIDDEN, NOTFOUND;
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Type HTTP Error Number");
		String errorNumber = scan.nextLine();
		
		switch (errorNumber) {
		case "400" :
			System.out.print(BADREQUEST);
			break;
		case "401" :
			System.out.print(UNAUTHORIZED);
			break;	
		case "402" :
			System.out.print(PAYMENTREQUIRED);
			break;	
		case "403" :
			System.out.print(FORBIDDEN);
			break;	
		case "404" :
			System.out.print(NOTFOUND);
			break;	
		default: 
			System.out.print("Wrong http error number");
		}
	}

}
