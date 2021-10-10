package com.softserve.javaCore.homework3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Person {
	private String firstName;
	private String lastName;
	private int birthYear;
	int year;
	private int age;
	
	Person() {}
	
	public Person(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
	}
	
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	
	public String getFirstName() {
		return firstName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	public String getaLastName() {
		return lastName;
	}
	
	 
	public int getAge() {
		return  age = year - birthYear;
	}
	public void input () throws IOException  {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter firstName ");
		this.firstName = br.readLine();
		System.out.println("Enter lastName ");
		this.lastName = br.readLine();
		System.out.println("Enter birthYear ");
		this.birthYear = Integer.parseInt(br.readLine());
		
		System.out.println("Enter year ");
		year = Integer.parseInt(br.readLine());
	}
	
	public void output() {
        System.out.print("Name: "+firstName+" "+ lastName +" "+birthYear+" age is  "+getAge());
	}
	
	public void changeName (String fn, String ln){
		this.firstName = fn;
		this.lastName = ln;
	} 
}
