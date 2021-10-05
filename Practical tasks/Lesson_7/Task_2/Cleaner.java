package Task_2;

public class Cleaner extends Staff {

    public static final String TYPE_PERSON = "Cleaner";

    Cleaner(String name){           //Constructor
        this.name=name;
    }

    public String getName (){       //Getter
        return name;
    }

    @Override                       //Method return salary for this type of Staff
    public int salary() {
        return 700;
    }

    @Override
    void print() {
        super.print();
        System.out.println(TYPE_PERSON+ ". My name is "+ getName());
    }
}
