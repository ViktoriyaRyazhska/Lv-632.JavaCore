package lesson1.classhometask;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TelephoneConversations {
    public void getConversations() {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        double result = 0;
        try {
            for (int i = 1; i < 4; i++) {
                System.out.println("Enter the duration of the call Country ¹ " + i + ", min: ");
                double time = Double.parseDouble(br.readLine());
                System.out.println("Enter the cost of the call for 1 min, grn: ");
                double price = Double.parseDouble(br.readLine());
                result += getCalculation (time, price);
            }
            System.out.println("Total cost: " + result);
        } catch (IOException | NumberFormatException e) {
            e.printStackTrace();
        }
    }

    private double getCalculation(double time, double price) {
        double result = time * price;
        System.out.println("Cost of the call = " + result);
        return result;
    }
}