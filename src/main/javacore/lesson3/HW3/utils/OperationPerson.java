package lesson3.HW3.utils;

import lesson3.HW3.model.Person;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.time.LocalDate;
import java.util.Scanner;

public class OperationPerson {
    public int getAge(Person person) {
        return LocalDate.now().getYear() - person.getbYear();
    }

    public String input(BufferedReader reader) throws IOException {
        reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the year of birth: ");
        String str = reader.readLine();
        return str;
    }

    public void output(Person person) {
        System.out.println("My name is " + person.getFirstName() + " "
                + person.getLastName() + ", I am "
                + this.getAge(person) + " years old.");
    }
}