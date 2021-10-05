
public class Student extends Person {

	private final String TYPE_PERSON = "Student";

	public Student() {
		super();
	}

	public Student(String name) {
		super(name);
	}

	public String getTYPE_PERSON() {
		return TYPE_PERSON;
	}

	@Override
	void print() {
		System.out.println("Hello! My name is -"+super.getName()+" and i am a "+getTYPE_PERSON());
	}

}
