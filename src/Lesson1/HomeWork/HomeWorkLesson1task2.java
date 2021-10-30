package Lesson1.HomeWork;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class HomeWorkLesson1task2 {

    //Define String variables name and address.
    // Output question "What is your name?"
    // Read the value name and output next question: “Where are you live, (name)?".
    // Read address and write whole information.

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("What is your name?");

        String name = bufferedReader.readLine();

        System.out.println("Where are you live, " + name + "?");

        String address = bufferedReader.readLine();

        System.out.println("Your name is " + name + " and you live in " + address + ".");

    }
}
