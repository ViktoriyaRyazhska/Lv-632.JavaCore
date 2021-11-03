package lesson13.CW13.task1;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Comparator;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

import static java.time.temporal.TemporalAdjusters.firstInMonth;

public class AppCW13Task1 {
    public static void main(String[] args) {
        Random random = new Random();
        List<Integer> numbers = random.ints(1, 100)
                .limit(10).distinct().boxed().collect(Collectors.toList());

        numbers.forEach(System.out::println);
        System.out.println("Sorted: ");
        numbers.stream().sorted().forEach(s -> System.out.print(s + ", "));
        System.out.println();
        System.out.println("Max: " + numbers.stream().max(Comparator.comparing(Integer::intValue)).get());

        System.out.println(LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss")));
        System.out.println("Day of week: " + LocalDate.now().getDayOfWeek() + ", number: " + LocalDate.now().getDayOfMonth());
        System.out.println(LocalDateTime.now().with(firstInMonth(DayOfWeek.MONDAY)).format(DateTimeFormatter.ISO_LOCAL_DATE));
    }

    public static List<String> getSortedList(List<String> sortedList) {
        return sortedList.stream().sorted().collect(Collectors.toList());
    }
}