package lesson9.CW9.task1;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

public class App9Task1 {
    public static void main(String[] args) {
        Random random = new Random();
        List<Integer> myCollection = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            myCollection.add(random.nextInt(25));
        }
        myCollection.forEach(x -> System.out.print(x + ": "));
        List<Integer> newCollection = myCollection.stream().filter(x -> x > 5).collect(Collectors.toList());
        System.out.println();
        newCollection.forEach(x -> System.out.print(x + "| "));

        for (int i = 0; i < myCollection.size(); i++) {
            if (myCollection.get(i) > 20) {
                myCollection.remove(i);
            }
        }
        System.out.println();
        myCollection.forEach(x -> System.out.print(x + ": "));

        myCollection.add(2, 1);
        myCollection.add(8, -3);
        myCollection.add(5, -4);
        myCollection.sort(Comparator.comparingInt(Integer::intValue));
        System.out.println();
        for (int i=0; i< myCollection.size(); i++) {
            System.out.println("position - " + i + ", value of element - " + myCollection.get(i));
        }
    }
}
