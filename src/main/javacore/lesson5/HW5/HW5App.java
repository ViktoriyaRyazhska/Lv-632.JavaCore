package lesson5.HW5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class HW5App {
    public static void main(String[] args) throws IOException {
        int[] dayMonth = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        NumberOfMonth(dayMonth, reader);
        NumberOfMonth_Ver2(dayMonth, reader);

    }

    public static void NumberOfMonth(int[] dayMonth, BufferedReader reader) throws IOException {
        switch (Integer.parseInt(reader.readLine())) {
            case 1:
                System.out.println(dayMonth[0]);
                break;
            case 2:
                System.out.println(dayMonth[1]);
                break;
            case 3:
                System.out.println(dayMonth[2]);
                break;
            case 4:
                System.out.println(dayMonth[3]);
                break;

            default:
                System.out.println("Not found month!");
        }
    }

    public static void NumberOfMonth_Ver2(int[] dayMonth, BufferedReader reader) throws IOException {
        int x = Integer.parseInt(reader.readLine());
        if (x < 13 || x > 0) {
            System.out.println(dayMonth[x - 1]);
        } else {
            throw new ArrayIndexOutOfBoundsException("Not found month!");
        }
    }

}
