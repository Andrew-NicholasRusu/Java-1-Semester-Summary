package February.February_14_2026.LibraryItem;

public class Movie extends LibraryItem{
    private double rating;

    public Movie(String title, int releaseYear, double rating) {
        super(title, releaseYear);
        this.rating = rating;
    }

    @Override
    public void displayInfo(){
        System.out.println("Movie: " + getTitle() + " Rating: " + rating + "/ 10.0");

    }

    
}
