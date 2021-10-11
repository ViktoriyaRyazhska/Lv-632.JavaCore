package lesson9.CW9.task1;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

public class AppCW9Task1 {
    public static void main(String[] args) {
        Random random = new Random();
        List<Integer> myCollection = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            myCollection.add(random.nextInt(25));
        }
        System.out.println("Collection");
        myCollection.forEach(x -> System.out.print(x + ": "));

        List<Integer> newCollection = myCollection.stream().filter(x -> x > 5).collect(Collectors.toList());
        System.out.println();
        System.out.println("newCollection");
        newCollection.forEach(x -> System.out.print(x + ": "));

        List<Integer> newCollection2 = new ArrayList<>();
        for (int i = 0; i < myCollection.size() ; i++) {
            if (myCollection.get(i) > 5){
                    newCollection2.add(i);
                }
        }
        System.out.println();
        System.out.println("newCollection2");
        newCollection2.forEach(x -> System.out.print(x + ": "));

        for (int i = 0; i < myCollection.size(); i++) {
            if (myCollection.get(i) > 20) {
                myCollection.remove(i);
                i--;
            }
        }
        System.out.println();
        System.out.println("myCollection '> 20'");
        System.out.println();
        myCollection.forEach(x -> System.out.print(x + "| "));

        addAfterGetSize(2,1, myCollection);
        addAfterGetSize(8, -3, myCollection);
        addAfterGetSize(5, -4, myCollection);
        myCollection.sort(Comparator.comparing(Integer::intValue));
        System.out.println();
        for (int i = 0; i < myCollection.size(); i++) {
            System.out.println("position - " + i + ", value of element - " + myCollection.get(i));
        }
    }

    public static void addAfterGetSize(int index, int element, List<Integer> collect) {
        if (index < collect.size()) {
            collect.add(index, element);
        } else {
            System.out.println("Index out of size");
        }
    }
}