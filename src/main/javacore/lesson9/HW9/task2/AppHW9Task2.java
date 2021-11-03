package lesson9.HW9.task2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class AppHW9Task2 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        Map<String, String> personMap = new HashMap<>();

        getPersonMap(personMap);

        getDuplicates(personMap);

        removePersonByName(personMap, bufferedReader);
    }

    private static Map getPersonMap(Map<String, String> personMap) {
        personMap.put("Sh", "Den");
        personMap.put("Shl", "Max");
        personMap.put("Shd", "Andry");
        personMap.put("Shk", "Sofy");
        personMap.put("Shm", "Kris");
        personMap.put("Shn", "Alex");
        personMap.put("Shh", "Nata");
        personMap.put("Shq", "Mark");
        personMap.put("Shlm", "Mark");
        personMap.put("Shy", "Viktory");
        System.out.println(personMap.entrySet());
        return personMap;
    }

    private static void removePersonByName(Map<String, String> personMap, BufferedReader bufferedReader) throws IOException {
        System.out.println("Enter first name: ");
        String name = bufferedReader.readLine();
        Iterator<String> iterator = personMap.values().iterator();
        if (personMap.containsValue(name)) {
            while (iterator.hasNext()) {
                if (iterator.next().equals(name)) {
                    iterator.remove();
                }
            }
        } else {
            System.out.println("NOt found 'Name'!");
        }
        System.out.println(personMap.entrySet());
    }

    private static void getDuplicates(Map<String, String> personMap) {
        TreeSet<String> persons = new TreeSet<>();
        persons.addAll(personMap.values());
        Set<String> duplicates = new HashSet<>();
        Set<String> tracking = new HashSet<>();
        for (String person : persons) {
            if (!tracking.add(person)) {
                duplicates.add(person);
                System.out.println("Person: " + person);
            }
        }
        duplicates.forEach(x -> System.out.println("Duplicates: " + x));
    }
}