import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class mainApp {

	public static void main(String[] args) throws NumberFormatException, IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter tne number of task: ");
		int task=Integer.parseInt(br.readLine());
		switch(task) {
		case 1:
		task1.execute1();
			break;
		case 2:
			task2.execute2();
			
		}


	}

}
