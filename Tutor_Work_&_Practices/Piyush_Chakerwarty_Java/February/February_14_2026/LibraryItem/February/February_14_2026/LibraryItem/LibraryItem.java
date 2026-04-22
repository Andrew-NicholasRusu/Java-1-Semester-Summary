package February.February_14_2026.LibraryItem;

public class LibraryItem {
    // Attribute of the LibraryItem class
    private String title;
    private int releaseYear;

    // Constructor
    public LibraryItem(String title, int releaseYear) {
        this.title = title;
        this.releaseYear = releaseYear;
    }

    // Getters and Setters
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getReleaseYear() {
        return releaseYear;
    }

    public void setReleaseYear(int releaseYear) {
        this.releaseYear = releaseYear;
    }

    // Method called displayInfo() to print the title and release year of the library item
    public void displayInfo() {
        System.out.println("Library Item: " + title + ", " + releaseYear);
    }
    
    
}
