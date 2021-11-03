package lesson9.HW9.task3.model;

public class Student {
    private String fistName;
    private int course;

    public Student(String fistName, int course) {
        this.fistName = fistName;
        this.course = course;
    }

    public String getFistName() {
        return fistName;
    }

    public void setFistName(String fistName) {
        this.fistName = fistName;
    }

    public int getCourse() {
        return course;
    }

    public void setCourse(int course) {
        this.course = course;
    }

    @Override
    public String toString() {
        return "Student{" +
                "fistName='" + fistName + '\'' +
                ", course=" + course +
                '}';
    }
}