import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Thirdtask4 {
	
	public enum Continents {
		Europe, Asia, NorthAmerica, SouthAmerica, Africa, Australia, Antarctica
	}
	
	public static void main(String[] args) throws NumberFormatException, IOException {
			BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
		    System.out.println("Enter country:");
		    String country = br.readLine();
				
		Continents continents;
		continents = Continents.Asia;
		continents = Continents.Europe;
		continents = Continents.Africa;
		
		//String name = "Asia";
		//Continents continents = Continents.valueOf(name);
		switch (country) {
		case "China": case "India" : case "Taiwan":
		continents = Continents.Asia;
		System.out.println("The country is on the continent: "+ continents);
		break;
		case "Greece": case "Malta" : case "Ukraine":
		continents = Continents.Europe; 
		System.out.println("The country is on the continent: "+ continents);
		break;
		case "Egypt": case "Morocco" : case "Ethiopia":
		continents = Continents.Africa; 
		System.out.println("The country is on the continent: "+ continents);
		break;
		default:
			System.out.println ("There is no such country");
			System.exit (0);
		}		
	}
}
