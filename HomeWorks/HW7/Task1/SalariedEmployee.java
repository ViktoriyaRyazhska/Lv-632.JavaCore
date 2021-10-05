package Task1;

public class SalariedEmployee extends Employee implements Payment {

    private int hours;
    private int socialSecurityNumber;

    public SalariedEmployee(String name, int hoursAtWork) {
        this.name=name;
        this.hours = hoursAtWork;
        this.socialSecurityNumber = employeeId++;
        this.salary = calculatePay();
    }

    @Override
    public int calculatePay() {
        return hours * 30;
    }

    @Override
    public String toString() {
        return "employee ID: " + socialSecurityNumber + " |Name " + name + " |salary: " + salary;
    }
}
