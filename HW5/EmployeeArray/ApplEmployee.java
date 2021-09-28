import java.util.Arrays;
import java.util.Scanner;

public class ApplEmployee {
	public static void main(String[] args) {

		Employee jack = new Employee("Jack", 1, 1200);
		Employee sam = new Employee("Sam", 2, 1450);
		Employee joe = new Employee("Joe", 2, 1300);
		Employee dave = new Employee("Dave", 3, 1250);
		Employee sandra = new Employee("Sandra", 3, 1500);
		Employee katrin = new Employee("Kate", 4, 1150);

		Employee[] object = new Employee[6];
		object[0] = jack;
		object[1] = sam;
		object[2] = joe;
		object[3] = dave;
		object[4] = sandra;
		object[5] = katrin;

		System.out.println("Enter the department number to see its employees");
		Scanner input = new Scanner(System.in);

		int department = input.nextInt();
		//Calling method of choosing department:
		numberOfDepartment(object, department);
		System.out.println();
		//Calling method to sort salary
		sortSalary(object);

		input.close();

	}

	// Method for department.
	public static void numberOfDepartment(Employee[] object, int a) {
		for (int b = 0; b < object.length; b++) {
			if (a == object[b].getDepartment()) {
				System.out.println(object[b].toString());
			}
		}
	}

	// Method for salary.
	public static void sortSalary(Employee[] object) {
		System.out.println("Arrays before sort of salary: ");
		System.out.println(Arrays.toString(object));

		for (int a = 0; a < object.length - 1; a++) {
			int min = a;
			for (int b = a + 1; b < object.length; b++) {
				if (object[a].getSalary() > object[b].getSalary()) {
					min = b;
				}
			}
			Employee tmp = object[a];
			object[a] = object[min];
			object[min] = tmp;
		}
		System.out.println("Array after sorting salary:");
		System.out.println(Arrays.toString(object));
	}

}
