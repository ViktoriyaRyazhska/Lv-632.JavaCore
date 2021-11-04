package lesson6.HW6.model;

public class Employee {
    private String fName;
    private int age;
    private double salary;

    public Employee(String fName, int age, double salary) {
        this.fName = fName;
        this.age = age;
        this.salary = salary;
    }

    public String getfName() {
        return fName;
    }

    public void setfName(String fName) {
        this.fName = fName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "fName='" + fName + '\'' +
                ", age=" + age +
                ", salary=" + salary +
                '}';
    }

    public String report(){
        return String.format("Name: %s, Age: %d, Salary: %.2f.", getfName(),getAge(),getSalary());
     }
}
