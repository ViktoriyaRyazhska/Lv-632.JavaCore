package lesson9;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

public class task2 {

	public static void main(String[] args) {

		Map<Integer, String> employeeMap = new HashMap<Integer, String>();
		employeeMap.put(1, "Oleg");
		employeeMap.put(2, "Viktor");
		employeeMap.put(3, "Olga");
		employeeMap.put(4, "Andriy");
		employeeMap.put(5, "Evgen");
		employeeMap.put(6, "Mykola");
		employeeMap.put(7, "Tetyana");
		System.out.println("employeeMap: " + employeeMap);

		System.out.println("Enter employee id...");
		Scanner scan = new Scanner(System.in);
		int id = scan.nextInt();
		findById(id, employeeMap);

		System.out.println("Enter employee name...");
		Scanner scan2 = new Scanner(System.in);
		String name = scan2.nextLine();
		findByName(name, employeeMap);

	}

	
	public static void findById(int Id, Map<Integer, String> map) {
		if (map.containsKey(Id)) {
			System.out.printf("%s has id %d.\n", map.get(Id), Id);
		} else
			System.out.println("Incorrect id");
	}

	public static void findByName(String name, Map<Integer, String> map) {
		if (map.containsValue(name)) {
			for (Entry<Integer, String> entry : map.entrySet()) {
				if (entry.getValue().equals(name)) {
					System.out.printf("%s has id %d.\n", name, entry.getKey());
					break;
				}
			}
		} else
			System.out.println("Incorrect name.");
	}

}
