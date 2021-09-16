import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Thirdwork {

	public static void main(String[] args) throws IOException {
			
			BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
			
			System.out.println("Country 1");
			System.out.println("Price for minute?");
			float c1 = Float.parseFloat(br.readLine());
		    System.out.println("Minutes of talk?");
		    int t1 = Integer.parseInt(br.readLine());
		    float country1 = c1*t1;
		    System.out.println("Call to country 1 costs "+ country1);
		    
		    System.out.println("Country 2");
			System.out.println("Price for minute?");
			float c2 = Float.parseFloat(br.readLine());
		    System.out.println("Minutes of talk?");
		    int t2 = Integer.parseInt(br.readLine());
		    float country2 = c2*t2;
		    System.out.println("Call to country 2 costs "+ country2);
		    
		    System.out.println("Country 3");
			System.out.println("Price for minute?");
			float c3 = Float.parseFloat(br.readLine());
		    System.out.println("Minutes of talk?");
		    int t3 = Integer.parseInt(br.readLine());
		    float country3 = c3*t3;
		    System.out.println("Call to country 3 costs "+ country3);
		    
		    System.out.println("Time of talk with all countries = "+ (t1+t2+t3));
		    System.out.println("Call to all countries coasts =  "+ (country1+country2+country3));
		    
	}

}
