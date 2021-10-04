package lesson5.HW5;

import java.io.BufferedReader;
import java.io.IOException;

public class HW5 {
    public int NumberOfMonth(int[] dayMonth, BufferedReader reader) throws IOException {
        int x = Integer.parseInt(reader.readLine());
        switch (x) {
            case 1:
                System.out.println(dayMonth[x - 1]);
                break;
            case 2:
                System.out.println(dayMonth[x - 1]);
                break;
            case 3:
                System.out.println(dayMonth[x - 1]);
                break;
            case 4:
                System.out.println(dayMonth[x - 1]);
                break;
            case 5:
                System.out.println(dayMonth[x - 1]);
                break;
            case 6:
                System.out.println(dayMonth[x - 1]);
                break;
            case 7:
                System.out.println(dayMonth[x - 1]);
                break;
            case 8:
                System.out.println(dayMonth[x - 1]);
                break;
            case 9:
                System.out.println(dayMonth[x - 1]);
                break;
            case 10:
                System.out.println(dayMonth[x - 1]);
                break;
            case 11:
                System.out.println(dayMonth[x - 1]);
                break;
            case 12:
                System.out.println(dayMonth[x - 1]);
                break;

            default:
                System.out.println("Not found month!");
        }
        return dayMonth[x-1];
    }

    public Integer NumberOfMonth_Ver2(int[] dayMonth, BufferedReader reader) throws IOException {
        int x = Integer.parseInt(reader.readLine());
        int result = 0;
        if (x < 13 || x > 0) {
            result = dayMonth[x - 1];
        }
        return result;
    }

    public Integer calculateSumOfElements(int[] arr) {
        int sumFirst = 0;
        int sumLast = 1;
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
                    sumLast *= arr[j];
                }
            }
        }

        System.out.println(sumFirst);
        System.out.println(sumLast);
        return sumFirst + sumLast;
    }

    public String findPosition(int[] arr) {
        int countP = 0;
        int result = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 0) {
                countP++;
                if (countP == 2) {
                    result = arr[i];
                }
            }
        }
        return "Result: " + result;
    }

    public Integer enteringNotNegativNumbers(BufferedReader reader) throws IOException {
        int result = 1;
        while (true) {
            System.out.println("Entering integers until the first negative number: ");
            int x = Integer.parseInt(reader.readLine());
            if (x > 0) {
                if ((x % 2) == 0) {
                    result *= x;
                }
                continue;
            } else {
                break;
            }
        }
        return result;
    }
}
