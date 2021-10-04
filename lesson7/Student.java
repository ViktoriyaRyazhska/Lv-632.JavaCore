package lesson7;

public class Student extends Person {
final String position;

	public Student(String name, String position) {
		super(name);
		this.position=position;
		
	}

	@Override
	public void print() {
System.out.println("My name "+name +", i am a " + position);		
	}

}
