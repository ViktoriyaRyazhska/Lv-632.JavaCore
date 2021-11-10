package lesson013b;


import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Optional;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.IntStream;


public class ApplUsingJava8Part1 {

	  public static void main(String[] args) {

//			Random random = new Random();
//			ArrayList<Integer> listRandomNumb = new ArrayList<>();
//			random.ints(0, 100).limit(10).forEach(listRandomNumb::add);
//			listRandomNumb.stream().sorted().forEach(System.out::println);
//			Optional<Integer> max = listRandomNumb.stream().max(Comparator.naturalOrder());
//			System.out.println("Biggest number: " + max);

			System.out.println("Biggest number: " + biggestNumber(generateRandomList()));

	  }

	  public static List<Integer> generateRandomList() {
			int size = 10;
			int minValue = 0;
			int maxValue = 100;
			return IntStream.generate(() -> minValue + new Random()
						.nextInt(maxValue - minValue))
						.limit(size).boxed()
						.collect(Collectors.toList());
	  }

	  public static int biggestNumber(List<Integer> generateRandomList) {
			return generateRandomList.stream()
						.mapToInt(v -> v).max()
						.orElseThrow(NoSuchElementException::new);
	  }

}
