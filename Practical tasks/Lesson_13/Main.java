/*
1 Print n random numbers on console using Java 8
2 Print n random numbers on console using Java 8 in a sorted order
3 Using Java 8 show the biggest number from n random numbers
4 Show which today is a day of a week
5 Show a date of first Monday for current month
6 Write a method for sorting list of Strings using Java 8

 */

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

import static java.time.temporal.TemporalAdjusters.firstInMonth;

public class Main {
    public static void main(String[] args) {

        Random random = new Random();                                                                                       //create new random object
        ArrayList<Integer> randomList = new ArrayList<>();                                                                  //create empty ArrayList
        random.ints(1, 11).limit(10).forEach(randomList::add);                         //run random and adding each element into ArrayList
        randomList.forEach(System.out::println);                                                                            //print ArrayList

        randomList.stream().sorted().forEach(System.out::println);                                                          //sorted and print ArrayList

        System.out.println("Max number: "+(randomList.stream().max(Comparator.comparing(Integer::intValue))).get()+"\n");           //print maximum number of ArrayList

        LocalDate currentDate = LocalDate.now();                                                                            //create new LocalDateTime
        System.out.println("Current day: "+currentDate.getDayOfWeek());                                                              //print current day

        System.out.println("First monday of this month: "+currentDate.with(firstInMonth(DayOfWeek.MONDAY)));
    }
    public static List<String> sortList (List<String> list){
        return list.stream().sorted().collect(Collectors.toList());
    }
}
