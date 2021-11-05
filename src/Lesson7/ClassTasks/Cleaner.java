package Lesson7.ClassTasks;

public class Cleaner extends Staff {
    final String TYPE_PERSON = "Cleaner";

    public Cleaner() {
    }

    @Override
    void print() {
        System.out.println("I am a cleaner");

    }

    @Override
    int salary() {
        return 1000;
    }
}
