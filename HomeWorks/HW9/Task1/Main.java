package Task1;

import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {

        Set<Integer> set1 = Main.createSet(1, 10);
        Set<Integer> set2 = Main.createSet(5, 15);

        Set<Integer> union = new HashSet(set1);             //Union sets
        union.addAll(set2);
        for (Integer numb : union) {
            System.out.print(numb+", ");
        }

        System.out.println("\n");

        Set<Integer> intersect = new HashSet<>(set1);       //Intersect sets
        intersect.retainAll(set2);
        for(Integer numb: intersect){
            System.out.print(numb+", ");
        }
    }

    private static Set<Integer> createSet (int begin, int end){     //Method that create new HashSet
        Set<Integer> newSet = new HashSet<>();
        for (int i=begin; i<=end; i++) newSet.add(i);
        return newSet;
    }

}
