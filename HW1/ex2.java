import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ex2 {
	public static void main(String[] args) throws IOException {
	    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	    
	    System.out.println("Hello, what is your name?");
	    String name = br.readLine();
	    System.out.println("Where are you live " + name + "?");
	    String city = br.readLine();
	    System.out.println("Ok, " +name +", you live in " +city);
	    
}
}
