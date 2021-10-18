package lesson10;

import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class task1 {

	public static void main(String[] args) {

		String a = "IT";
		String b = "IT Academy";
		System.out.println(b.contains(a));

		String fullName = "Kovalenko Sergiy Olegovych";
		String[] FN = fullName.split(" ");
		System.out.println(FN[0] + " " + FN[1].charAt(0) + "." + FN[2].charAt(0) + ".");
		System.out.println(FN[1]);
		System.out.println(FN[1] + " " + FN[2] + " " + FN[0]);
	
		ArrayList<String> N = new ArrayList<String>();
		N.add("KOKL");
		N.add("OL21p");
		N.add("we");
		N.add("Njdn ejnjd fdddd");
		N.add("%444jd _  - d+3 3kedfdf");
		for (String q:N) {
			checkName(q);
		}
	}
	public static void checkName(String name) {
		Pattern p = Pattern.compile("^[a-zA-Z0-9_-]{3,15}$");
		Matcher m = p.matcher(name);
		System.out.println(m.matches());
	}

}
