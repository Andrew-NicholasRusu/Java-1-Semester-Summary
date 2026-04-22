import java.util.*;

public class OfficeEnvironmentTreeMap {
    public static void main(String[] args) {
        
        TreeMap<String, Integer> officeTreeMap = new TreeMap<>(); // officeTreeMap = name of the TreeMap
        // Use TreeMap to sort key-value pairs (navigation required)
        // Time Complexity:
            // O(log n) for most operations

        System.out.println("Let's create a TreeMap to store employee names and their ages in the office environment!");
        officeTreeMap.put("Alice", 30); // put() adds a key-value pair to the TreeMap
        officeTreeMap.put("Bob", 25);
        officeTreeMap.put("Charlie", 35);
        officeTreeMap.put("David", 28);
        officeTreeMap.put("Eve", 32);
        officeTreeMap.put("Frank", 27);
        officeTreeMap.put("Grace", 29);
        officeTreeMap.put("Heidi", 31);

        System.out.println("List of employees:" + officeTreeMap + "\nSize of office group: " + officeTreeMap.size());
        System.out.println("It's the weekend. Everybody has 2 days off! Let's save it to another tree map.");

        // Making a new TreeMap with a comparator
        TreeMap<String, Integer> officeTreeMapWeek2 = new TreeMap<>(Comparator.reverseOrder()); // Constructor with a comparator for the TreeMap. This will sort the keys in reverse order (descending order).
        officeTreeMap.putAll(officeTreeMapWeek2);

        System.out.println("Let's clear the old TreeMap:");
        officeTreeMap.clear();
        System.out.println("Is it empty? " + officeTreeMap.isEmpty());
        
        System.out.println("Let's check the new TreeMap with the comparator:");
        officeTreeMapWeek2.put("Alice", 30); 
        officeTreeMapWeek2.put("Bob", 25);
        officeTreeMapWeek2.put("Charlie", 35);
        officeTreeMapWeek2.put("David", 28);
        officeTreeMapWeek2.put("Eve", 32);
        officeTreeMapWeek2.put("Frank", 27);
        officeTreeMapWeek2.put("Grace", 29);
        officeTreeMapWeek2.put("Heidi", 31);

        System.out.println("Welcome Back: " + officeTreeMapWeek2); // {Heidi=31, Grace=29, Frank=27, Eve=32, David=28, Charlie=35, Bob=25, Alice=30}

        // Navigation Methods for Tree Map
        System.out.println("The first employee is: " + officeTreeMapWeek2.firstKey()); // gets the first key (employee) of the tree map
        System.out.println("The last employee is: " + officeTreeMapWeek2.lastKey()); // gets the last key (employee) of the tree map
        System.out.println("The employee just before David is: " + officeTreeMapWeek2.lowerKey("David")); // Greatest key < given key
        // lowerKey() returns the greatest key strictly less than the given key, or null if there is no such key.
        System.out.println("The employee just after David is: " + officeTreeMapWeek2.higherKey("David")); // Least key > given key
        // higherKey() returns the least key strictly greater than the given key, or null if there is no such key.
        System.out.println("The employee just before or equal to David is: " + officeTreeMapWeek2.floorKey("David")); // Greatest key <= given key
        // floorKey() returns the greatest key less than or equal to the given key, or null if there is no such key.
        System.out.println("The employee just after or equal to David is: " + officeTreeMapWeek2.ceilingKey("David")); // Least key >= given key
        // ceilingKey() returns the least key greater than or equal to the given key, or null if there is no such key.
        System.out.println("Heidi just finished her shift: " + officeTreeMapWeek2.pollFirstEntry()); // Remove and return first entry
        System.out.println("Alice also finished her shift: " + officeTreeMapWeek2.pollLastEntry()); // Remove and return last entry
        System.out.println("Current workers right now:" + officeTreeMapWeek2); // Notice how we remove Alice and Heidi from the list / size
        System.out.println("The size right now is " + officeTreeMapWeek2.size()); // 6


        // TreeMap from another map
        TreeMap<String, Integer> officeTreeMapWeek3 = new TreeMap<>(officeTreeMap); 
        officeTreeMap.putAll(officeTreeMapWeek3);
        System.out.println(officeTreeMapWeek3);

        // Submap operations
        // officeTreeMapWeek2.headMap(toKey); // Keys < toKey
        // officeTreeMapWeek2.tailMap(fromKey); // Keys >= fromKey
        // officeTreeMapWeek2.subMap(fromKey, toKey); // Keys in range (fromKey, toKey)


        
    }
}
