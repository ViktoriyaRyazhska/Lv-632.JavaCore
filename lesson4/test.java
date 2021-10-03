package lesson3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class test {

	public static void main(String[] args)throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Ener 3 numbers:");
		range(Float.parseFloat(br.readLine()));
		range(Float.parseFloat(br.readLine()));
		range(Float.parseFloat(br.readLine()));
		
		System.out.println("Enter 3 numbers");
		int n1 = Integer.parseInt(br.readLine());
		int n2 = Integer.parseInt(br.readLine());
		int n3 = Integer.parseInt(br.readLine());
		Max(n1, n2, n3);
		Min(n1, n2, n3);
		
		System.out.println("Enter error number from 400 to 402");
		int error = Integer.parseInt(br.readLine());
		switch (error){
		case 400:
			System.out.println(Error.Bad_request);
			break;
		case 401:
			System.out.println(Error.Unauthorized_Error);
			break;
		case 402:
			System.out.println(Error.Payment_Required);
			break;
			default:
				System.out.println("wrong number of HTTP Error ");
				
			
		}
		}
			static void range (float n) {
				if (-5<=n&&n<=5)
					System.out.println(n+" belong to the range [-5,5]");
				else System.out.println(n+" not in the range [-5,5]");
			}
			
		
		static void Max (int n1,int n2, int n3) {
		if(n1>n2&&n1>n3)
			System.out.println("Max number is "+n1);
		else if(n2>n1&&n2>n3)
			System.out.println("Max number is "+n2);
		else if(n3>n1&&n3>n2)
			System.out.println("Max number is "+n3);
		}
		static void Min(int n1,int n2, int n3) {
			if(n1<n2&&n1<n3)
				System.out.println("Min number is "+n1);
			else if(n2<n1&&n2<n3)
				System.out.println("Min number is "+n2);
			else if(n3<n1&&n3<n2)
				System.out.println("Min number is "+n3);
		}
		
		
		
		enum Error {
			Bad_request, Unauthorized_Error, Payment_Required 
		}
		
		
}