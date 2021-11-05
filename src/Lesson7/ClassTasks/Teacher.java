package Lesson7.ClassTasks;

public class Teacher extends Staff {
    final String TYPE_PERSON = "Teacher";

    public Teacher(String name) {
    }

    @Override
    void print() {
        System.out.println("I am a teacher");

    }

    @Override
    int salary() {
        return 2000;
    }
}
