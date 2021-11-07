package HomeWork9;
import java.util.HashSet;
import java.util.Set;

public class firstHW9 {

	public static void main(String[] args) {
	   
		Set <String> set1 = new HashSet <String> (); //create set1 & set2
		set1.add("Nina");
		set1.add("Vera");
		set1.add("Tanija");
		set1.add("Sveta");
		Set <String> set2 = new HashSet <String> ();
		set2.add("Sveta");
		set2.add("Tur");
		set2.add("Anohina");
		set2.add("Aleksandrov");
		set2.add("Telepun");
		System.out.println(""+ set1 +""+ set2);	//print the element of both sets
		
//		Write parameterized methods union(Set set1, Set set2) and intersect(Set set1, Set set2)
//		realizing the operations of union and intersection of two sets. 
//		Test the operation of these techniques on two pre-filled sets. 	
		
		Set <String> union = new HashSet<String>(set1);
		union.addAll(set2);
		System.out.println(union);	//

		Set<String> intersect = new HashSet<String>(set1);
		intersect.retainAll(set2);
		System.out.println(intersect);
 	}
}