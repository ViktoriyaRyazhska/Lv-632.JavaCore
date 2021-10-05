
public class Teacher extends Staff {

	private final String TYPE_PERSON = "Teacher";
	
	
	
	public String getTYPE_PERSON() {
		return TYPE_PERSON;
	}

	public Teacher() {
		super();
		}

	public Teacher(String name) {
		super(name);
		}

	@Override
	public int salary() {
		return 1500;
	}

	@Override
	void print() {
		System.out.println("Hi, my name is - "+super.getName()+" and i work as a "+getTYPE_PERSON()+". My salary is -"+salary());
	}

}
