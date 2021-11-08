package lesson012m;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ReadWriteInFile {

	  private static final String FILENAME1 = "D:\\eclipse-workspace\\JavaCore\\src\\resources\\file1.txt";
	  private static final String FILENAME2 = "D:\\eclipse-workspace\\JavaCore\\src\\resources\\file2.txt";

	  public static void main(String[] args) {

			writeFile(readFile(FILENAME1));

	  }

	  public static List<String> readFile(final String FILENAME1) {
			List<String> lines = new ArrayList<>();
			List<String> sentence;
			BufferedReader reader = null;
			String currentLine = null;

			File file = new File(FILENAME1);
			if (file.exists()) {
				  if (file.canRead()) {
						System.out.println("=>ok to read<=");
				  } else {
						System.out.println("=>not ok to read<=");
				  }
			} else {
				  System.out.println("File does not exist!");
			}

			try {
				  reader = new BufferedReader(new FileReader(FILENAME1, StandardCharsets.UTF_8));
				  while ((currentLine = reader.readLine()) != null) {
						sentence = Arrays.asList(currentLine.split("[!?.]+"));
						lines.addAll(sentence);
				  }
			} catch (FileNotFoundException e) {
				  System.err.format("File Not Found Exception: %s%n", e);
			} catch (IOException e) {
				  System.err.format("IO Exception: %s%n", e);

			} finally {
				  try {
						if (reader != null) {
							  reader.close();
							  System.out.println("Excellent! Added: " + lines.size() + " lines");
						}
				  } catch (IOException ex) {
						System.err.format("IOException: %s%n", ex);
				  }
			}
			return lines;
	  }

	  public static void writeFile(List<String> lines) {
			int lineLength = 0;
			int countsymbols = 0;
			String longest = lines.get(0);
			String name = null;
			String born = null;
			String nameP = "(?<=name is\\s).\\w+.\\w+";
			String bornP = "(?<=born on\\s).\\w+.\\w+.\\w+.\\w+.\\s+.\\d+";
			BufferedWriter writer = null;

			for (String line : lines) {
				  lineLength = line.length();
				  countsymbols += lineLength;

				  if (line.length() > longest.length()) {
						longest = line;
				  }

				  Pattern p1 = Pattern.compile(nameP);
				  Matcher m1 = p1.matcher(line);
				  while (m1.find()) {
						name = m1.group();
				  }

				  Pattern p2 = Pattern.compile(bornP);
				  Matcher m2 = p2.matcher(line);
				  while (m2.find()) {
						born = m2.group();
				  }
			}

			try {
				  File file = new File(FILENAME2);
				  if (file.createNewFile()) {
						System.out.println("=>ok to created<=");
				  } else {
						System.out.println("=>not ok to created<=");
				  }

				  writer = new BufferedWriter(new FileWriter(FILENAME2, StandardCharsets.UTF_8));
				  writer.write("Name: " + name + "\n");
				  writer.write("Born: " + born + "\n");
				  writer.write("Total number of symbols in file1.txt is: " + countsymbols + "\n");
				  writer.write("MAX length line in file1.txt is: " + longest + "\n");

			} catch (IOException e) {
				  System.err.format("IO Exception: %s%n", e);
			} finally {
				  if (writer != null) {
						try {
							  writer.close();
							  System.out.println("File written succesfully!");
						} catch (IOException ex) {
							  System.err.format("IOException: %s%n", ex);
						}
				  }
			}
	  }

}
