package lesson7.CW7.model;

public class Teacher extends Staff {
    private static final String TYPE_PERSON = "Teacher";

    public Teacher(String name) {
        super(name);
    }

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
        return 2000;
    }
}
