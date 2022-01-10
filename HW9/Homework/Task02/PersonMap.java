package lesson009g;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class PersonMap {

	  public static void main(String[] args) throws IOException {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

			Map<String, String> personMap = createMap();
			System.out.println("Person Map: " + personMap.entrySet());

			createDuplicateValue(personMap);
			searchDuplicates(personMap);

			System.out.print("Do you want to remove the duplicate name? ");
			System.out.println("If 'YES', then enter this name from the console: ");
			String input = br.readLine();
			removeDubicate(personMap, input);
			System.out.println("Person Map: " + personMap.entrySet());
	  }

	  public static Map<String, String> createMap() {
			Map<String, String> map = new HashMap<>();
			for (int i = 0; i < 10; i++) {
				  String firstName = genRandomAlphabetic();
				  String lastName = genRandomAlphabetic();
				  firstName = firstName.substring(0, 1).toUpperCase() + firstName.substring(1);
				  lastName = lastName.substring(0, 1).toUpperCase() + lastName.substring(1);
				  map.put(lastName, firstName);
			}
			return map;
	  }

	  public static String genRandomAlphabetic() {
			int leftLimit = 97; // letter 'a'
			int rightLimit = 122; // letter 'z'
			int targetStringLength = 5; // word length
			Random random = new Random();

			return random.ints(leftLimit, rightLimit + 1).limit(targetStringLength)
						.collect(StringBuilder::new, StringBuilder::appendCodePoint, StringBuilder::append).toString();
	  }

	  public static void createDuplicateValue(Map<String, String> personMap) {
			String firstValue = null;
			String lastKey = null;
			for (Map.Entry<String, String> element : personMap.entrySet()) {
				  while (firstValue == null) {
						firstValue = element.getValue();
				  }
				  lastKey = element.getKey();
			}
			personMap.remove(lastKey);
			personMap.put(lastKey, firstValue);
			System.out.print("Person Map with duplicate name: ");
			for (Map.Entry<String, String> element : personMap.entrySet()) {
				  System.out.print(element + ", ");
			}
	  }

	  public static void searchDuplicates(Map<String, String> personMap) {
			HashMap<String, String> copy1 = new HashMap<>(personMap);
			HashMap<String, String> copy2 = new HashMap<>(personMap);
			boolean hasMapDuplicate = false;
			for (Map.Entry<String, String> pair1 : copy1.entrySet()) {
				  int count = 0;
				  for (Map.Entry<String, String> pair2 : copy2.entrySet()) {
						if (pair1.getValue().equals(pair2.getValue())) {
							  count++;
						}
				  }
				  if (count > 1) {
						hasMapDuplicate = true;
						System.out.println("Duplicate name: " + pair1.getValue() + " has count " + count);
				  }
			}
			if (!hasMapDuplicate) {
				  System.out.println("No duplicates name in map");
			}
	  }

	  public static void removeDubicate(Map<String, String> personMap, String input) {
			HashMap<String, String> rem = new HashMap<>(personMap);
			for (Map.Entry<String, String> pair : rem.entrySet()) {
				  if (pair.getValue().equals(input))
						personMap.remove(pair.getKey());
			}
	  }

}