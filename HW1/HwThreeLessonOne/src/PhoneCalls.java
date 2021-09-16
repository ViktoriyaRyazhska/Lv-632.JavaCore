import java.util.Scanner;

public class PhoneCalls {

	public static void main(String[] args) {
		
		Scanner enter = new Scanner(System.in);
		
		System.out.println("Enter the price of a phonecall of Ukraine for a minute of speaking in $");
		
		double priceOfMinUkraine = enter.nextDouble();
		System.out.println("How mutch did u speak in min?");
		double speakMinUkr = enter.nextDouble();
		double totalUkraine = priceOfMinUkraine * speakMinUkr;
		System.out.println("Your price for call in Ukraine is = "+ totalUkraine);
		
		System.out.println("Enter the price of a phonecall of Greece for a minute of speaking in $");
		
		double priceOfMinGreece = enter.nextDouble();
		System.out.println("How mutch did u speak in min?");
		double speakMinGreece = enter.nextDouble();
		double totalInGreece = priceOfMinGreece * speakMinGreece;
		System.out.println("Your price for calling in Greece is = "+totalInGreece);
		
		
		System.out.println("Enter the price of a phonecall of France for a minute of speaking in $");
		double priceOfMinFrance = enter.nextDouble();
		System.out.println("How mutch did u speak in min?");
		double speakInMinFrance = enter.nextDouble();
		double totalInFrance = priceOfMinFrance * speakInMinFrance;
		System.out.println("Your price for calling to France is = " + totalInFrance);
		
		double summary = totalUkraine + totalInGreece + totalInFrance;
		System.out.println("Summary for all calls is = " + summary + " dollars. ");
		enter.close();

	}

}
