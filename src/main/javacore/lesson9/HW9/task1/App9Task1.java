package lesson9.HW9.task1;

import java.util.Set;
import java.util.TreeSet;

public class App9Task1 {
    public static void main(String[] args) {
        Set s1 = new TreeSet();
        Set s2 = new TreeSet();
        s1.add(1);
        s1.add(3);
        s1.add(4);
        s2.add(4);
        s2.add(5);
        s2.add(2);
        s2.add(41);

        Set resultUnion = union(s1, s2);
        resultUnion.forEach(x -> System.out.println(x));

        Set resultIntersect = intersect(s1, s2);
        resultIntersect.forEach(x -> System.out.println(x));
    }

    public static Set union(Set s1, Set s2) {
        s1.addAll(s2);
        return s1;
    }

    public static Set intersect(Set s1, Set s2) {
         s1.retainAll(s2);
        return s1;
    }
}