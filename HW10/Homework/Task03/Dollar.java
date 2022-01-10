package lesson010g;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Dollar {

	  public static void main(String[] args) {

			BufferedReader br = new BufferedReader(new InputStreamReader((System.in)));
			System.out.println("Enter text to check for occurrences peer to condition: ");
			System.out.println("[For example]: The Budget provides $ 3,8 billion for the Grant program, which includes a targeted increase of $295 million for the modernization of public infrastructure.");
			String input;
			try {
				  while ((input = br.readLine()) != null) {						
						checkOccurr(input);	
				  }
			} catch (IOException e) {
				  e.printStackTrace();
			}
	  }

	  public static void checkOccurr(String input) {
			String regex = "\\$(\\d*)(\\,\\d*)?";
			Pattern p = Pattern.compile(regex);
			Matcher m = p.matcher(input);
			int count = 0;
			while (m.find()) {
				  System.out.println(m.group());
				  count++;
			}
			System.out.println("------------------------------");
			System.out.println("Total occurrences: " + count);
	  }

}
