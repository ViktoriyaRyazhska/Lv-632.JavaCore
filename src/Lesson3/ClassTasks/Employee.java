package Lesson3.ClassTasks;

public class Employee {
    //	three private fields: name, rate and hours;

    private String name;
    private int rate;
    private int hours;

    // static field totalSum and others;

    static double totalSum = 0;
    static double salary = 0;
    static double totalSalary = 0;
    static double bonuses = 0;

    // properties for access to these fields;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRate() {
        return rate;
    }

    public void setRate(int rate) {
        this.rate = rate;
    }

    public int getHours() {
        return hours;
    }

    public void setHours(int hours) {
        this.hours = hours;
    }

    // default constructor;

    public Employee() {
    }

    // constructor with 2 parameters (name and rate);

    public Employee(String name, int rate) {
        this.name = name;
        this.rate = rate;
    }

    // constructor with 3 parameters;;

    public Employee(String name, int rate, int hours) {
        this.name = name;
        this.rate = rate;
        this.hours = hours;
    }

    // methods:
    // to calculate the salary of person (rate * hours);

    public void getSalary() {
        salary = rate * hours;
    }

    // to output information about employee;

    @Override
    public String toString() {
        return "Employee name = " + name + ", rate = " + rate + ", hours = " + hours + ", salary = " + salary +
                ", bonuses = " + bonuses + ", total sum = " + totalSum + ", total salary = " + totalSalary + ")";
    }

    // to change the rate of some employee and recalculate his salary;

    public void changeRate(int rate) {
        totalSalary = totalSalary - totalSum;
        this.rate = rate;
        salary = rate * hours;
        bonuses = salary * 0.1;
        totalSum = salary + bonuses;
        totalSalary = totalSalary + totalSum;
    }

    // to calculate 10% from salary;

    public void getBonuses() {
        bonuses = salary * 0.1;

    }

    public void totalSum(){
        totalSum = salary + bonuses;
        totalSalary += totalSum;
    }

}

