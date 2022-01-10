package lesson012c;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Task3 {

	  public static void main(String[] args) {

			String fileName = "D:\\eclipse-workspace\\JavaCore\\src\\resources\\mytext.txt";

			File file = new File(fileName);
			if (file.exists()) {
				  System.out.println("File Name: " + file.getName() + " exists!");
				  System.out.println("path: " + file.getAbsolutePath());
				  System.out.println("The file is " + file.length() + " bytes long");
				  if (file.canRead()) {
						System.out.println("=>ok to read<=");
				  } else {
						System.out.println("=>not ok to read<=");
				  }
			} else {
				  System.out.println("File does not exist!");
			}

			countSymbolsInLines(readFromFileIntoArray(fileName));
			minMaxInLines(readFromFileIntoArray(fileName));
			searchWord(readFromFileIntoArray(fileName));

	  }

	  public static List<String> readFromFileIntoArray(String fileName) {
			List<String> book = new ArrayList<>();
			List<String> sentence;
			BufferedReader reader = null;
			String currentLine = null;
			try {
				  reader = new BufferedReader(new FileReader(fileName));
				  while ((currentLine = reader.readLine()) != null) {
						sentence = Arrays.asList(currentLine.split("[!?.:]+"));
						book.addAll(sentence);
				  }
			} catch (FileNotFoundException e) {
				  System.err.format("File Not Found Exception: %s%n", e);
			} catch (IOException e) {
				  System.err.format("IO Exception: %s%n", e);

			} finally {
				  try {
						if (reader != null) {
							  reader.close();
						}
				  } catch (IOException ex) {
						System.err.format("IOException: %s%n", ex);
				  }
			}
			return book;
	  }

	  // Method to Count the Number of
	  // Lines, Symbols, Words, Sentences in a Text File.
	  public static void countSymbolsInLines(List<String> book) {
			int size = book.size();
			String item = null;
			int itemLength = 0;
			int countsymbols = 0;
			int wordCount = 0;

			for (int i = 0; i < book.size(); i++) {
				  item = book.get(i);
				  itemLength = item.length();
				  countsymbols += itemLength;
				  String words[] = book.get(i).split("\\s+");
				  wordCount += words.length;
				  System.out.printf("line %d has %d symbols.\n", (i + 1), itemLength);
			}

			System.out.println("Total number of lines: " + size);
			System.out.println("Total number of symbols: " + countsymbols);
			System.out.println("Total word count = " + wordCount);
	  }

	  public static void minMaxInLines(List<String> book) {
			String longest = book.get(0);
			String shortest = book.get(0);

			for (String element : book) {
				  if (element.length() > longest.length()) {
						longest = element;
				  }

				  if (element.length() < shortest.length()) {
						shortest = element;
				  }
			}
			System.out.println("MAX length: " + longest.length());
			System.out.println("MIN length: " + shortest.length());
	  }

	  public static void searchWord(List<String> book) {
			final String searchWord = "asked";
			int count = 0;
			System.out.println("\nSearch for word: " + searchWord);

			for (String element : book) {
				  if ((element.toLowerCase().trim()).contains(searchWord.toLowerCase().trim())) {
						count++;
						System.out.println(count + ". => " + element);
				  }
			}

			if (count > 0) {
				  System.out.println("Found " + count + " matches.");
			} else {
				  System.out.println("Not Found matches.");
			}
	  }

}
