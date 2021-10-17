package Task7;

public class Student extends Person{
final String TYPE_PERSON = "Student";	

	public Student() {	}
	
	public Student(String name) {
		super(name);
	}

	@Override
	public void print() {
		System.out.print ("I am a "+ TYPE_PERSON);
		
	}
}