import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class mainApp {

	public static void main(String[] args) throws NumberFormatException, IOException {

		BufferedReader tr = new BufferedReader(new InputStreamReader(System.in));
		String task = "";
		String t = "";
		do {
			System.out.print("\nEnter tne number of task: ");
			task = tr.readLine();
			switch (task) {
			case "1":
				Task01.execute1();
				break;
			case "2":
				task2.execute2();
				break;
			case "4":
				Task04.execute4();
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
