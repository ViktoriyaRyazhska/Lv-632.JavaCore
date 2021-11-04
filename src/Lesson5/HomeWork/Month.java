package Lesson5.HomeWork;

/*
Ask user to enter the number of month.
Read the value and write the amount of days in this month
(create array with amount days of each month).
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Month {
    public static void main(String[] args) throws IOException {
        int month[] = new int[12];
        month[0] = 31;
        month[1] = 28;
        month[2] = 31;
        month[3] = 30;
        month[4] = 31;
        month[5] = 30;
        month[6] = 31;
        month[7] = 31;
        month[8] = 30;
        month[9] = 31;
        month[10] = 30;
        month[11] = 31;

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter a number of month");

        int numberOfMonth = Integer.parseInt(reader.readLine());

        if (numberOfMonth <= 12) {
            for (int i = numberOfMonth; ; ) {
                System.out.println("There are " + month[i - 1] + " days in month");
                break;
            }
        } else if (numberOfMonth > 12 || numberOfMonth < 1) {
            System.out.println("Enter correct number of month");
        }
    }
}
