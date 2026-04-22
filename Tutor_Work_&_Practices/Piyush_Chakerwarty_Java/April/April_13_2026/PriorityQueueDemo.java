import java.util.*;

// Purpose: Shows PriorityQueue orders elements (not FIFO like regular queue).
public class PriorityQueueDemo {
    public static void main(String[] args) {
        PriorityQueue<String> queue2 = new PriorityQueue<>();
        queue2.offer("Oklahoma");
        queue2.offer("Indiana");
        queue2.offer("Georgia");
        queue2.offer("Texas");

        System.out.println("Priority queue using Comparable:");
        while (queue2.size() > 0) {
            System.out.println(queue2.remove() + " ");
            // Key behavior: remove() always returns smallest element first (min-heap).
        }

        PriorityQueue<String> queue3 = new PriorityQueue<>(
            Collections.reverseOrder());
        queue3.offer("Oklahoma");
        queue3.offer("Indiana");
        queue3.offer("Georgia");
        queue3.offer("Texas");

        System.out.println("\nPriority queue using Comparator:");
        while (queue3.size() > 0) {
            System.out.println(queue3.remove() + " ");
        }
    }
}
