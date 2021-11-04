import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class mainApp {

	public static void main(String[] args) throws NumberFormatException, IOException {

		BufferedReader tr = new BufferedReader(new InputStreamReader(System.in));
		String task = null;
		String t = null;
		System.out.println("Team1 congratulates You!");
		System.out.println("We efficiently implemented the Main () method and created a unique interface for solving problems.");
		
		do {
			System.out.print("\nEnter tne number of task: ");
			task = tr.readLine();
			switch (task) {
			case "1":
				Task01.execute1();
				break;
				
			case "2":
				Task02.execute2();
				break;
				
			case "4":
				Task04.execute4();
				break;
				
			case "6":
				Task06.execute6();	
				break;
				
			case "11":
				Task11.execute11();
				break;
				
			case "12":
				Task12.execute12();		
				break;
				
			case "13":
				Task13.execute13();		
				break;
				
			case "end":
				t = "end";
				System.out.println("Programe close.");
				break;
			default:
				System.out.println("Wrong number.");
			}
		} while (t != "end");
	}
}
