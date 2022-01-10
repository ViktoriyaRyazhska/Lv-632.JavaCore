package lesson014_Debuggin;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task01 {

	  public static void main(String[] args) {

			String char1 = "";
			String char2 = "";
			int countChar = 0;
			String testWord = null;

			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

			try {
				  System.out.println("Input word: ");
				  testWord = br.readLine();
				  System.out.println("Input character: ");
				  char1 = br.readLine();
			} catch (IOException ex) {
				  ex.printStackTrace();
			}

			if (testWord != null) {
				  for (int i = 0; i < testWord.length(); i++) {
						char2 = testWord.substring(i, i + 1);
						if (char1.equals(char2)) {
							  countChar++;
						}
				  }
			}
			System.out.println(
						"There are character '" + char1 + "' " + countChar + " times in the word '" + testWord + "'");
	  }

}
