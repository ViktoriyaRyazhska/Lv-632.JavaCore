package lesson003f;

import java.time.LocalDate;

public class Person {
	private String firstName;
	private String lastName;
	private int birthYear;

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

	public Person() {
	}

	@Override
	public String toString() {
		return firstName + "  " + lastName + ", " + getAge();

	}

	public void changeFirstName(String firstName) {
		this.firstName = firstName;
	}

	public void changLastName(String lastName) {
		this.lastName = lastName;
	}

	public int getAge() {
		LocalDate date = LocalDate.now();
		int thisYear = date.getYear();
		int age = thisYear - getBirthYear();
		return age;
	}
}