import java.util.LinkedList;

public class Collection_3 {

    public static void main(String[] args) {
        // Create a linked list to
        LinkedList<String> history = new LinkedList<>();
        // Vist pages - Adding to the end
        history.add("google.com");
        history.add("wikipedia.com");
        history.add("github.com");
        history.add("zoom.com");

        // User presses "Back" - Removing from the end
        String lastVisited = history.removeLast();
        System.out.println("Closed: " + lastVisited); // lastVisited = name

        // Current Page is now the new "last page"
        System.out.println("Currently on: " + history.getLast());

        // Force a priority announcement - Adding to the beginning
        history.addFirst("System Updated required: " + lastVisited);
        
        // Display history forward using a list iterator
        System.out.println("Full history path");
        var it = history.listIterator();
        while(it.hasNext()) {
            System.out.println(it.next() + " -> ");
        }
    }
}
