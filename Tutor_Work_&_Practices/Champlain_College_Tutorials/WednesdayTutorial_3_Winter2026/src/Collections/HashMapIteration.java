package Collections;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class HashMapIteration {
    public static void main(String[] args) {
        HashMap<String, Integer> employeeSalary = new HashMap<>();
        employeeSalary.put("Nick", 4500);
        employeeSalary.put("Silvia", 7500);
        employeeSalary.put("Ludovic", 3000);
        employeeSalary.put("Patricia", 6500);
        employeeSalary.put("Darius", 6100);
        employeeSalary.put("Patrick", 5500);

        /**
         * Ways to iterate in collections (HashMap Edition)
         */

        // Method 1: Iterator through entrySet (most efficient)
        System.out.println("Method 1: EntrySet iterator");
        Iterator<Map.Entry<String, Integer>> entryIterator = employeeSalary.entrySet().iterator();
        while (entryIterator.hasNext()) {
            Map.Entry<String, Integer> entry = entryIterator.next();
            System.out.println(" " + entry.getKey() + " earns $" + entry.getValue());
        }

        // Method 2: Iterate through keySet
        System.out.println("\nMethod 2: KeySet iterator");
        Iterator<String> keyIterator = employeeSalary.keySet().iterator();
        while (keyIterator.hasNext()) {
            String name = keyIterator.next();
            System.out.println(" " + name + " earns $" + employeeSalary.get(name));
        }

        // Method 3: Iterate through values only
        System.out.println("\nMethod 3: Values iterator");
        Iterator<Integer> valueIterator = employeeSalary.values().iterator();
        while (valueIterator.hasNext()) {
            System.out.println(" Salary: $" + valueIterator.next());
        }

        // Method 4: Remove entries while iterating (salaries below 5000)
        Iterator<Map.Entry<String, Integer>> removalIterator = employeeSalary.entrySet().iterator();
        while (removalIterator.hasNext()) {
            Map.Entry<String, Integer> entry = removalIterator.next();
            if (entry.getValue() < 5000) {
                System.out.println(" Removing: " + entry.getKey());
                removalIterator.remove(); // Safe removal
            }
        }
        System.out.println("\nAfter removing low salaries: " + employeeSalary);
    }
}
