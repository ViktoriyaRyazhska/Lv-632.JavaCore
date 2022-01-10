package lesson009d;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Employee {

	  public static void main(String[] args) throws IOException {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			HashMap<Integer, String> employeeMap = new HashMap<Integer, String>();
			employeeMap.put(1001, "AAA");
			employeeMap.put(1003, "BBB");
			employeeMap.put(1005, "CCC");
			employeeMap.put(1007, "DDD");
			employeeMap.put(1009, "EEE");
			employeeMap.put(1011, "AAA");
			employeeMap.put(1013, "DDD");
			employeeMap.put(1015, "HHH");
			employeeMap.put(1017, "BBB");
			employeeMap.put(1019, "AAA");
			System.out.println("Initial Map Employees: \n" + employeeMap);

			Set<Integer> ids = employeeMap.keySet();
			System.out.println("ID: " + ids);

			Collection<String> values = employeeMap.values();
			System.out.println("Employee: " + values);

			System.out.println("\nChecking if a value exists in a employeeMap.");
			System.out.print("Enter Employee ID (>1000): ");
			int id = Integer.parseInt(br.readLine());

			if (employeeMap.containsKey(id)) {
				  System.out.printf("ID: %d  Value: %s \n", id, employeeMap.get(id));
			} else {
				  System.out.println("Not found => " + id);
			}

			System.out.print("\nEnter name of employee [for example AAA]: ");
			String name = br.readLine();

			if (employeeMap.containsValue(name.toUpperCase())) {
				  for (Map.Entry<Integer, String> item : employeeMap.entrySet()) {
						if (item.getValue().equalsIgnoreCase(name)) {
							  System.out.printf("ID: %d  Value: %s \n", item.getKey(), item.getValue());
						}
				  }
			} else {
				  System.out.println("Not found => " + name);
			}
	  }

}