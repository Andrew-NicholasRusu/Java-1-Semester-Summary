package April_2_2026;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

// products sorted by their stock count (ascending). 

public class TreeMap_3 {
    public static void main(String[] args) {
        // Data Structure: Start with a HashMap<String, Integer> containing the following data: 
            // "Laptop": 15 
            // "Mouse": 40 
            // "Keyboard": 25 
            // "Monitor": 15 
        Map <String, Integer> electronics = new HashMap<>();
        electronics.put("Laptop", 15);
        electronics.put("Mouse", 40);
        electronics.put("Keyboard", 25);
        electronics.put("Monitor", 15);
        // Logic: Create a TreeMap that uses a Comparator to sort the products based on their values (stock count). 
         Comparator<String> sizeComparator = (s1, s2) -> {
            int res = electronics.get(s1).compareTo(electronics.get(s2));
            return (res != 0) ? res : s1.compareTo(s2);
        };
        // The Catch: Notice that "Laptop" and "Monitor" both have a stock of 15. Ensure your code handles this 
        // so that both items appear in the final sorted map (alphabetically as a tie-breaker). 
        TreeMap<String, Integer> sortedElectronics = new TreeMap<>(sizeComparator);
        sortedElectronics.putAll(electronics);
        System.out.println(sortedElectronics);
    } 
}
