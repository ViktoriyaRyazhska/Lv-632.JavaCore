package Lesson7.ClassTasks;

public class Dog implements Animal {
    private String name;

    public Dog(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }

    @Override
    public String voice() {
        return "I can bark";
    }

    @Override
    public String feed() {
        return "I eats meat";
    }
}
