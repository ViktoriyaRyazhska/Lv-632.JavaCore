
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class MainPerson {
	public static void main(String[] args) {
		Map<String, String> personMap = new HashMap<>();
		personMap.put("Ivanov", "Orest");
		personMap.put("Petrov", "Ivan");
		personMap.put("Lobanov", "Orest");
		personMap.put("Bubnov", "Vasja");
		personMap.put("Pupkin", "Sasha");
		personMap.put("Divanov", "Evgen");
		personMap.put("Dmitrov", "Oleksij");

		String nameToDelete = "Orest";
		@SuppressWarnings("unused")
		int duplicateOfNames = 0;
		// PersonMap in console.
		for (Map.Entry<String, String> entry : personMap.entrySet()) {
			String key = entry.getKey();
			String val = entry.getValue();
			System.out.println(key + " " + val);
		}

		//deleting object with same name.
		if(personMap.containsValue(nameToDelete)) {
			
				@SuppressWarnings("rawtypes")
				Iterator iter = personMap.entrySet().iterator();
				while (iter.hasNext()) {
					@SuppressWarnings("rawtypes")
					Map.Entry entry = (Map.Entry)iter.next();
					if (entry.getValue() == nameToDelete) {
						iter.remove();
					}
				
			}
		}
		System.out.println(personMap.entrySet());
	}
}
