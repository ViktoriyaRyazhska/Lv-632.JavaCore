package lesson010b;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task010203 {

	  public static void main(String[] args) throws IOException {

//----------------------------------------------------------			

			String str1 = "IT";
			String str2 = "IT Academy";
			System.out.println(str2.contains(str1));

//----------------------------------------------------------			

			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			System.out.println("Input your Full name from the console (surname=>name=>middle name): ");
			String input = br.readLine();
			splitIntoParts(input);
			
//----------------------------------------------------------			
			
			ArrayList<String> list = new ArrayList<String>();

			list.add("_John");
			list.add("andriy123");
			list.add("777Linda5");
			list.add("Gabriel_666");
			list.add("Michell%#%");
			list.add("WilliamGGG");
			list.add("รรใด");
			list.add("Toy");
			for (String s : list) {
				  checkWithRegExp(s);
			}		
//----------------------------------------------------------
	  }

	  public static void splitIntoParts(String input) {
			String[] arr = input.split("\\s");
			if (arr.length == 3) {
				  String part1 = arr[0];
				  String part2 = arr[1];
				  String part3 = arr[2];
				  System.out.println(part1 + " " + part2.substring(0, 1) + "." + part3.substring(0, 1) + ".");
				  System.out.println(part2);
				  System.out.println(part2 + " " + part3 + " " + part1 + "\n");
			} else {
				  System.out.println("Please check that all the data entered is correct!");
			}
	  }

	  public static void checkWithRegExp(String name) {
			Pattern p = Pattern.compile("^[a-zA-Z0-9_-]{3,15}$");
			Matcher m = p.matcher(name);
			System.out.println(m.matches());
	  }

}
