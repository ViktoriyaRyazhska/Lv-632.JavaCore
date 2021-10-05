
public class Cleaner extends Staff {

	private final String TYPE_PERSON = "Cleaner";

	public Cleaner() {
		super();
	}

	public Cleaner(String name) {
		super(name);
	}

	public String getTYPE_PERSON() {
		return TYPE_PERSON;
	}

	@Override
	public int salary() {
		return 1000;
	}

	@Override
	void print() {
		System.out.println("Hi. My name is - "+super.getName()+" i work as "+getTYPE_PERSON()+" and my salary is ="+salary());
	}

}
