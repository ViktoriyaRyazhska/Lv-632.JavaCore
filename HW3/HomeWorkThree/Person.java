
public class Person {
	private String firstName;
	private String lastName;
	private int birthYear;

	Person() {
	}

	public Person(String firstName) {
		super();
		this.firstName = firstName;
	}

	public Person(String firstName, String lastName) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
	}

	public Person(String firstName, String lastName, int birthYear) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.birthYear = birthYear;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public int getBirthYear() {
		return birthYear;
	}

	public void setBirthYear(int birthYear) {
		this.birthYear = birthYear;
	}

	
	@Override
	public String toString() {
		return "Person [firstName=" + firstName + ", lastName=" + lastName + ", birthYear=" + birthYear + ", Current age ="
				+ getAge() + "]";
	}

	public int getAge() {
		return 2021 - birthYear;
	}

	public void changeName(String fn, String ln) {
		this.firstName = ln;
		this.lastName = fn;
		
	}
}
