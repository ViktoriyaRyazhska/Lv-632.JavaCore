package lesson5.CW5;

import lesson5.CW5.model.Employee;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class CW5App {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        getArray();

        Employee[] employees = new Employee[5];
        Employee employee1 = new Employee("Max", 401,1435.0);
        Employee employee2 = new Employee("Alex", 401,1535.0);
        Employee employee3 = new Employee("Den", 401,1635.0);
        Employee employee4 = new Employee("Sam", 402,1735.0);
        Employee employee5 = new Employee("Jon", 402,1935.0);

        employees[0] = employee1;
        employees[1] = employee2;
        employees[2] = employee3;
        employees[3] = employee4;
        employees[4] = employee5;

        System.out.println("Enter department: ");
        int depart = Integer.parseInt(reader.readLine());

        for (Employee value : employees) {
            if (depart == value.getDepartment()){
                System.out.println(value.toString());
            }
        }

        List<Employee> employeeList = new ArrayList<>();
        employeeList.add(employee1);
        employeeList.add(employee2);
        employeeList.add(employee3);
        employeeList.add(employee4);
        employeeList.add(employee5);
        employeeList.sort(Comparator.comparing(Employee::getSalary).reversed());

        for (Employee emp : employeeList) {
            if (depart == emp.getDepartment()){
                System.out.println("List: " + emp.toString());
            }
        }
    }

    private static void getArray() {
        int[] arr = {10, -3, 38, 45, -7, -8, 78, 62, 23, 101};
        int sumPositiv = 0;
        int sumNegativ = 0;
        int countP = 0;
        int countN = 0;

        for (int value : arr) {
            if (value > 0) {
                sumPositiv += value;
                countP++;
            } else if ( value < 0){
                sumNegativ += value;
                countN++;
            } else {
                System.out.println("Number 0!");
            }
        }

        System.out.println(Arrays.stream(arr).max());
        System.out.println("Sum positiv numbers: " + sumPositiv);
        System.out.println("Sum negativ numbers: " + sumNegativ);
        System.out.println("Count negativ numbers: " + countN);

        showMoreOrLess(countP, countN);
    }

    private static void showMoreOrLess(int countP, int countN) {
        if (countP > countN) {
            System.out.println("Positiv numbers is more!, " + countP);
        } else {
            System.out.println("Negativ numbers is more!, " + countN);
        }
    }
}