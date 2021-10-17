import java.util.HashSet;

public class MainAppl {
	
	public static void main(String[] args) {
	
	HashSet <String> namesOne = new HashSet<>();
	namesOne.add("Ivan");
	namesOne.add("Vasja");
	namesOne.add("Maria");
	namesOne.add("Anton");
	namesOne.add("Dasha");
	HashSet<String> namesTwo = new HashSet<>();
	namesTwo.add("Aleksandra");
	namesTwo.add("Aleksandr");
	namesTwo.add("Ivan");
	namesTwo.add("Anton");
	namesTwo.add("Antonina");
	
	
	System.out.println(union(namesOne,namesTwo));
	System.out.println(" ");
	System.out.println(intersect(namesOne,namesTwo));
	}
	//Adding 2 HashSets in 1.
	public static HashSet<String> union(HashSet<String> set1,HashSet<String> set2){
		
		@SuppressWarnings("unchecked")
		HashSet<String> unionOfTwo = (HashSet<String>)set1.clone();
		unionOfTwo.addAll(set2);
		return unionOfTwo;
	}
	
	
	//Adding 2 HashStets to see intersect.
	public static HashSet<String> intersect(HashSet<String> set1,HashSet<String> set2){
		@SuppressWarnings("unchecked")
		HashSet<String> intersectOfTwo = (HashSet<String>)set1.clone();
		intersectOfTwo.retainAll(set2);
		return intersectOfTwo;
	}
}
