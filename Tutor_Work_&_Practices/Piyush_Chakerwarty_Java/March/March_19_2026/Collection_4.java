// Task Scheduler 

    // Scenario: 
    // You are designing a high-frequency Task Scheduler for a server. The system needs to: 
    // Constantly add new tasks to the very front of the processing line as they arrive. 
    // Remove tasks from the end once they are completed. 
    // Occasionally "clear" the oldest tasks if the system is overloaded. 

import java.util.LinkedList;

public class Collection_4 {
    public static void main(String[] args) {

    // Create a program that chooses the best list implementation based on the criteria above. 
    LinkedList<String> taskSchedule = new LinkedList<>();

    // Add five tasks: "Task A", "Task B", "Task C", "Task D", "Task E". 
        taskSchedule.add("Task A");
        taskSchedule.add("Task B");
        taskSchedule.add("Task C");
        taskSchedule.add("Task D");
        taskSchedule.add("Task E");

    // Use specialized methods (like addFirst or removeLast) that are unique to your chosen implementation. 
        taskSchedule.addFirst("Task F");
        System.out.println("Newest task: " + taskSchedule.add("Task F"));

        taskSchedule.removeLast();
        System.out.println("Completed Task: " + taskSchedule.removeLast());


    // Print the final state of the task list. 
    System.out.println("Final Conclusions:");
    var it = taskSchedule.listIterator();
    while(it.hasNext()) {
        System.out.println(it.next() + " -> ");
        }
    }

}
