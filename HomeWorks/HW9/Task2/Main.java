package Task2;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        Map<String,String> personMap = new HashMap<>();
        personMap.put( "Dipol", "Orest");
        personMap.put( "Baggins", "Bilbo");
        personMap.put( "Zub", "Orest");
        personMap.put( "Grey", "Gandalf");
        personMap.put( "Oakenshield", "Orest");
        personMap.put("Isildorovich", "Aragorn");
        personMap.put("Brown", "Radagast");
        personMap.put("Tranduilovich","Legolas");
        personMap.put("Filarfinovna", "Galadriel");
        personMap.put( "Erendilovich", "Elrond");

        System.out.println(personMap.entrySet());
        Main.sameName(personMap);
        Main.removePerson(personMap, "Orest");

    }
        private static void sameName (Map<String, String> map){     //Method that found same values in Map, adding it in the new list and counting number of thees names;
            List<String> names = new ArrayList<>(map.values());
            List<String> doubleNames = new ArrayList<>();
            int count = 1;
            doubleNames.add("Empty");
            for (int i=1; i<names.size();i++) {
                if (names.get(i).equals(names.get(i - 1))) {
                    doubleNames.set(0, names.get(i));
                    doubleNames.add(names.get(i - 1));
                    count++;
                }
            }
                if(count>1){
                    System.out.println(count+" same names is found. The list oft thees names:");
                    for (String name: doubleNames) System.out.print(name+", ");
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
