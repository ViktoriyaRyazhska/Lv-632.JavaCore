package lessons3.HW3.utils;

import lessons3.HW3.model.Person;

import java.time.LocalDate;
import java.util.Scanner;

public class OperationPerson {
    public int getAge(Person person) {
        int nowYear = LocalDate.now().getYear();
        int age = nowYear - person.getbYear();
        return age;
    }

    public String input() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the year of birth: ");
        return scanner.nextLine();
    }

    public void output(Person person) {
        System.out.println("My name is " + person.getFirstName() + " "
                + person.getLastName() + ", I am "
                + this.getAge(person) + " years old.");
    }
}