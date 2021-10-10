package com.company;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int arr[] = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        int inMonth = 0;

        try {
            System.out.println("Введіть номер місяця:");
            inMonth = Integer.parseInt(reader.readLine());

            System.out.println("В даному місяці є " + arr[inMonth - 1] + " днів");
        }
        catch (Exception e){
            System.out.println("Введено некорректні дані!");
        }
    }
}
