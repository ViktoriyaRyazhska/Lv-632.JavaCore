package lesson7.CW7.model;

public class Cleaner extends Staff {
    private static final String TYPE_PERSON = "Cleaner";

    public static String getTypePerson() {
        return TYPE_PERSON;
    }

    @Override
    public void print() {
        System.out.println("I am a " + getTypePerson() +
                " my name is " + getName());
    }

    @Override
    public int salary() {
        return 250;
    }

    public Cleaner(String name) {
        super(name);
    }
}
