package Lesson3.ClassTasks;

public class Main {
    public static void main(String[] args) {
        Employee employee1 = new Employee();
        employee1.setName("Sasha");
        employee1.setHours(10);
        employee1.setRate(2);

        employee1.getSalary();
        employee1.getBonuses();
        employee1.totalSum();

        System.out.println(employee1.toString());

        Employee employee2 = new Employee("Oleg", 3, 40);
        employee2.getSalary();
        employee2.getBonuses();
        employee2.totalSum();

        System.out.println(employee2.toString());

        Employee employee3 = new Employee("Nastya", 7, 50);

        employee3.getSalary();
        employee3.getBonuses();
        employee3.totalSum();

        System.out.println(employee3.toString());

        System.out.println("Total salary is " + Employee.totalSalary);

        employee2.changeRate(4);

        System.out.println(employee2.toString());

        System.out.println("Total salary is " + Employee.totalSalary);
    }
}
