package lesson7;

public class appPerson {

	public static void main(String[] args) {
		
		
		Person[] pers = new Person[3];
		pers[0]=new Student("Ivan", " Student");
		pers[1]=new Teacher("Oleg ","teacher ",2000);
		pers[2]=new Cleaner("Anna","cleaner",1000);
		
		for(Person p:pers) {
			p.print();
			if (p instanceof Staff )
			((Staff)p).salary();
		}
		
		
		
		
	}

}
