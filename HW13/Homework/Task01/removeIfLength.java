package lesson013c;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class removeIfLength {
	  public static void main(String[] args) {

			List<String> list1 = new ArrayList<>(
						Arrays.asList("Den", "Andriy1", "Igor", "Taras", "Dzhalal", "Andriy", "Kateryna"));

			List<String> list2 = list1.stream().filter(s -> s.length() < 5).collect(Collectors.toList());

			list2.forEach(System.out::println);
	  }

}