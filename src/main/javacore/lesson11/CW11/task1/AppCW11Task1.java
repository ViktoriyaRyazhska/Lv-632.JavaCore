package lesson11.CW11.task1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class AppCW11Task1 {
    public static void main(String[] args) {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        try {
            int result = squareRectangle(shouldReturnNumber(bufferedReader), shouldReturnNumber(bufferedReader));
            System.out.println(result);
        } catch (IllegalArgumentException e){
            System.out.println("Negativ number!");
        }
    }

    private static int squareRectangle(int a, int b) {
        return a * b;
    }

    private static int shouldReturnNumber(BufferedReader reader) {
        System.out.println("Enter number: ");
        int result = 0;
        int num = 0;
        String str = "";
        try {
            str = reader.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
        if (str.matches("^-?[0-9]+$")) {
                num = Integer.parseInt(str);
                if (num > 0) {
                    result = num;
                } else if (num == 0) {
                    System.out.println(" Divine on  0!");
                } else {
                    throw new IllegalArgumentException("!!!!!");
                }
        } else {
            System.out.println("Is letter!");
        }
        return result;
    }
}