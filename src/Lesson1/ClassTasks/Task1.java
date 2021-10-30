package Lesson1.ClassTasks;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task1 {

    public static void main(String[] args) throws IOException {

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Напишіть будь-яке ціле число");

        int a = Integer.parseInt(bufferedReader.readLine());

        System.out.println("Напишіть будь-яке інше ціле число");

        int b = Integer.parseInt(bufferedReader.readLine());

        System.out.println("Додавання " + (a + b));
        System.out.println("Віднімання " + (a - b));
        System.out.println("Множення " + (a * b));
        System.out.println("Ділення " + (a / b));


    }
}

