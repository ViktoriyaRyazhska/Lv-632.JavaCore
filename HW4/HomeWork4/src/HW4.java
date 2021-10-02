import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class HW4 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
	BufferedReader br = new BufferedReader(					//read 3 float numbers
				new InputStreamReader(System.in));
	
	System.out.println("Enter 3 float numbers");
	float number1=Float.parseFloat(br.readLine());
	float number2=Float.parseFloat(br.readLine());
	float number3=Float.parseFloat(br.readLine());
	System.out.println("Your number is "+ number1 +  " & " + number2 + " & " + number3);
																//check: are they all belong to the range [-5,5];
	if (number1 >=-5 && number1<=5&number2 >=-5 && number2<=5&number3 >=-5 && number3<=5)
	System.out.println("They all belong to the range [-5,5]");
	else System.out.println("Not all belong to the range [-5,5]");
	
	
																//read 3 integer numbers 
	System.out.println("Enter your 3 numbers");
	int num1=Integer.parseInt(br.readLine());
	int num2=Integer.parseInt(br.readLine());
	int num3=Integer.parseInt(br.readLine());
																//write max of them;
	if (num1>num2&num1>num3)
	System.out.println("This is max of number "+ num1);
	if (num2>num1&num2>num3)
	System.out.println("This is max of number "+ num2);
	if (num3>num1&num3>num2)
	System.out.println("This is max of number "+ num3);
																//write min of them;
	if (num1<num2&num1<num3)
	System.out.println("This is min of number "+ num1);
	if (num2<num1&num2<num3)
	System.out.println("This is min of number "+ num2);
	if (num3<num1&num3<num2)
	System.out.println("This is min of number "+ num3);
																//read number of HTTP Error (400, 401,402, ...)
		
	HTTP error;
	error = HTTP.HTTPError401;
																// write the name of this error (Declare enum HTTPError)
	switch (error) {
	case HTTPError400: 
	System.out.println("The HyperText Transfer Protocol (HTTP) 400 Bad Request response status");
		break;
	case HTTPError401: 
		System.out.println("The HyperText Transfer Protocol (HTTP) 401 Unauthorized Error");
		break;
	case HTTPError402: 
		System.out.println("The HyperText Transfer Protocol (HTTP) 402 Payment Required");
		break;
	case HTTPError403: 
		System.out.println("The HyperText Transfer Protocol (HTTP) 403 Forbidden");
		break;
	default:
		System.out.println ("Other errors");
		System.exit (0);	}
	}								
															
	
}


