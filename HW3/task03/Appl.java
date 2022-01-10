package lesson003d;

public class Appl {
	public static void main(String[] args) {
		Employee e = new Employee();
		e.setName("Andriy Moon");
		e.setRate(10);
		e.setHours(192);

		Employee e2 = new Employee("Stepan Fox", 8);
		e2.setHours(171);
//		example changeRate
		e2.changeRate(6);

		Employee e3 = new Employee("Viktor Sun", 5, 117);

		System.out.println(e.toString() + "  Salary:  " + e.getSalary() + "  Bonus: " + e.getBonus());
		System.out.println(e2.toString() + "  Salary:  " + e2.getSalary() + "  Bonus: " + e2.getBonus());
		System.out.println(e3.toString() + "  Salary:  " + e3.getSalary() + "  Bonus: " + e3.getBonus());
		System.out.println("TotalSum:  " + Employee.TotalSum());
	}
}
