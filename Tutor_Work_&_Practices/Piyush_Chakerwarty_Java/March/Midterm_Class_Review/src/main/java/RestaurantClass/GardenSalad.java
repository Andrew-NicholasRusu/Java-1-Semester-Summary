package RestaurantClass;

public class GardenSalad implements Preparable {
    // Attributes (instance variables)
    private String dressingType;

    // No argument constructor
    public GardenSalad() {
        this.dressingType = "";
    }

    // Argument constructor
    public GardenSalad(String dressingType) {
        this.dressingType = dressingType;
    }

    public String getDressingType() {
        return dressingType;
    }

    public void setDressingType(String dressingType) {
        this.dressingType = dressingType;
    }

    @Override
    public void prepare() {
        System.out.println("Preparing a Garden Salad with " + this.dressingType + " dressing.");
    }
}
