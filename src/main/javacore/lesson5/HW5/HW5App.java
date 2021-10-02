package lesson5.HW5;

import lesson5.HW5.model.Car;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class HW5App {
    public static void main(String[] args) throws IOException {
        int[] dayMonth = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        NumberOfMonth(dayMonth, reader);
        NumberOfMonth_Ver2(dayMonth, reader);
        calculateSumOfElements();
        findPosition();
        enteringNotNegativNumbers(reader);

        List<Car> cars = new ArrayList<>();
        cars.add( new Car("Mers",2007,2.2));
        cars.add( new Car("Opel",2003,1.6));
        cars.add( new Car("BMW",2007,3.3));
        cars.add( new Car("Tesla",2019,2.0));

        System.out.println("Enter year car: ");
        int yearCar = Integer.parseInt(reader.readLine());
        cars.sort(Comparator.comparing(Car::getYear));
         for (Car car : cars){
             if (yearCar == car.getYear()) {
                 System.out.println(car.toString());
             }
         }
    }

    public static void NumberOfMonth(int[] dayMonth, BufferedReader reader) throws IOException {
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
    }

    public static void NumberOfMonth_Ver2(int[] dayMonth, BufferedReader reader) throws IOException {
        int x = Integer.parseInt(reader.readLine());
        if (x < 13 || x > 0) {
            System.out.println(dayMonth[x - 1]);
        }
    }

    public static void calculateSumOfElements() {
        int[] arr = {10, 5, 5, -2, 5, 5, -5, 5, 10, 5};
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
    }

    public static void findPosition() {
        int[] arr = {-2, 3, -2, -4, 7};
        int countP = 0;
        int result = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 0) {
                countP++;
                System.out.println("CountP: " + countP);
                if (countP == 2) {
                    result = arr[i];
                }
            }
        }
        System.out.println("Result: " + result);
    }

    public static void enteringNotNegativNumbers(BufferedReader reader) throws IOException {
        long result = 1;
        while (true) {
            System.out.println("Entering integers until the first negative number: ");
            int x = Integer.parseInt(reader.readLine());
            if (x > 0) {
                if ((x % 2 ) ==0 ) {
                    result *= x;
                }
                continue;
            } else {
                break;
            }
        }
        System.out.println("Result: " + result);
    }
}