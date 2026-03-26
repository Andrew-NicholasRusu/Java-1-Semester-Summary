// You are developing a feature for a video streaming app. Users can add videos to a "Watch Later" list. However, if they find a 
// "Breaking News" or "Live" video, they want it to jump to the very top of the list immediately. Conversely, if their list gets 
// too long, the oldest video added (at the bottom) should be removed to make space. 

import java.util.LinkedList;

public class Collection_5 {
    public static void main(String[] args) {
    // Task: 
        // Initialize: Create a LinkedList of Strings called watchLater. 
        LinkedList<String> watchLater = new LinkedList<>();

        // Add Initial Content: Add "Java Basics", "Data Structures 101", and "Algorithm Design" to the list in that order.
        watchLater.add("Java Basics");
        watchLater.add("Data Structures 101");
        watchLater.add("Algorithm Design");

        // Prioritize: A new video titled "LIVE: System Architecture" needs to be moved to the very front of the list. 
        watchLater.addFirst("LIVE: System Architecture");

        // Inspect: Print the video that is currently at the head of the list (first one) and the video at the tail. (end)
        System.out.println("Current Head: "+ watchLater.getFirst());
        System.out.println("Current Tail: "+ watchLater.getLast());

        // Manage Capacity: The user's list is full. Remove the oldest video from the list. 
        watchLater.removeLast();
        System.out.println("Final List Size: " + watchLater.size());


        // Final Audit: Print the final size of the list and all remaining videos 
        var it = watchLater.listIterator(); // gets the entire list
        while (it.hasNext()) { // forms a loop until it reachs the last index
            System.out.print(it.next() + " -> "); // Prints every index of the linkedlist until the last one. 
        }
    }
}
