package lesson003f;

import java.io.BufferedReader;
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
	
	public void InputFirstName(BufferedReader br) throws Exception {
		System.out.println("Enter firstName: ");
		this.firstName = br.readLine();
	}

	public void InputLastName(BufferedReader br) throws Exception {
		System.out.println("Enter lastName: ");
		this.lastName = br.readLine();
	}
	
	public int getAge() {
		return LocalDate.now().getYear() - getBirthYear();
	}
}