package Lesson7.ClassTasks;

public class Student extends Person {
    final String TYPE_PERSON = "Student";

    public Student() {
    }

    @Override
    void print() {
        System.out.println("I am a student");
    }
}
