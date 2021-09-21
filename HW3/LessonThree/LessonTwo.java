
public class LessonTwo {

	public static void main(String[] args) {
		
		Employee andy = new Employee("Andy",40,20);
		Employee howard = new Employee("Howard",25,21);
		Employee jack = new Employee("Jack",35,44);
		System.out.println(andy.toString());
		System.out.println(andy.getSalary());
		
		System.out.println(howard.toString());
		System.out.println(howard.getSalary());
		
		System.out.println(jack.toString());
		System.out.println(jack.getSalary());
	}
}