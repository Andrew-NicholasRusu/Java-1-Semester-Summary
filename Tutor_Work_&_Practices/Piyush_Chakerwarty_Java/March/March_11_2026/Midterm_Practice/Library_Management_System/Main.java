
/*
3. Polymorphism 
 */

// In a Main class, demonstrate Dynamic Method Dispatch (Runtime Polymorphism) by creating a LibraryItem reference 
// pointing to a Book object and calling the displayDetails() method. 

public class Main {
    public static void main(String[] args) {
        Book book1 = new Book("Divergent", "546", "Aubree");

        book1.displayDetails(); // Calls the displayDetails method.
        

    }

}
