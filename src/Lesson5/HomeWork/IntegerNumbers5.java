package Lesson5.HomeWork;

/*
Enter 5 integer numbers. Find:
    position of second positive number;
    minimum and its position in the array.
Organize entering integers until the first negative number.
Count the product of all entered even numbers.
 */

import java.util.Arrays;

public class IntegerNumbers5 {
    public static void main(String[] args) {

        int countOfPositiveNumbers = 0;
        int index = 0;

        int numbers[] = new int[5];

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = i - 2;
        }

        System.out.println(Arrays.toString(numbers));

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] >= 0) {
                countOfPositiveNumbers++;
                if (countOfPositiveNumbers == 2) {
                    index = i;
                }
            }
        }

        System.out.println(index);

    }
}
