package lesson010c;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.ListIterator;

public class ActionsOnSentence {

	  public static void main(String[] args) throws IOException {
			String input = null;
			try {
				  BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
				  System.out.println("Enter something in the console: ");

				  while ((input = br.readLine()) != null) {
						System.out.println("\nString read from console input:");
						System.out.println("=> " + input);

						System.out.println("longest string in a sentence: ");
						GetLongestWord(input);                                // variant 1
						GetLongestWordJava8(input);                           // variant 2

						System.out.println("\nReverse words a sentence: ");
						reverseFullChar(input);                               // variant 1
						reverseFullIterat(input);                             // variant 2
						reverseFullStringBuffer(input);                       // variant 3
				  }
			} catch (IOException e) {
				  e.printStackTrace();
			}
	  }

	  public static void GetLongestWord(String input) {
			List<String> sentence = Arrays.asList(input.split("\\s"));
			String longest = sentence.get(0);
			for (String element : sentence) {
				  if (element.length() > longest.length()) {
						longest = element;
				  }
			}
			System.out.println("=> " + longest + ", word length: " + longest.length());
	  }

	  public static void GetLongestWordJava8(String input) {
			String longest = Arrays.stream(input.split("\\s")).max(Comparator.comparingInt(String::length))
						.orElse(null);
			System.out.println("Using Java 8 Functional Programming");
			System.out.println("=> " + longest + ", word length: " + longest.length());

	  }

	  public static void reverseFullChar(String input) {
			char[] stringCharArray = input.toCharArray();
			String reversedString = "";
			for (int i = stringCharArray.length - 1; i >= 0; i--) {
				  reversedString = reversedString + stringCharArray[i];
			}
			System.out.println("Using charAt() method of String");
			System.out.println("=> " + reversedString);
	  }

	  public static void reverseFullIterat(String input) {
			char[] arr = input.toCharArray();
			List<Character> newSentence = new ArrayList<>();
			for (char word : arr)
				  newSentence.add(word);
			Collections.reverse(newSentence);
			ListIterator<Character> li = newSentence.listIterator();
			System.out.println("Reverse a String using ListIterator");
			System.out.print("=> ");
			while (li.hasNext())
				  System.out.print(li.next());
	  }

	  public static void reverseFullStringBuffer(String input) {
			StringBuffer sbr = new StringBuffer(input);
			sbr.reverse();
			System.out.println("\nReverse a String using StringBuffer");
			System.out.println("=> " + sbr);
	  }

}
