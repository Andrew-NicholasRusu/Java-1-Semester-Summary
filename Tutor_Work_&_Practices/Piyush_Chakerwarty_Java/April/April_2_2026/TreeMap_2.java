package April_2_2026;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

// Write a program using TreeMap and Comparator to sort string keys by their length instead of alphabetically. 

public class TreeMap_2 {
    public static void main(String[] args) {
        Map <String, String> animals = new HashMap<>();
        animals.put("Elephant", "Large");
        animals.put("Crocodile","Huge");
        animals.put("Cat","Small");
        animals.put("Duck","Medium");
        Comparator<String> sizeComparator = (s1, s2) -> {
            int lengthCompare = Integer.compare(s1.length(), s2.length());
            return (lengthCompare != 0) ? lengthCompare: s1.compareTo(s2);
        };
        TreeMap<String, String> sortedAnimals = new TreeMap<>(sizeComparator);
        sortedAnimals.putAll(animals);
        System.out.println(sortedAnimals);
        
    }
}