import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MainEmployee {
	public static void main(String[] args) {

		Map<Integer, String> employeeMap = new HashMap<>();

		employeeMap.put(0, "IVAN");
		employeeMap.put(1, "VASJA");
		employeeMap.put(2, "KARINA");
		employeeMap.put(3, "OLGA");
		employeeMap.put(4, "MARTA");
		employeeMap.put(5, "STEPAN");
		employeeMap.put(6, "ANTON");

		System.out.println("Enter Users ID u want to find :");
		Scanner input = new Scanner(System.in);
		int id = input.nextInt();
		System.out.println("You have entered ID: " + id);

		if (employeeMap.containsKey(id))
			System.out.println("Your user is - " + employeeMap.get(id));
		else
			System.out.println("There is no such user in our database!");

		System.out.println("Enter a name of eployee u are searching:");
		String name = input.next();
		System.out.println("You have entered name: " + name);
		if (employeeMap.containsValue(name.toUpperCase())) {

			for (Map.Entry<Integer, String> entry : employeeMap.entrySet()) {
				if (entry.getValue().equals(name.toUpperCase())) {
					System.out.println("ID of user with surched name: " + entry.getKey());
				}
			}

		} else
			System.out.println("There is no such user. Try again.");
		input.close();
	}

}
