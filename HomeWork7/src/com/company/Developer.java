package com.company;

public class Developer extends Employee{
    protected String position;

    public Developer(String name, int age, String position, double salary) {
        super(name, age, salary);
        this.position = position;
    }

    @Override
    public String report() {
        return String.format("Name: %s, Age: %d, Position: %s Salary: \u20B4 %.2f.",
                name, age, position, salary);
    }

    public static void main(String[] args) {
        Employee employee = new Employee(
                "Vova",
                18,
                1200
        );
        Developer developer = new Developer(
                "Ivan",
                21,
                "GameDev",
                2000
        );

        System.out.println("Employee:\n\t" + employee.report());
        System.out.println("Developer:\n\t" + developer.report());
    }
}