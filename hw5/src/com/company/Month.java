package com.company;

import java.io.BufferedReader;
import java.util.Scanner;


public class Month {
    public int numberMonth(int[] daysOfMonth){
        Scanner scanner = new Scanner(System.in);
        int s = scanner.nextInt();

        switch (s) {
            case 1:
                System.out.println(daysOfMonth[s - 1]);
                break;
            case 2:
                System.out.println(daysOfMonth[s - 1]);
                break;
            case 3:
                System.out.println(daysOfMonth[s - 1]);
                break;
            case 4:
                System.out.println(daysOfMonth[s - 1]);
                break;
            case 5:
                System.out.println(daysOfMonth[s - 1]);
                break;
            case 6:
                System.out.println(daysOfMonth[s - 1]);
                break;
            case 7:
                System.out.println(daysOfMonth[s - 1]);
                break;
            case 8:
                System.out.println(daysOfMonth[s - 1]);
                break;
            case 9:
                System.out.println(daysOfMonth[s - 1]);
                break;
            case 10:
                System.out.println(daysOfMonth[s - 1]);
                break;
            case 11:
                System.out.println(daysOfMonth[s - 1]);
                break;
            case 12:
                System.out.println(daysOfMonth[s - 1]);
                break;

            default:
                System.out.println("Not found month!");
        }
        return daysOfMonth[s-1];
    }
}
