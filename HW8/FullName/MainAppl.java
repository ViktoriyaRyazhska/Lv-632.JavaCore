
public class MainAppl {
	public static void main(String[] args) {
		Student max = new Student(new FullName("Max", "Unknown"), 20, 4);
		Student ivan = new Student(new FullName("Ivan", "Someone"), 21, 5);

		max.activity();
		System.out.println(max.info());
		ivan.activity();
		System.out.println(ivan.info());
	}

}
