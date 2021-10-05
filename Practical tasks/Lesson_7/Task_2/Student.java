package Task_2;

public class Student extends Person {

    Student(String name){
        this.name=name;
    }

    public String getName (){
        return name;
    }

    @Override
    void print() {
        System.out.println("I am a Student. My name is " + getName());
    }
}
