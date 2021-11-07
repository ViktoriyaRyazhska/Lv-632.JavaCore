package com.softserve.javaCore.homework4;

import java.util.Scanner;

public class HttpError {

	public enum Errors {
		BAD_REQUEST, UNAUTHORIZED, PAYMENT_REQUIRED, FORBIDDEN, NOT_FOUND;
	}
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter HTTP Error Number from 400 to 404");
		String httpErrorNumber = scan.nextLine();
		
		switch (httpErrorNumber) {
		case "400":
			System.out.println (Errors.BAD_REQUEST);
			break;
		
		case "401":
			System.out.println (Errors.UNAUTHORIZED);
			break;
		
		case "402":
			System.out.println (Errors.PAYMENT_REQUIRED);
			break;
		
		case "403":
			System.out.println (Errors.FORBIDDEN);
			break;
		
		case "404":
			System.out.println (Errors.NOT_FOUND);
			break;
		
		default: 
			System.out.print("Wrong http error number");
		}
	}
}
