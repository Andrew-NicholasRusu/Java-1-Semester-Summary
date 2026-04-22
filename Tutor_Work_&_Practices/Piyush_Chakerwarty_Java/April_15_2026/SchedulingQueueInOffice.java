import java.util.*;

public class SchedulingQueueInOffice {
    public static void main(String[] args) {
        
        Queue<String> schedulingQueue = new LinkedList<>(); // schedulingQueue = name of the Queue
        System.out.println("Let's manage our scheduling queue in the office!");
        // Use Queue for FIFO (First In First Out) operations
        // Queue Time Complexities:
            // O(1) for offer/poll/peek (most implementations)

        // Operations for Queue
        schedulingQueue.offer("Meeting with Marketing Team at 10 AM");
        schedulingQueue.offer("Client Call at 11 AM");
        schedulingQueue.offer("Project Update Meeting at 2 PM");
        schedulingQueue.offer("Team Lunch at 12 PM");
        schedulingQueue.offer("Performance Review at 3 PM"); // offer() adds an item to the end of the queue
        // offer() is used in Queue interface to add elements, it returns true if the element was added successfully, and false if the queue is full (in case of bounded queues)

        System.out.println("Current scheduling queue: " + schedulingQueue);
        System.out.println(); // Space for better readability

        System.out.println("The first task in the scheduling queue is: " + schedulingQueue.element()); 
        // Since 'Meeting with Marketing Team at 10 AM' is the first task added, it will return that

        System.out.println("There are a total of " + schedulingQueue.size() + " tasks in the scheduling queue."); // size() returns the number of items in the queue
        System.out.println(); // Space for better readability

        System.out.println("We have just finished the 'Meeting with Marketing Team at 10 AM'. Let's remove it from the queue:");
        schedulingQueue.remove(); // remove() removes and returns the head of the queue
        System.out.println(); // Space for better readability

        System.out.println("Current scheduling queue after removing the first task: " + schedulingQueue); 
        // After removing, the first task added (Meeting with Marketing Team at 10 AM) is removed
        System.out.println(); // Space for better readability

        System.out.println("Is there a 'Client Call at 11 AM' in the queue? " + schedulingQueue.contains("Client Call at 11 AM"));
        // contains() checks if a specific item is in the queue and returns true or false
        System.out.println(); // Space for better readability

        System.out.println("Let's process the next task in the queue:");
        schedulingQueue.poll(); // poll() removes and returns the head of the queue
        System.out.println("Current scheduling queue after processing one task: " + schedulingQueue); 
        // After polling, the next task (Client Call at 11 AM) is removed
        System.out.println(); // Space for better readability

        System.out.println("Let's peek at the next task in the queue:");
        System.out.println("The next task is: " + schedulingQueue.peek()); // peek() returns the head of the queue without removing it
        System.out.println(); // Space for better readability

        schedulingQueue.clear(); // clear() removes all items from the queue
        System.out.println("I decided to clear the schedule. Current scheduling queue: " + schedulingQueue); // After clearing, the queue will be empty

        System.out.println("I just want to make sure it is empty to make sure I can add new tasks without any isseus: " + schedulingQueue.isEmpty()); 
        // isEmpty() checks if the queue is empty and returns true or false
        System.out.println("Alright! Good for the day!");

        /** Deque Example */
        Queue<String> taskDeque = new ArrayDeque<>(); 


    }

}
