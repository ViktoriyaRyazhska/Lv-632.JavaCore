package lesson7.CW7.model;

public abstract class Staff extends Person{
    public Staff(String name) {
        super(name);
    }

    public abstract int salary();
}
