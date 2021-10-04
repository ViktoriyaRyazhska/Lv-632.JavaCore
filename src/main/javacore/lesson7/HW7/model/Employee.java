package lesson7.HW7.model;

public class Employee {
    private int id;
    private String name;
    private String employeeld;

    public Employee(int id, String name, String employeeld) {
        this.id = id;
        this.name = name;
        this.employeeld = employeeld;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmployeeld() {
        return employeeld;
    }

    public void setEmployeeld(String employeeld) {
        this.employeeld = employeeld;
    }

}
