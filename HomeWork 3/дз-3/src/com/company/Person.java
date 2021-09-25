package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Calendar;

public class Person {
    private String firstName, lastName;
    private int birthYear = 0;

    public Person() {
    };

    public Person(String fn, String ln) {
        this.firstName = fn;
        this.lastName = ln;
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

    public void getAge() {
        System.out.println(this.firstName + " возраст: " + (Calendar.getInstance().get(Calendar.YEAR) - this.birthYear));
    }

    public void input(BufferedReader br) {
        System.out.println("Пожалуйста, введите имя человека: ");
        try {
            this.firstName = br.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("Пожалуйста, введите фамилию : ");
        try {
            this.lastName = br.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("\n" + "Введите год рождения: ");
        try {
            this.birthYear = Integer.parseInt(br.readLine());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void output() {
        System.out.println("Имя человека: " + this.firstName + " " + this.lastName + ".");
        System.out.println("Год рождения: " + this.birthYear);
        this.getAge();
    }

    public void changeName(String fn) {
        this.firstName = fn;
    }

    public void changeName(String fn, String ln) {
        this.firstName = fn;
        this.lastName = ln;
    }

    public static void main(String[] args) {
        Person[] perArray = new Person[4];
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        for (int i = 0; i < perArray.length; i++) {
            perArray[i] = new Person();
        }
        for (Person p : perArray) {
            p.input(br);
        }
        for (Person p : perArray) {
            p.output();
        }
        try {
            br.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}