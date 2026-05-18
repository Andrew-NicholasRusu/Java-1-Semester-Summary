package Collections;

import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.ListIterator;

public class Bidirectional_Iteration {
    public static void main(String[] args) {
        LinkedList<String> employeeList = new LinkedList<>();
        employeeList.addAll(Arrays.asList("David", "Sara", "Mike", "Emma"));

        // Forward iteration with ListIterator
        ListIterator<String> forwardIterator = employeeList.listIterator();
        System.out.println("Forward traversal:");
        while (forwardIterator.hasNext()) {
            System.out.println(" " + forwardIterator.next());
        }

        // Backward iteration (requires reaching the end first)
        System.out.println("\nBackward traversal:");
        while (forwardIterator.hasPrevious()) { // Reusing same iterator
            System.out.println(" " + forwardIterator.previous());
        }

        // Modifying while iterating
        ListIterator<String> modifier = employeeList.listIterator();
        while (modifier.hasNext()) {
            String name = modifier.next();
            if (name.equals("Mike")) {
                modifier.set("Micheal"); // Replaces Mike with Micheal
            }
            if (name.equals("Sara")) {
                modifier.add("Sarah"); // Adds Sarah after Sara's current position.
            }
        }
        System.out.println("\nAfter modifications: " + employeeList);
        // Output: [David, Sara, Sarah, Michael, Emma]);
    }
}
