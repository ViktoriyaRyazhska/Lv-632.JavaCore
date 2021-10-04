package lesson001;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task03 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("How are you?");

		// Plugin ANSI Escape in Console
		// https://mihai-nita.net/2013/06/03/eclipse-plugin-ansi-in-console/
		System.out.println("\u001B[36mChoose answer from the proposed options:\u001b[0m ");

		System.out.println(
				"1. “Fine, thank You!”, \n2. “Not bad, thank you!”, \n3. “The same as usual, thank you!”, \n4. “So far so good”, \n5. “Not so bad!”, \n6. “So-so!”, \n7. “Pretty bad!”, \n8. “All the better for seeing you!”, \n9. “Could be better!”, \n10. “Same old, same old!” ");
		String answer = br.readLine();
		System.out.print("You are Today:  " + answer);

	}

}
