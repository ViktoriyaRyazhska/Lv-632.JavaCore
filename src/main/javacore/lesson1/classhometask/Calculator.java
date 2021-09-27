package lesson1.classhometask;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Calculator {
    public Double getCalculation(double a, double b) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String operation = "";
        double result;

        System.out.println("Enter the operation you want to perform: ");

        try {
            operation = br.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
        switch (operation) {
            case "*":
                result = a * b;
                break;
            case "/":
                if (b != 0) {
                    result = a / b;
                } else {
                    throw new IllegalArgumentException("Cannot be divisible by 0");
                }
                break;
            case "+":
                result = a + b;
                break;
            case "-":
                result = a - b;
                break;

            default:
                throw new IllegalStateException("Unexpected value: " + operation);
        }
        return result;
    }
}