package lesson7.CW7.model;

public class Cat implements Animal {
    private String name;

    public Cat(String name) {
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
        return "Cat " +
                "'" + name + '\'';
    }

    @Override
    public String voice() {
        return this + " meows!";
    }

    @Override
    public String feed() {
        return this + " drinks milk!";
    }
}
