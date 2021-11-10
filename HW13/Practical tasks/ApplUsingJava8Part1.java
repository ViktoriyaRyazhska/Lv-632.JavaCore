package lesson013b;

import java.util.Arrays;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class ApplUsingJava8Part1 {

	  public static void main(String[] args) {

			System.out.println("Biggest number: " + biggestInteger(listOfRandomIntegers()));

			List<String> listNames = Arrays.asList("Denis", "Igor", "Taras", "Andriy", "Dzhalal");
			System.out.println(sortListStr(listNames));

	  }

	  public static List<Integer> listOfRandomIntegers() {
			int size = 10;
			int minValue = 0;
			int maxValue = 100;
			return IntStream.generate(() -> minValue + new Random().nextInt(maxValue - minValue))
						.limit(size)
						.boxed()
						.sorted()
						.collect(Collectors.toList());
	  }

	  public static int biggestInteger(List<Integer> listOfRandomIntegers) {
			return listOfRandomIntegers.stream()
						.mapToInt(v -> v)
						.max()
						.orElseThrow(NoSuchElementException::new);
	  }

	  public static List<String> sortListStr(List<String> listNames) {
			return listNames.stream()
						.sorted()
						.collect(Collectors.toList());
	  }

}
