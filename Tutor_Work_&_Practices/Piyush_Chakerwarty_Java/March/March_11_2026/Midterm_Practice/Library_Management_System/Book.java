// Create a subclass named Book that extends LibraryItem. 

public class Book extends LibraryItem {
    // It should have an additional private attribute: String author. 
    private String author;

    // Implement a constructor that calls the superclass constructor. 
    public Book(String title, String itemID, String author) {
        super (title, itemID);
        this.author = author;
    }

    // Override the displayDetails() method in the Book class to print the title, ID, and author. 
    @Override
    public void displayDetails() {
        System.out.println("Title: " + getTitle() + "\nBook ID " + getItemID() + "\nAuthor: " + this.author);
    }
}
