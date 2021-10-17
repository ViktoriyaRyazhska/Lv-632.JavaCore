package Task2;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        Map<String,String> personMap = new HashMap<>();
        personMap.put( "Dipol", "Orest");
        personMap.put( "Baggins", "Bilbo");
        personMap.put( "Zub", "Orest");
        personMap.put( "Grey", "Gandalf");
        personMap.put( "Oakenshield", "Torin");
        personMap.put("Isildorovich", "Aragorn");
        personMap.put("Brown", "Radagast");
        personMap.put("Tranduilovich","Legolas");
        personMap.put("Filarfinovna", "Galadriel");
        personMap.put( "Tuk", "Bilbo");

        System.out.println(personMap.entrySet());
        Main.sameName(personMap);
        Main.removePerson(personMap, "Orest");

    }

        private static void sameName (Map < String, String > map) {                 //Method that found duplicate values in Map
        Set <String> filter = new HashSet<>();                                      //Step 1 - finding duplicates
        Set <String> duplicates = new HashSet<>();
        for(Map.Entry<String, String> person:map.entrySet()) {
            if (!filter.add(person.getValue()))
                duplicates.add(person.getValue());
        }
            for(String name:duplicates){                                            //Step 2- printing all duplicates from Map
                for (Map.Entry <String, String> person: map.entrySet()){
                if (person.getValue().equals(name))
                    System.out.println(person);
            }
        }
    }


        private static void removePerson (Map<String, String> map, String name) {       //Method removing all elements with some value
            Map<String, String> map2 = new HashMap<>(map);
            for(Map.Entry<String,String> names:map2.entrySet()){
                if (names.getValue().equals(name))
                map.remove(names.getKey());
                else System.out.println(names);
            }
    }
}
