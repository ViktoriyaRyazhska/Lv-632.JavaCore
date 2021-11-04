package Lesson5.ClassTasks;

import java.util.Arrays;

public class Task1 {
    public static void main(String[] args) {
        int numbers[] = new int[10];
        int j = -5;

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = j;
            j += 3;
        }
        System.out.println(Arrays.toString(numbers));

        Arrays.sort(numbers);
        System.out.println("The biggest number is " + numbers[9]);

        int sumPositiveNumbers = 0;
        int amountPositiveNumbers = 0;

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > 0) {
                sumPositiveNumbers += numbers[i];
                amountPositiveNumbers++;
            }
        }

        System.out.println("The sum of positive numbers is " + sumPositiveNumbers);

        int amountNegativeNumbers = 0;

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] < 0) {
                amountNegativeNumbers++;
            }
        }

        System.out.println("The amount of negative numbers is " + amountNegativeNumbers);

        if (amountPositiveNumbers > amountNegativeNumbers) {
            System.out.println("The positive numbers are bigger. There are " + amountPositiveNumbers);
        } else {
            System.out.println("The negative numbers are bigger. There are " + amountNegativeNumbers);
        }

    }
}