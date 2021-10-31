package lesson10.hw;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main10 {
	
	public static void main(String [] args) {		
		//1.
		System.out.println("Please type a sentence of five words");
		String str;
		try (Scanner scanner = new Scanner(System.in)) {
			str = scanner.nextLine();
		}
		String[] words = getWords(str);	
		String longestWord = longestWord(words);
		System.out.println(longestWord);
		System.out.println(longestWord.length());		
		System.out.println(reverseWord(words, 1));
		
		//2.
		String str1 = "Java   is a  high-level,    class-based,   object-oriented programming    language.";
		System.out.println(deleteSpaces(str1));
		
		//3.
		String input = "Cost1: $1.25, Cost2: $2.45, Cost3: $0.99";	
		diaplayUS$Occurences(input);
			
	}
	
	public static String longestWord(String[] words) {
		String longestWord = words[0];
		for(String word : words){
		    if (word.length() > longestWord.length()) {
		    	longestWord = word;
		    }
		}
		return longestWord;
	}
	
	public static String[] getWords(String str) {
		return str.split("\\s*(\\s|,|\\.|;|!|\\?)\\s*");
	}
	
	
	public static String reverseWord(String[] words, int i) {
		StringBuilder strBuild = new StringBuilder(words[i]);
		strBuild = strBuild.reverse();
		return strBuild.toString();
	}
	
	public static String deleteSpaces(String str) {
		return str.replaceAll("\\s+", " ");
	}
	
	public static void diaplayUS$Occurences(String str) {
		Pattern p = Pattern.compile("\\$\\d+\\.\\d{2}");
		Matcher m = p.matcher(str);
		while (m.find()) {
			System.out.println(str.substring(m.start(), m.end()));
		}
	}

}
