import java.util.*;

public class BookShelfWithStacks {
    public static void main(String[] args) {
        Stack <String> bookshelf = new Stack<>(); // bookshelf = name of the Stack
        // Use Stacks for LIFO (Last In First Out) operations
        // Stack Time Complexities:
            // O(1) for push/pop/peek

        System.out.println("Lets organize our bookshelf!");
        
        // Operations for Stack
        bookshelf.push("The Great Gatsby");
        bookshelf.push("To Kill a Mockingbird");
        bookshelf.push("1984");
        bookshelf.push("Pride and Prejudice");
        bookshelf.push("The Catcher in the Rye");
        bookshelf.push("The Lord of the Rings");
        // push() adds an item to the top of the stack
        System.out.println("Books on the shelf right now: " + bookshelf);
        System.out.println(); // Space for better readability

        System.out.println("There are a total of " + bookshelf.size() + " books on the shelf."); // size() returns the number of items in the stack
        System.out.println(); // Space for better readability

        System.out.println("Is there Harry Potter on the shelf? " + bookshelf.contains("Harry Potter")); // contains() checks if a specific item is in the stack and returns true or false
        System.out.println(); // Space for better readability

        System.out.println("Let's take a book from the shelf:");
        bookshelf.pop(); // pop() removes the top item from the stack
        System.out.println("Books on the shelf right now: " + bookshelf); // After popping, the last book added (The Lord of the Rings) is removed
        System.out.println(); // Space for better readability

        System.out.println("Let's peek at the top book on the shelf:");
        System.out.println("The top book is: " + bookshelf.peek()); // peek() returns the top item without removing it
        System.out.println(); // Space for better readability

        bookshelf.search("1984"); // search() returns the 1-based position of the item from the top of the stack, or -1 if not found
        System.out.println("The position of '1984' from the top of the stack is: " + bookshelf.search("1984")); // Since '1984' is the 3rd book from the top, it will return 3
        System.out.println(); // Space for better readability

        bookshelf.clear(); // clear() removes all items from the stack
        System.out.println("I decided to clear the shelf. Books on the shelf right now: " + bookshelf); // After clearing, the stack will be empty
    }
}
