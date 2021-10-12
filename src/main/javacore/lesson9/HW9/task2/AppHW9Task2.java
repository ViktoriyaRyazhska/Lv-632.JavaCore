package lesson9.HW9.task2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class AppHW9Task2 {
    public static void main(String[] args) throws IOException {
        Map<String, String> personMap = new HashMap<>();
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        personMap.put("Sh", "Den");
        personMap.put("Shl", "Max");
        personMap.put("Shd", "Andry");
        personMap.put("Shk", "Sofy");
        personMap.put("Shm", "Kris");
        personMap.put("Shn", "Alex");
        personMap.put("Shh", "Nata");
        personMap.put("Shq", "Mark");
        personMap.put("Shlm", "Makar");
        personMap.put("Shy", "Viktory");
        System.out.println(personMap.entrySet());
        /**  */
        for (Map.Entry<String, String> entry : personMap.entrySet()) {
            System.out.println(entry.getValue());

            }
        /** */
        System.out.println("Enter first name: ");
        String name = bufferedReader.readLine();
        Iterator<String> iterator = personMap.values().iterator();
        if (personMap.containsValue(name)) {
            while (iterator.hasNext()) {
                if (iterator.next().equals(name)) {
                    iterator.remove();
                }
            }
        } else{
            System.out.println("NOt found 'Name'!");
        }
        System.out.println(personMap.entrySet());
    }
}