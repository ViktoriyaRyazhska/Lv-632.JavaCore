package utils;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Reader {
    public double inputNumber() {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        double a = 0;
        System.out.println("Enter the number: ");
        try {
            a = Double.parseDouble(br.readLine());
        } catch (IOException | NumberFormatException e) {
            e.printStackTrace();
        }
        return a;
    }
}
