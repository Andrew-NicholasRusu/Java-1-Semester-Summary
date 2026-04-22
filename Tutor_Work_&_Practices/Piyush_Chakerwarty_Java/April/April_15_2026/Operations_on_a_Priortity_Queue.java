import java.util.*;

public class Operations_on_a_Priortity_Queue {

    // Dividing using numerators and denominators:
    public static void divide (int num, int den) 
        throws ArithmeticException {
            if (den == 0) {
                throw new ArithmeticException("Cannot divide by zero"); // Print if denominator is 0
            }
            System.out.println("Result of division: " + num / den); // Calculation of numerator and division.
        }


    public static void main(String[] args) {
        
        // Create a max priority queue
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());

        // Insert elements into the priority queue
        pq.add(10);
        pq.add(30);

        System.out.println("Priority Queue elements (max-heap):");

        // Access elements and pop them one by one
        while (!pq.isEmpty()) {
            // Access the top (highest priority element)
            System.out.println("Top element: " + pq.peek());

            // Remove the top element
            pq.poll();

            // Print remaining size
            System.out.println("Remaining size: " + pq.size() + "\n");
        }

        // Check if empty
        if (pq.isEmpty()) {
            System.out.println("Priority Queue is now empty.");
        }

        // Create numerator and denominator
        int numerator = 20;
        int denominator = 5;

        try {
            divide (numerator, denominator);
        } catch (ArithmeticException e) {
            System.out.print("Error: " + e.getMessage());
        }
        finally {
            System.out.println();
        }
    }
}
