package task11;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class firsttask11 {

	
	public static void main(String[] args) {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		try {		       
				System.out.println("Please enter a lenght of the rectangle : ");
	        	int a = Integer.parseInt(br.readLine( ));
	            System.out.print("Please enter b lenght of the rectangle : ");
	            int b = Integer.parseInt(br.readLine( ));
	            Rectangle r = new Rectangle(a,b);
	            r.squareRectangle();
	            
			}
		
	        catch (MyException e1) {
	        	 System.err.print(e1);
	        	 }
	         
		   catch (IOException e1) {
	        	 System.err.print("You IOException e ");
	        }
			
			catch (NumberFormatException e1) {
				System.err.print("You enter not number!!! ");
			}
		
		}
}  	 