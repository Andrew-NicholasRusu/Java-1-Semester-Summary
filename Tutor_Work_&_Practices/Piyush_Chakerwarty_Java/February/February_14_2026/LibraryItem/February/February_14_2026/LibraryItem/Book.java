package February.February_14_2026.LibraryItem;

public class Book extends LibraryItem {
    // Attribute of the Book class
    private String author;

    // Constructor
    public Book(String title, int releaseYear, String author) {
        super(title, releaseYear); // Call the constructor of the parent class (LibraryItem)
        this.author = author;
        }

        // Getter and Setters
         public String getAuthor() {
            return author;
        }

        public void setAuthor(String author) {
            this.author = author;
        }          

        // Override the displayInfo() method to print: "Book: [title] by [author] ([releaseYear])"
        @Override
        public void displayInfo() {
            System.out.println("Book: " + getTitle() + " Author: " + author + " Release Year: " + getReleaseYear()) ;
    }  
}
