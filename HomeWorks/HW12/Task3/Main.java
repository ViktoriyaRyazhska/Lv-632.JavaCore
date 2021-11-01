package Task3;

public class Main{
    public static void main(String[] args) {

        SomeThread two;
        SomeThread three;

        SomeThread one = new SomeThread(0, "",
                   two = new SomeThread(3,"Thread number two",
                   three = new SomeThread(5,"Thread number three")));
    }
}





/*
Create a thread «one», which would start the thread «two», which has to output its number
(«Thread number two») 3 times and create thread «three», which would to output
message «Thread number three» 5 times.
 */
