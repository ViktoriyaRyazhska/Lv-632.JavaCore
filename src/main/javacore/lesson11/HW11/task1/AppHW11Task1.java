package lesson11.HW11.task1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class AppHW11Task1 {
    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Double result = 0.0;
        double num1 = 0.0;
        double num2 = 0.0;
        try {
            num1 = inputNumber(reader);
        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
            num2 = inputNumber(reader);
        } catch (IOException e) {
            e.printStackTrace();
        }
        result = div(num1, num2);
        System.out.println(formater(result));
    }

    public static double div(double a, double b) {
        double result = 0.0;
        if (a > 0 || b > 0) {
            result = a / b;
        } else if (b == 0) {
            throw new IllegalArgumentException("Cannot be divisible by 0");
        } else {
            throw new IllegalArgumentException("Negative numbers !!! ");
        }
        return result;
    }

    public static String formater(Double num) {
        return String.format("Result: %.2f", num);
    }

    public static double inputNumber(BufferedReader reader) throws IOException {
        System.out.println("Enter double number: ");
        double number = 0.0;
        String str = reader.readLine();
        if (getMatchers(str)) {
            number = Double.parseDouble(str);
        } else {
            throw new IllegalArgumentException("Is letter or symbol! ");
        }
        return number;
    }

    public static boolean getMatchers(String num) {
        Pattern pattern = Pattern.compile("[0-9]+");
        Matcher m = pattern.matcher(num);
        return m.matches();
    }
}