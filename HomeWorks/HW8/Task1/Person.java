package Task1;

public abstract class Person {

    private FullName fullName;
    private int age;

    public FullName getFullName() {
        return fullName;
    }
    public void setFullName(FullName fullName) {
        this.fullName = fullName;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }

    public Person (FullName fullName, int age){
        this.fullName=fullName;
        this.age=age;
    }

    public abstract String info ();

    public abstract String activity ();

}

