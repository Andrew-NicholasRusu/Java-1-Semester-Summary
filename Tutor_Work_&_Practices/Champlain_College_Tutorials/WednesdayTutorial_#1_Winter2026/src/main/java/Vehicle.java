
// Create an abstract class named Vehicle that:
public abstract class Vehicle {
    // Attributes:
    private String brand; // Name of the vehicle manufacturer
    private int speed; // Maximum speed of the vehicle

    // Constructor that initializes attributes
    public Vehicle(String brand, int speed) {
        this.brand = brand;
        this.speed = speed;
    }

    // Getters and Setters
    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    // Concrete method
    public void showBasicDetails() {
        System.out.println();
    }

    // Abstract method
    public abstract void fuelType(); // Specifies the type of fuel used.
}
