package lesson009f;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class UnionAndIntersection  {

	  public static void main(String[] args) {

			Set<String> set1 = new HashSet<>();
			for (int i = 0; i < 2000; i++)
				  set1.add(generatingRandomAlphabetic());

			Set<String> set2 = new HashSet<>();
			for (int i = 0; i < 2000; i++)
				  set2.add(generatingRandomAlphabetic());

			HashSet<String> union = new HashSet<>(set1);
			union.addAll(set2);
			System.out.println("Count: " + union.size());
			System.out.println("Union: " + union);

			HashSet<String> intersect = new HashSet<>(set1);
			intersect.retainAll(set2);
			System.out.println("Count: " + intersect.size());
			System.out.println("intersect: " + intersect);

	  }

	  public static String generatingRandomAlphabetic() {
			int leftLimit = 97; // letter 'a'
			int rightLimit = 122; // letter 'z'
			int targetStringLength = 4; // word length
			Random random = new Random();

			return random.ints(leftLimit, rightLimit + 1).limit(targetStringLength)
						.collect(StringBuilder::new, StringBuilder::appendCodePoint, StringBuilder::append).toString();
	  }

}
