package lesson010d;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ReplaceMultipleSpaces {

	  public static void main(String[] args) {

			BufferedReader br = new BufferedReader(new InputStreamReader((System.in)));
			System.out.println("Enter input string to be cleaned from white spaces... ");
			System.out.println("[For example]:    I     am       learning     Java      Core   ");
			String input;
			try {
				  while ((input = br.readLine()) != null) {
                                                                                   // variant 1
				  String var1 = input.trim().replaceAll("\\s+", " ");
				  System.out.print("\nUsing regular expression: ");				  
				  System.out.print("=>" + var1 + ".");
                                                                                   // variant 2
				  String regex = "\\s+(?![^\\s+$])";
				  Pattern pattern = Pattern.compile(regex);
				  Matcher matcher = pattern.matcher(input);
				  String var2 = matcher.replaceAll("");
				  System.out.print("\nUsing the java.util.regex package: ");
				  System.out.print("=>" + var2 + ".");
				  }

			} catch (IOException e) {
				  e.printStackTrace();
			}
	  }
}
