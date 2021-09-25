import java.io.IOException;
//In the method main() create 5 objects of Person type and input information about them.

public class Main {

	public static void main(String[] args) throws IOException {
		Person person1 = new Person("Yana","Anohina");
		person1.input2();
		person1.output();
		System.out.println("Age of person "+person1.getAge());
		
		Person person2 = new Person("Sveta","Telepun");
		person2.input2();
		person2.output();
		System.out.println("Age of person "+person2.getAge());
		
		Person person3 = new Person("Ruslan","Telepun");
		person3.input2();
		person3.output();
		System.out.println("Age of person "+person3.getAge());
		
		Person person4 = new Person("Djek","Telepun");
		person4.input2();
		person4.output();
		System.out.println("Age of person "+person4.getAge());
		
		Person person5 = new Person("Vera","Tur");
		person5.output();
		person5.input();
		person5.changeName("Tania" ,"Tur");
		person5.output();
	}
}