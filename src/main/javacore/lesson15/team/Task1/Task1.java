package lesson15.team.Task1;

import java.util.Scanner;

public class Task1 {

    public void getTask1() {
        System.out.println("Enter a number: ");
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        System.out.println(calculateWithFor(n));
        input.close();
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