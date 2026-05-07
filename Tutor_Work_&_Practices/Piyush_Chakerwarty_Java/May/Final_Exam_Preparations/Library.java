// Uses hashmap to store the inventory of a library. The key is the book title and the value is the number of copies available.

import java.util.HashMap;

public class Library {
    public static void main(String[] args) {
        

    HashMap <String, Integer> libraryInventory = new HashMap<>();

    libraryInventory.put("The Hobbit", 3);
    libraryInventory.put("1984", 1);
    libraryInventory.put("To Kill a Mockingbird", 5);

    //  Suppose a new book is bought by the library
    String newBook = "Dune";
    if (libraryInventory.containsKey("Dune")) {
        int v = libraryInventory.get(newBook);
        libraryInventory.put(newBook, v + 1);
    } else {
        libraryInventory.remove(newBook, 0);
    }
    // Print the updated inventory
    System.out.println("Library Inventory");
    for (String book : libraryInventory.keySet()) { // keySet() method returns a set of all the keys in the hashmap, which are the book titles in this case.
        System.out.printf("%-30s %4d \n", book, libraryInventory.get(book));
        }
    }
}

