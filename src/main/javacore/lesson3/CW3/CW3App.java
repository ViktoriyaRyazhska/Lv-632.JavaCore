package lesson3.CW3;

import lesson3.CW3.model.Employee;

public class CW3App {
    public static void main(String[] args) {
        Employee emploee1 = new Employee("Den",3, 5);
        Employee emploee2 = new Employee("And",4, 6);
        Employee emploee3 = new Employee("Max",5, 7);
        emploee1.getSalary();
        emploee1.changeRate(8);
        System.out.println(emploee1 + "sallary " + emploee1.getSum());
        System.out.println(emploee2 + "sallary " + emploee2.getSum());
        System.out.println(emploee3 + "sallary " + emploee3.getSum());
        System.out.println("Total sum: " + Employee.getTotalSum());
    }
}
