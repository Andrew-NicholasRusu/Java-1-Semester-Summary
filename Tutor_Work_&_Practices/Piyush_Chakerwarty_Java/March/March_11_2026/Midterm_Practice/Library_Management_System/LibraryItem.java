// Create an abstract class named LibraryItem. It should have: 

public abstract class LibraryItem {
    // Private attributes: String title and String itemID. 
    private String title;
    private String itemID;

    // A constructor to initialize these values. 
    public LibraryItem (String title, String itemID) {
        this.title = title;
        this.itemID = itemID;
    }

    // Public getter methdos for btoh attributes
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getItemID() {
        return itemID;
    }

    public void setItemID(String itemID) {
        this.itemID = itemID;
    }

    // An abstract method called displayDetails() that returns void. 
    public abstract void displayDetails();

    
    



}
