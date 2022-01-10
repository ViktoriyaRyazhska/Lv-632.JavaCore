package lesson006g;

public class Appl {

	public static void main(String[] args) {

		Employee[] empls = new Employee[4];

		empls[0] = new Employee("Genesis", 38, 42700.50);
		empls[1] = new Employee("Intellias", 40, 38560.31);
		empls[2] = new Developer("ELEKS", 36, 45860.33, "Fullstack Developer");
		empls[3] = new Developer("DataArt", 45, 32680.87, "Java​ developer (strong middle)");

		for (Employee list : empls) {
			System.out.println(list.report());
		}
	}

}
