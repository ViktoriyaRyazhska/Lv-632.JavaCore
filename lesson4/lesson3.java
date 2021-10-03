package lesson3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class lesson3 {

	public static void main(String[] args) throws NumberFormatException, IOException {
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	System.out.println("Enter 3 numbers...");
	odd(Integer.parseInt(br.readLine()));
	odd(Integer.parseInt(br.readLine()));
	odd(Integer.parseInt(br.readLine()));
	dayScan();
	
	}
	
    static void odd (int n) {
		if (n%2!=0) System.out.println(n+ "- odd");
		else System.out.println(n + " - not odd");
	}
    public static void dayScan() throws NumberFormatException, IOException {
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	System.out.println("Enter number 1-7...");
    	int day=Integer.parseInt(br.readLine());
    	switch (day) {
    	case 1:
    		System.out.println("понед≥лок, monday");
    		break;
    	case 2:
    		System.out.println("в≥второк, tuesday");
    		break;
    	case 3:
    		System.out.println("середа, wednesday");
    		break;
    	case 4:
    		System.out.println("четвер, thursday");
    		break;
    	case 5:
    		System.out.println("п'€тниц€, friday");
    		break;
    	case 6:
    		System.out.println("субота, saturday");
    		break;
    	case 7:
    		System.out.println("нед≥л€, sunday");
    		break;
    		default:
    		System.out.println("Enter anoyher number");;
    		
    	}
    	
    	System.out.println("Etner coutry...");
    	String country = br.readLine();
    	switch (country) {
    	case "Ukraine":
    	case "Poland":
    	case "France":
    		System.out.println(cont.Europe);
    		break;
    	case "India":
    	case "Korea":
    	System.out.println(cont.Asia);
    	break;
    	case "USA":
    	case "Canada":
    		System.out.println(cont.America);
    		break;
    	default:
    		System.out.println("Chose anouther country");
    	}
    	
    }
	
    enum cont {
    	Europe, Asia, America;	
    }
    
    
}
	

