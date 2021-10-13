package Task1;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;


public class Main {

    public static void main(String[] args) {

        List<Integer> myCollection = Main.createList();
        Main.findNSave(myCollection);
        Main.removeElements(myCollection);
        Main.insertElements(myCollection);
        Main.sortNPrint(myCollection);

    }

    private static List<Integer> createList() {          //Method that creating List of random numbers
        Random random = new Random();
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            list.add(i, random.nextInt(30));
        }
        return list;
    }

    private static void findNSave (List<Integer> list) {            //Method that find and save to the new List all elements greater than 5 from given List
        List<Integer> newCollection = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) > 5) {
                newCollection.add(list.get(i));
                System.out.println
                        ("Element: " + list.get(i) + " | position: " + i);
            }
        }
    }

    private static List<Integer> removeElements (List<Integer> list){       //Method delete all elements greater than 20
        list.removeIf(element -> element > 20);                                 ////Also can use        while (iterator.hasNext()){
        return list;                                                            ////                      if(iterator.next()>20) iterator.remove();
    }                                                                           ////                    }


    private static List<Integer> insertElements (List<Integer> list) {       //Method that insert several elements
        int[] indexes = {2, 5, 8};
        int[] elements = {1, -4, -3};
        for (int i = 0; i < indexes.length; i++) {
            if (list.size() > indexes[i]) {
                list.add(indexes[i], elements[i]);
            }
        }
            for (int a = 0; a < list.size(); a++) {
                System.out.println("posistion " + a + ", vale of element: " + list.get(a));
            }
            return list;
        }


    private static List<Integer> sortNPrint (List<Integer> list) {          //Method that sort, print and return sorted List
           list.sort(Integer::compareTo);
           for (Integer number:list){
               System.out.print(number+", ");
        }
           return list;
    }
}





