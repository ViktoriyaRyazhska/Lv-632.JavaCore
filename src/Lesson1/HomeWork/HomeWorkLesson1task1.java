package Lesson1.HomeWork;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class HomeWorkLesson1task1 {

//Flower bed is shaped like a circle.
// Calculate the perimeter and area by entering the radius.
// Output obtained results.

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Напишіть радіус вашої клумби");

        double radius = Integer.parseInt(bufferedReader.readLine());

        double perimeter = 2 * 3.14 * radius;
        double area = 3.14 * Math.pow(radius, 2);

        System.out.println("Периметер вашої клумби " + perimeter);
        System.out.println("Площа вашої клумби " + area);


    }
}
