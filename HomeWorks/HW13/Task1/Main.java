package Task1;/*      1. There is a list of strings list1. Create a new list list2 that has items from list1
           and length less than 5 characters (use method removeIf)
*/

import java.util.ArrayList;
import java.util.Arrays;
import java.util.function.Predicate;

public class Main {
    public static void main(String[] args) {

        Predicate<String> remove = text -> text.length() > 5;

        ArrayList<String> list1 = new ArrayList<>(Arrays.asList("Taras", "learn", "Java", "since", "september"));
        ArrayList<String> list2 = new ArrayList<>(list1);
        list2.removeIf(remove);
    }
}
