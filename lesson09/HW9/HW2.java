package lesson09.HW9;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

public class HW2 {

	public static void main(String[] args) {
		Map<String, String> name = new HashMap<String, String>();
		name.put("Kozachenko", "Orest");
		name.put("Shevchenko", "Andriy");
		name.put("Ostapenko", "Orest");
		name.put("Lebid", "Igor");
		name.put("Stepanov", "Sergiy");
		name.put("Maksymenlo", "Ivan");
		name.put("Ivamov", "Oleksiy");
		name.put("Logvunenko", "Olga");
		name.put("Sarsa", "Nataliya");

		System.out.println(name);

		System.out.println("Enter firstName to check on double: ");
		Scanner scan = new Scanner(System.in);
		String n = scan.next();

		if (name.containsValue(n)) {
			Iterator<Entry<String, String>> i = name.entrySet().iterator();
			while (i.hasNext()) {
				Map.Entry entry = (Map.Entry) i.next();
				if (entry.getValue().equals(n)) {
					i.remove();
				}
			}
		}
		System.out.println(name);

	}


}
