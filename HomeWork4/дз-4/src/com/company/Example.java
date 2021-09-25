package com.company;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Example {

    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        float[] fVal = new float[3];
        System.out.println("Введіть три числа в діапазоні від -5 до 5: ");
        System.out.println("Число_1: ");
        fVal[0] = Float.parseFloat(reader.readLine());
        System.out.println("Число_2: ");
        fVal[1] = Float.parseFloat(reader.readLine());
        System.out.println("Число_3: ");
        fVal[2] = Float.parseFloat(reader.readLine());

        for (int i = 0; i < fVal.length; i++){
            if ((fVal[i] < -5) || (fVal[i]) > 5)
                System.out.println("число: " + fVal[i] + " - виходить з заданого діапазону");
        }


        int[] iVal = new int[3];
        System.out.println("Введіть три цілі числа: ");
        System.out.println("Число_1: ");
        iVal[0] = Integer.parseInt(reader.readLine());
        System.out.println("Число_2: ");
        iVal[1] = Integer.parseInt(reader.readLine());
        System.out.println("Число_3: ");
        iVal[2] = Integer.parseInt(reader.readLine());

        int iMax = iVal[0];
        for (int i = 0; i < 3; i++){
            if (iVal[i] > iMax){
                iMax = iVal[i];
            }
        }

        int iMin = iVal[0];
        for (int i = 0; i < 3; i++) {
            if (iVal[i] < iMin) {
                iMin = iVal[i];
            }
        }

        System.out.println("Максимальне з введених чисел: " + iMax);
        System.out.println("Мінімальне з введених чисел: " + iMin);

        System.out.println("Введіть код помилки: ");
        int iError = Integer.parseInt(reader.readLine());
        HTTPError httpError = null;

        switch (iError){
            case 400: httpError = HTTPError.ERROR_400;
                break;
            case 401: httpError = HTTPError.ERROR_401;
                break;
            case 402: httpError = HTTPError.ERROR_402;
                break;
            case 403: httpError = HTTPError.ERROR_403;
                break;
            case 404: httpError = HTTPError.ERROR_404;
                break;
            default:
                System.out.println("Код помиллки введено невірно!");
                break;
        }

        System.out.println("Помилка: " + httpError);
    }
}
