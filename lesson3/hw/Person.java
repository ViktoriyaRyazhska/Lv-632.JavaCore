package lesson3.hw;

import java.time.LocalDate;
import java.util.Scanner;

public class Person {
	private String firstName;
	private String lastName;
	private int birthYear;
	
	public int getAge() {
		return LocalDate.now().getYear() - birthYear;
	}
	
	public void output() {
		System.out.println(firstName + " " + lastName + ", " + getAge() + " years old");
	}
	
	public void changeName(String fn, String ln) {
		this.firstName = fn;
		this.lastName = ln;
	}
	
	public void input(Scanner scanner) {
		System.out.println("Enter the first name");
		firstName = scanner.next();
		System.out.println("Enter the last name");
		lastName = scanner.next();
		System.out.println("Enter the year of birth");
		birthYear = scanner.nextInt();
	}
	
    public Person(String firstName, String lastName) {
    	this.firstName = firstName;
    	this.lastName = lastName;
	}
    
    public Person() {
		birthYear = LocalDate.now().getYear();
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

}
