public class Person {
    private String firstName;
    private String lastName;
    private int birthYear;

    public Person(){};

    public Person (String firstName, String lastName){
        this.firstName=firstName;
        this.lastName=lastName;
    }

    public void changeName(String fn, String ln){
        this.firstName=fn;
        this.lastName=ln;
    }
    public void input(String firstName, String lastName,int birthYear) {
        this.firstName=firstName;
        this.lastName = lastName;
        this.birthYear=birthYear;
    }

    public void output() {
        System.out.print("Name: "+firstName+" "+lastName+" "+birthYear);
    }

    public void setBirthYear(int birthYear) {
        this.birthYear = birthYear;
    }

    public int getAge(){
        int age = 2021-birthYear;
        return age;
    }
}
