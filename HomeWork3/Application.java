package com.softserve.javaCore.homework3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Application {

	public static void main(String[] args) throws IOException {
		
		
		
		Person person1 = new Person();
		person1.input();
		person1.output();
		System.out.println();
		
		Person person2 = new Person();
		person2.input();
		person2.output();
		System.out.println();
		
		Person person3 = new Person();
		person3.input();
		person3.output();
		System.out.println();
		
		Person person4 = new Person();
		person4.input();
		person4.output();
		System.out.println();
		
		Person person5 = new Person();
		person5.input();
		person5.output();
        person5.changeName("Helga","Petrova");
        System.out.println();
        person5.output();
       
	}

}
