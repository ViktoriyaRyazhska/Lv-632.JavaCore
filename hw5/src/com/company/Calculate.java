package com.company;

import java.util.Scanner;

public class Calculate {

    public void Calcualates(int[] arr) {
        int sumFirst = 0;
        int productLast = 1;
        int count = 0;
        int num = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 0) {
                count++;
                if (count <= 5) {
                    sumFirst += arr[i];
                }
            }
        }
        for (int j = arr.length - 1; j >= 0; j--) {
            if (arr[j] > 0) {
                num++;
                if (num <= 5) {
                    productLast *= arr[j];
                }
            }
        }

        System.out.println(sumFirst);
        System.out.println(productLast);
    }

    public int find(int[] arr) {
        int position = 0;
        int result = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 0) {
                position++;
                if (position == 2) {
                    result = arr[i];
                }
            }
        }
        return result;

    }

  public Integer negetiveNumber(){
        int result = 1;
        for(int i = 1; i<=5; i++){

          System.out.println("Entering integers until the first negative number: ");
            Scanner scanner = new Scanner(System.in);
            int x = scanner.nextInt();
            if (x > 0) {
                if ((x % 2) == 0) {
                    result *= x;
                }
            } else {
                break;
            }
        }
        return result;
    }
}