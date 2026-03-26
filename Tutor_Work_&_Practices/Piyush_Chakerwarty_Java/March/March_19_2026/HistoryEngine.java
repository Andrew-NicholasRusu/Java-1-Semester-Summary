// In a text editor, every action a user takes (typing, deleting, formatting) needs to be recorded so it can be undone. 
// Because users frequently add new actions to the end of the history and remove the most recent one to "undo," a LinkedList is more 
// efficient than an ArrayList for these frequent modifications. 

// Your Task: Create a class called HistoryEngine that uses a java.util.LinkedList<String> to manage user actions. 
// Implement the following logic: 

// recordAction(String action): Adds a new action to the end of the history. 
// undo(): Removes and returns the most recent action from the history. 
// emergencyFix(String action): Sometimes a system-level "Auto-Save" or "Recovery" action must be injected at the very beginning of the history. 
// getHistoryCount(): Returns the total number of actions currently stored. 
import java.util.LinkedList;
import java.util.List;
import java.util.ArrayList;

public class HistoryEngine {
    public static void main(String[] args) {
        // Constraints & Performance Goals 
        // Structure: You must use LinkedList because it supports O(1) operations at both the head and tail. 
        // Methods: Utilize specialized Deque methods like addFirst(), addLast(), and removeLast() . 
        // Types: The list should only store non-primitive String objects. 
        LinkedList<String> history = new LinkedList<>();

        public void recordAction(String action) {
            // Implement using LinkedList tail addition
            System.out.println("Current Tail: "+ history.getLast());
        }

        public String undo() {
            // Implement using LinkedList tail removal
            if (history.isEmpty()) {
                return "No actions to undo.";
            }
            return history.removeLast();
        }

        public void emergencyFix(String action) {
            // Implement using LinkedList head addition
            history.addFirst(action);
        }

        public int getHistoryCount() {
            return history.size();
        }

        public void printAudit() {
            System.out.println("Remaining Actions in Orders:");

            int index = 0;
            for (String action: history) {
                System.out.println(index + " - " + action);
                index ++;
            }
        }
    }
}
