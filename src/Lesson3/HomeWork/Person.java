package Lesson3.HomeWork;

import sun.util.resources.LocaleData;

import java.time.LocalDate;
import java.time.Year;

public class Person {

    //three private fields: firstName, lastName and birthYear (the birthday year)

    private String firstName;
    private String lastName;
    private LocalDate birthYear;

    //properties for access to these fields

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

    public LocalDate getBirthYear() {
        return birthYear;
    }

    public void setBirthYear(LocalDate birthYear) {
        this.birthYear = birthYear;
    }

    //default constructor and constructor with 2 parameters (first and last names)

    public Person() {
    }


    public Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    //getAge() - to calculate the age of person

    public void getAge(LocalDate birthYear){

    }
}
