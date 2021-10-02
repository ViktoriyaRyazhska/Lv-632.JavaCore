import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Firsttask4 {
	
	public static void main(String[] args) throws NumberFormatException, IOException {
	BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
    System.out.println("Enter 3 numbers:");
    odd(Integer.parseInt(br.readLine()));
    odd(Integer.parseInt(br.readLine()));
    odd(Integer.parseInt(br.readLine()));
    } 
    
    static void odd (int number){
    	
    	 if (number % 2==0)
    	    {
    	    	System.out.println("Yes! It's oll");
    	    }
    	    else 
    	    {
    	    	System.out.println("No! It's not oll");
    	    }
    }
  }
	




