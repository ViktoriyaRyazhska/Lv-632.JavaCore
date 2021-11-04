package Lesson5.HomeWork;
/*
Enter 10 integer numbers.
Calculate the sum of first 5 elements if they are positive
or product of last 5 element in the other case.
 */

import java.util.Arrays;

public class IntegerNumbers10 {
    public static void main(String[] args) {
        int numbers[] = new int[10];

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = i - 2;
        }

        System.out.println(Arrays.toString(numbers));

        int sum = 0;

        for (int i = 0; i < 5; i++) {
            if (numbers[i] >= 0) {
                sum += numbers[i];
            }
        }

        System.out.println(sum);

        int product = 1;

        for (int i = 5; i < numbers.length; i++) {
            product = product * numbers[i];
        }

        System.out.println(product);
    }
}
