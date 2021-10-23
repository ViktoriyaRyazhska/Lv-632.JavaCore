import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class WordChek {
	public static void main(String[] args) throws IOException {
		BufferedReader sentence = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter some sentence:");
		String userInput = sentence.readLine();
		System.out.println("You have entered: "+userInput);
		System.out.println("Length of sentance: "+userInput.length());
		String[] splitWords = userInput.split(" ");
		String longestWord =splitWords[0];
		
		for (int i = 0; i < splitWords.length; i++) {
			if (longestWord.length()<splitWords[i].length()) {
				longestWord = splitWords[i];
			}
		}
		String secondWord = splitWords[1];
		System.out.println("Longest word from sentence is: "+longestWord);
		System.out.println("Your second word in sentence is:"+secondWord);
		
		StringBuilder reverse = new StringBuilder(secondWord);
		
		System.out.println("Second word in sentance reversed: "+reverse.reverse());
		
	}
		
}
