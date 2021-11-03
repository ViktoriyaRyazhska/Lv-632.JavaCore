package lesson7.CW7.model;

public class Dog implements Animal{
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
        return "Dog " +
                "'" + name + '\'';
    }

    @Override
    public String voice() {
        return this + " barks!";
    }

    @Override
    public String feed() {
        return this + " eats meat";
    }
}
