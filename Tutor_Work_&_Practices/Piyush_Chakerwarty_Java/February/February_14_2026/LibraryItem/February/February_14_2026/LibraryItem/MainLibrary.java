package February.February_14_2026.LibraryItem;

public class MainLibrary {
    public static void main(String[] args) {
        Book book1 = new Book ("The Great Gatsby,", 1925, "F.Scott Fitzgerald,");
        Movie movie1 = new Movie ("Inception,", 2010, 8.8);

        // Use a setter on the Book object to change its releaseYear to 1926.
        book1.setReleaseYear(2026);

        // Call displayInfo() on the Book object.
        book1.displayInfo();

        // Call displayInfo() on the Movie object.
        movie1.displayInfo();

        // Use a getter to print only the author of the book to the console.
        book1.getAuthor();
    }
    
}
