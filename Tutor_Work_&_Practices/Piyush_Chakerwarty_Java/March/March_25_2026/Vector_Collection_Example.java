import java.util.Stack;
import java.util.Vector;


public class Vector_Collection_Example {
    public static void main(String[] args) {

    // Stack: LIFO - Last In First Out
    Stack<Integer> numberStack = new Stack<>();
        
    System.out.println("Pushing numbers to the stack...");
    numberStack.push(10);
    numberStack.push(20);
    numberStack.push(30);
    numberStack.push(40);
    numberStack.push(50);

    System.out.println("Element on stack top: " + numberStack.peek());

    int position = numberStack.search(30);
    System.out.println("Element 30 is present at position: " + position);

    System.out.println("\n ---- Pop Operation ---- ");
    while(!numberStack.empty()) {
        System.out.println("Removed: " + numberStack.pop());
    }

    // Creating and Using a Vector:
        Vector<String> servers = new Vector<>();
        servers.add("Alpha");
        servers.addElement("Beta");
        System.out.println("Server is running: " + servers.size());
        System.out.println("First Server: " + servers.elementAt(0));
    }
}
