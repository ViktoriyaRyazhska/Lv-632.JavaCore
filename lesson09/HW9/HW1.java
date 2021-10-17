package lesson09.HW9;

import java.util.Set;
import java.util.TreeSet;

public class HW1 {

	public static void main(String[] args) {
		Set<Integer> set1 = new TreeSet<Integer>();
		Set<Integer> set2 = new TreeSet<Integer>();
		set1.add(20);
		set1.add(24);
		set1.add(4);
		set1.add(2);
		set1.add(34);
		set2.add(20); // double
		set2.add(17);
		set2.add(34); // double
		set2.add(11);
		set2.add(19);

		Set<Integer> union = new TreeSet<Integer>(set1);
		union.addAll(set2);
		System.out.println(union);

		Set<Integer> intersect = new TreeSet<Integer>(set1);
		intersect.retainAll(set2);
		System.out.println(intersect);
	}

}
