package lesson8.HW8.task1;

public class Student extends Person{
    private int course;

    public Student(FullName fullName, int age, int course) {
        super(fullName, age);
        this.course = course;
    }

    public int getCourse() {
        return course;
    }

    public void setCourse(int course) {
        this.course = course;
    }

    @Override
    public String toString() {
        return "First name: " + getFullName().getFirstName() +
                ", Last name: " + getFullName().getLastName() +
                ", Age: " + getAge() +
                ", Course: " + getCourse();
    }

    @Override
    public String info() {
        return String.valueOf(this);
    }

    @Override
    public String activity() {
        return "I study at university";
    }
}