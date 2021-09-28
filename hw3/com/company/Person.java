package com.company;

import java.time.LocalDate;
import java.util.Scanner;

public class Person {
    private String firstName;
    private String lastName;
    private int birthYear;
    Scanner scanner = new Scanner(System.in);
    private int age;
    static int count;

    public Person(String firstName, String lastName) {
        setValues(firstName, lastName);
        count++;
    }

    public Person(){
        count++;
    }




    private void setValues(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = LocalDate.now().getYear() - birthYear;
        this.birthYear = LocalDate.now().getYear() - age;
    }



    public void getAge(){
        System.out.print("Your age: ");
        this.age = scanner.nextInt();
        this.birthYear = LocalDate.now().getYear() - age;
    }

    public void input(){
        System.out.println("Begin input");
        System.out.print("First_name: ");
       this.firstName = scanner.nextLine();
        System.out.print("Last_name: ");
       this.lastName = scanner.nextLine();
        System.out.print("Your date: ");
       this.birthYear = scanner.nextInt();
        this.age = LocalDate.now().getYear() - birthYear;
    }

    public void output(){
        System.out.println("---------------------------------------");
        System.out.println("Begin otput");
        System.out.println("First name: " + firstName + "\nLast name: " + lastName);
        System.out.println("Age: " + age);
        System.out.println("Year: " + birthYear);
        System.out.println("---------------------------------------");
    }

}
