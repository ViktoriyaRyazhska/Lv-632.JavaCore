package lesson11.HW11.task2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class AppHW11Task2 {
    private static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    private static int number = 1;

    public static void main(String[] args) {
        for (int i = 0; i < 9; i++) {
            try {
                System.out.println("Number start: " + number);
                System.out.println(readNumber(number, 100));
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public static int readNumber(int start, int end) throws IOException {
        System.out.println("Enter number: ");
        String string = reader.readLine();
        int result = 0;
        if (getMatches(string)) {
            int x = Integer.parseInt(string);
            if (number < x) {
                number = x;
                if (x > start && x < end) {
                    result = x;
                }
            } else {
                throw new IllegalArgumentException("The number is less than the specified interval ! ");
            }
        } else {
            throw new IllegalArgumentException("This is not number !!! ");
        }
        return result;
    }

    public static boolean getMatches(String str) {
        Pattern p = Pattern.compile("[0-9]+");
        Matcher m = p.matcher(str);
        return m.matches();
    }
}