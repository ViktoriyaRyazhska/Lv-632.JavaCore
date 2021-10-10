package com.company;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) {
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    int arr[] = new int[10];
    int iFirstPart = 0;
    int iSecondPart = 1;

        try {
        System.out.println("Введіть 10 чисел:");

        for (int i = 0; i < 10; i++){
            arr[i] = Integer.parseInt(reader.readLine());

            if (i < 5)
                iFirstPart += arr[i];
            else
                iSecondPart *= arr[i];
        }

        if (iFirstPart > 0)
            System.out.println("Сума першої частини рівна: " + iFirstPart);
        else
            System.out.println("Добуток другої частини рівний: " + iSecondPart);
    }
        catch (Exception e){
        System.out.println("Введено некорректні дані!");
    }
}
}
