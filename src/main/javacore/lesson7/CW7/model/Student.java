package lesson7.CW7.model;

public class Student extends Person{
    private static final String TYPE_PERSON = "Student";

    public Student(String name) {
        super(name);
    }

    public static String getTypePerson() {
        return TYPE_PERSON;
    }

    @Override
    public void print() {
        System.out.println("I am a " + getTypePerson() +
                " my name is "+ getName());
    }
}
