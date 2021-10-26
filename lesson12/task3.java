package lesson12;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class task3 {

	public static void main(String[] args) {

		String file = "C:\\Users\\Андрей\\Desktop\\text.txt";
		BufferedReader br = null;
		FileReader fr = null;

		try {
			fr = new FileReader(file);
			br = new BufferedReader(fr);
			String s = null;
			int count = 0;
			ArrayList<String> myText = new ArrayList<String>();
			while ((s = br.readLine()) != null) {
				myText.add(s);
				System.out.printf("linne index %d has %d symbols\n", count, s.length());
				count++;
			}
			////////////////////max-min////////////////
			int maxI = 0;
			int max = 0;
			for (int i = 0; i < myText.size(); i++) {
				if (myText.get(i).length() > max) {
					max = myText.get(i).length();
					maxI = i;
				}
			}
			System.out.printf("The longest line has index %d\n", maxI);
			int minI = 0;
			int min = myText.get(0).length();
			for (int n = 0; n < myText.size(); n++) {
				if (myText.get(n).length() < min) {
					min = myText.get(n).length();
					minI = n;
				}
			}
			System.out.printf("The shortest line has index %d\n", minI);
			//////////////// line which consist "exciting"/////////////
			for (int a = 0; a < myText.size(); a++) {
				if (myText.get(a).contains("exciting")) {
					System.out.println(myText.get(a));
				}
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
