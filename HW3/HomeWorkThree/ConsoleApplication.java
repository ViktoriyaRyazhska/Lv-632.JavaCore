
public class ConsoleApplication {
	public static void main(String[] args) {
			
		Person john = new Person();
		john.setBirthYear(1990);
		john.setFirstName("John");
		john.setLastName("Walker");
		System.out.println(john.toString());;
		john.changeName("John", "Ed");
		System.out.println(john.getFirstName());
		
		Person elon = new Person("Elon","Musk",1971);
		System.out.println(elon.toString());
		
		Person bill = new Person("Bill","Gates",1955);
		System.out.println(bill.toString());
	}
}
