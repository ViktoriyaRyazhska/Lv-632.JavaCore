package lesson5.CW5.model;

public class Employee {
    private String fName;
    private int department;
    private Double salary;

    public Employee() {
    }

    public Employee(String fName, int department, Double salary) {
        this.fName = fName;
        this.department = department;
        this.salary = salary;
    }

    public String getfName() {
        return fName;
    }

    public void setfName(String fName) {
        this.fName = fName;
    }

    public int getDepartment() {
        return department;
    }

    public void setDepartment(int department) {
        this.department = department;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "fName='" + fName + '\'' +
                ", department=" + department +
                ", salary=" + salary +
                '}';
    }
}
