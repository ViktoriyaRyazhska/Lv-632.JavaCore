package com.company;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int arr1[] = new int[5];
        int arr2[] = null;

        int iSecondPositivNumber = 0;
        int iMinNumber = 0;
        int iMinNumberPosition = 1;
        int count = 0;
        int iProduct = 1;

        try {
            System.out.println("Введіть 5 цілих чисел:");
            for (int i = 0; i < 5; i++) {
                arr1[i] = Integer.parseInt(reader.readLine());

                if (arr1[i] > 0)
                    count++;
                if (count == 2)
                    iSecondPositivNumber = i+1;
            }

            iMinNumber = arr1[0];
            for (int i = 0; i < arr1.length; i++){
                if(arr1[i] < iMinNumber) {
                    iMinNumber = arr1[i];
                    iMinNumberPosition = i+1;
                }
            }


            System.out.println("Введіть декілька чисел (від'ємне число, це кінець вводу): ");

            int i = 0;
            while (i >= 0) {
                int j = Integer.parseInt(reader.readLine());

                if (j < 0) {
                    if (i == 0)
                        iProduct = 0;

                    break;
                }

                iProduct *= j;
                i++;
            }
        }
        catch (Exception e){
            System.out.println("Введено некорректні дані!");
        }

        System.out.println("Позиція другого додатнього числа: " + iSecondPositivNumber);
        System.out.println("Мінімальне число в масиві: " + iMinNumber + ", його позиція: " + iMinNumberPosition);
        System.out.println("Добуток чисел: " + iProduct);
    }
}
