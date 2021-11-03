package lesson15.team.Task1;

import java.io.BufferedReader;
import java.io.IOException;

public class Task1 {

    public void getTask1(BufferedReader reader) {
        System.out.println("Enter a number: ");
        int n = 0;
        try {
            n = Integer.parseInt(reader.readLine());
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("Fibonachi: " + calculateWithFor(n));
    }

    public static long calculateWithFor(int n) {
        long first = 0;
        long second = 1;
        long result = n;
        for (int i = 1; i < n; i++) {
            result = first + second;
            first = second;
            second = result;
            System.out.println(first + " " + second);
        }
        return result;
    }
}