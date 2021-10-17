package Task7;

public class Cleaner extends Staff {
	final String TYPE_PERSON = "Cleaner";	


	public Cleaner() {	}
	
	public Cleaner(String name, int salary) {
		super(name,salary);
	}

	@Override
	public void print() {
		System.out.print ("I am a "+ TYPE_PERSON);
		
	}

	@Override
	public void salary() {
			System.out.print ("My salary "+ this.getSalary());
	}
	@Override
	public String toString() {
		return  "" + TYPE_PERSON + " " + name + " "+ getSalary();
	}
}