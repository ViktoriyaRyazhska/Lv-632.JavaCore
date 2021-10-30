package Lesson1.HomeWork;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class HomeWorkLesson1task3 {

    // Phone calls from three different countries are с1, с2 and с3 standard units per minute.
    // Talks continued t1, t2 and t3 minutes.
    // How much computer will count for each call separately and all talk together?
    // Input all source data from console, make calculations and output to the screen.

    public static void main(String[] args) throws IOException {

        String Hungary;
        String Poland;
        String Italy;

        int HungaryUnits = 7;
        int PolandUnits = 12;
        int ItalyUnits = 23;

        int priceOfAllCalls = 0;

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        for (int i = 0; i < 3; i++) {
            System.out.println("What is the country?");

            String country = bufferedReader.readLine();

            System.out.println("How many minutes was call?");

            int minutes = Integer.parseInt(bufferedReader.readLine());

            if (country.contains("Hungary")) {
                int priceOfCall = HungaryUnits * minutes;
                priceOfAllCalls = priceOfAllCalls + priceOfCall;
                System.out.println("Call costs " + priceOfCall);
            } else if (country.contains("Poland")) {
                int priceOfCall = HungaryUnits * minutes;
                priceOfAllCalls = priceOfAllCalls + priceOfCall;
                System.out.println("Call costs " + priceOfCall);
            } else if (country.contains("Italy")) {
                int priceOfCall = HungaryUnits * minutes;
                priceOfAllCalls = priceOfAllCalls + priceOfCall;
                System.out.println("Call costs " + priceOfCall);
            }
        }

        System.out.println("The price of all calls is " + priceOfAllCalls);

    }
}
