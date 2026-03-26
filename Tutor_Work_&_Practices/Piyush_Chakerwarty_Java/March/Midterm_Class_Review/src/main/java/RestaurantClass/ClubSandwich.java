package RestaurantClass;

public class ClubSandwich implements Preparable, Toastable {
    // Attributes (instance variables)
    private String breadType;

    // No argument constructor
    public ClubSandwich() {
        this.breadType = "";
    }

    // Argument constructor
    public ClubSandwich(String breadType) {
        this.breadType = breadType;
    }

    public String getBreadType() {
        return breadType;
    }

    public void setBreadType(String breadType) {
        this.breadType = breadType;
    }

    @Override
    public void prepare() {
        System.out.println("Adding turkey, lettuce, and tomato to the " + this.breadType + " Sandwich.");
    }

    @Override
    public void toast() {
        System.out.print("Toasting the " + this.breadType + " Sandwich... ");
    }
}
