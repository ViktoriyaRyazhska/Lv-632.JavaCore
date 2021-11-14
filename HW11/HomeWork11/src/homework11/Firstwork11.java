package homework11;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Firstwork11 {
	double n;
	double k;
	
	public double getN() {return n;}
	public void setN(double n) {this.n = n;	}

	public double getK() {return k;}
	public void setK(double k) {this.k = k;	}
	
	public Firstwork11() {};
	public Firstwork11(double n,double k) {
		this.n = n;
		this.k = k;
	}

	@Override
	public String toString() {
		return "Firstwork11 [n=" + n + ", k=" + k + "]";
	}
	
	public int div() {
    	BufferedReader br = new BufferedReader(	new InputStreamReader(System.in));
        try {
            System.out.println("Enter first double number = ");
            double n = Double.parseDouble(br.readLine());
            System.out.println("Enter second double number = ");
            double k = Double.parseDouble(br.readLine());
            double number = 0.00;
            number = n / k;
            System.out.println("Result = " + number );
        	}
        	catch (IOException e) {
        	 	System.err.println("IOException ");
        	 	return -1;
        	}
           	catch (NumberFormatException e ) {
           	   System.err.println("NumberFormatException");
           	   return -2;
            	} 
            catch (ArithmeticException e) {
               	System.out.println("Division by zero");
               	return -3;
            	}
            catch (Exception e) {
          	   System.err.println("Exception");
          	 return -4;
            	 }
		return 0;
				
        }
	
	public int readNumber() {
		BufferedReader br = new BufferedReader(	new InputStreamReader(System.in));
        try {	
        	System.out.println("Enter number = ");
        	int n = Integer.parseInt(br.readLine()); 
        	System.out.println("Enter start of numbers =  ");
            int start = Integer.parseInt(br.readLine());
            System.out.println("Enter end of numbers = ");
            int end = Integer.parseInt(br.readLine());
            int number = n;
            if (n > start && n < end) {
                System.out.println(number + " in the range");
            } else
                System.out.printf(number + " is not in range");
            }
           	catch (IOException e) {
        	 	System.err.println("IOException ");
        	 	return -1;
        	}
           	catch (NumberFormatException e ) {
           	   System.err.println("Non-number");
           	   return -2;
            	} 
           catch (Exception e) {
          	   System.err.println("Exception");
          	 return -4;
            	 }
		return 0;
	 }
 }           