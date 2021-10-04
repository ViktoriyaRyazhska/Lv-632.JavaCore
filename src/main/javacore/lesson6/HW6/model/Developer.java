package lesson6.HW6.model;

public class Developer extends Employee{
    private String position;

    public Developer(String fName, int age, double salary, String position) {
        super(fName, age, salary);
        this.position = position;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    @Override
    public String toString() {
        return "Developer{" +
                "Name: " +
                "position='" + position + '\'' +
                '}';
    }

    @Override
    public String report() {
        return String.format("Name: %s, Age: %d years, Position: %s, Salary: %.2f."
                , getfName(),getAge(),getPosition(),getSalary());
    }
}
