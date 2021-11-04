package Lesson5.ClassTasks;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Employee {
    //Create a class Employee with fields name, department number, salary

    private String name;
    private int departmentNumber;
    private int salary;

    public Employee() {
    }

    public Employee(String name, int departmentNumber, int salary) {
        this.name = name;
        this.departmentNumber = departmentNumber;
        this.salary = salary;
    }

    public static void main(String[] args) throws IOException {

        Employee[] list = new Employee[5];

        list[0] = new Employee("Sasha", 1, 1000);
        list[1] = new Employee("Dasha", 2, 1250);
        list[2] = new Employee("Ihor", 3, 850);
        list[3] = new Employee("Nastia", 2, 700);
        list[4] = new Employee("Vasia", 1, 1500);

        for (int i = 0; i < list.length; i++) {
            System.out.println(list[i]);
        }

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter department number");
        int department = Integer.parseInt(bufferedReader.readLine());
        for (int i = 0; i < list.length; i++) {
            if (department == list[i].getDepartmentNumber()) {
                System.out.println(list[i].toString());
            }
        }

        for (int i = 0; i < list.length - 1; i++) {
            for (int j = i + 1; j < list.length; j++) {
                Employee temp;
                if (list[i].getSalary() < list[j].getSalary()) {
                    temp = list[i];
                    list[i] = list[j];
                    list[j] = temp;
                }
            }
        }

        System.out.println("Sorting workers by salary:");

        for (int i = 0; i < list.length; i++) {
            System.out.println(list[i].toString());
        }

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getDepartmentNumber() {
        return departmentNumber;
    }

    public void setDepartmentNumber(int departmentNumber) {
        this.departmentNumber = departmentNumber;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", departmentNumber=" + departmentNumber +
                ", salary=" + salary +
                '}';
    }
}
