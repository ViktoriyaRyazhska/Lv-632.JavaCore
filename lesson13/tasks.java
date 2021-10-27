package lesson13;

import java.time.DayOfWeek;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.TemporalAdjusters;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.Random;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class tasks {

	public static void main(String[] args) {

		Random r1 = new Random();
		Random r2 = new Random();
		Random r3 = new Random();
		r1.ints(9, 1, 1000).forEach(System.out::println);
		System.out.println("-------------------");
		r2.ints(9, -1000, 1000).sorted().forEach(System.out::println);

		List<Integer> numbers = new ArrayList<>(r3.ints(9, -1000, 1000).boxed().collect(Collectors.toList()));
		IntSummaryStatistics stats = numbers.stream().mapToInt((x) -> x).summaryStatistics();
		System.out.println("max " + stats.getMax());

		LocalDateTime a = LocalDateTime.now();
		System.out.println(a.format(DateTimeFormatter.ofPattern("yyyy-mm-dd HH:MM:ss")));
		LocalDateTime t = a.with(TemporalAdjusters.dayOfWeekInMonth(1, DayOfWeek.MONDAY));
		System.out.println(t.format(DateTimeFormatter.ofPattern("yyyy-mm-dd HH:MM:ss")));

		List<String> names = Arrays.asList("apple", "banana", "cherry", "pineapple", "pear", "melon", "orange",
				"watermelon");
		Collections.sort(names, tasks::compareName); 
		System.out.println(names);

	}

	public static int compareName(String a, String b) {
		return a.compareTo(b);
	}
}