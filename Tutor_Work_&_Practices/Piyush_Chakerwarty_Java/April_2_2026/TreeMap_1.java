package April_2_2026;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap; 

public class TreeMap_1 {

    public static void main(String[] args) {
        TreeMap<Integer, String> map = new TreeMap<>();

        map.put(3, "Three");
        map.put(1, "One");
        map.put(2, "Two");
        System.out.println(map); // Prints in key order
        System.out.println("This prints via the order of the key.");
        System.out.println(); // Space

        Map<String, Integer> map2 = new HashMap<>(); 
        
        map2.put("Mango", 1);
        map2.put("Zebra", 20);
        map2.put("Apple", 10);

        System.out.println(map2); // Prints in
        System.out.println("This Prints by alphabetically.");
        System.out.println(); // Space

        // Comparator
        Comparator<String> valueComparator = (s1, s2) -> {
            int res = map2.get(s1).compareTo(map2.get(s2));
            return (res != 0) ? res : s1.compareTo(s2);
        };

        TreeMap<String, Integer> sortedMap = new TreeMap<>(valueComparator);
        sortedMap.putAll(map2);
        System.out.println(sortedMap); // prints the sorted TreeMap
        System.out.println("This prints after sorting it with the comparator.");
    }
}
