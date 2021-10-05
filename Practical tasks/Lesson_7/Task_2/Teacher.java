package Task_2;

public class Teacher extends Staff {

    public static final String TYPE_PERSON = "Teacher";

    Teacher(String name){           //Constructor
        this.name=name;
    }

    public String getName (){       //Getter
        return name;
    }

    @Override                       //Method return salary for this type of Staff
    public int salary() {
        return 1800;
    }

    @Override
    void print() {
        System.out.println(TYPE_PERSON+ ". My name is "+ getName());
    }
}
