import java.util.*;

// Purpose: Demonstrates that LinkedHashSet maintains insertion order.
public class TestLinkedHashSet {
    // LinkedHashSet extends HashSet with a linked-list implementation that supports an  ordering 
    // of the elements in the set.
    public static void main(String[] args) {
        // Create a hash set.
        Set<String> set = new LinkedHashSet<>(); // A LinkedHashSet is created in line 6. 
        // As shown in the output, the strings are stored in the order in which they are inserted.

        // Add strings to the set.
        set.add("London");
        set.add("Paris");
        set.add("New York");
        set.add("San Francisco");
        set.add("Beijing");
        set.add("New York");
        // The elements in a HashSet are not ordered, but the elements in 
        // a LinkedHashSet can be retrieved in the order in which they were inserted into the set. 
        
        System.out.println(set); // Since LinkedHashSet is a set, it does not store duplicate elements.

        // Display the elements in the hash set.
        for (String element: set)
            System.out.print(element.toLowerCase() + " ");
    }

    // Key concepts:
        // HashSet = no guaranteed order
        // LinkedHashSet = maintains order you added elements (uses doubly-linked list)
        // Duplicate "New York" is ignored (sets don't allow duplicates)
}
