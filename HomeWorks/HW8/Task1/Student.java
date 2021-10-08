package Task1;

public class Student extends Person {

    private int course;

    public Student(FullName fullName, int age, int course) {
        super(fullName, age);
        this.course=course;
    }

    @Override
    public String info() {
        return String.valueOf(this);
    }

    @Override
    public String activity() {
        return "I'm learning Java";
    }

    @Override
    public String toString() {
        return "First Name: "+ getFullName().getFirstName()
                +", Last name: "+ getFullName().getLastName()
                +", Age: "+ getAge()
                +" Course: "+ course;
    }
}

