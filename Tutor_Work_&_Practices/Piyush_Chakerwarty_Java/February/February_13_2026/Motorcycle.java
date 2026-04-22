package February.February_13_2026;

public class Motorcycle extends Vehicle {
    // Add a boolean field called hasSideCar.
    private boolean hasSideCar;

    // Constructor
    public Motorcycle (String brand, int year, String color, boolean hasSideCar) {
        // Use super() to initialize the brand, year, and color, 
        // while also setting the hasSidecar value. 
        super (brand, year, color);
        this.hasSideCar = hasSideCar;
    }

    // Getter and Setter for hasSideCar:
    public boolean isHasSideCar() {
        return hasSideCar;
    }

    public void setHasSideCar(boolean hasSideCar) {
        this.hasSideCar = hasSideCar;
    }

    // Method Overriding:
        // Override startEngine() to print: "The motorcycle engine roars!" 
        // Override stopEngine() to print: "The motorcycle engine shuts off with a click." 
    @Override
    public void startEngine() {
        System.out.println("The motorcycle engine roars!");
    }

    @Override
    public void stopEngine() {
        System.out.println("The motor cycle engine shuts off with a click.");
    }

    // Unique Behavior: Add a method called wheelie() that prints: "The motorcycle pops a wheelie!" 
    // but only if it does not have a sidecar. 
    public void wheelie() {
        if (!hasSideCar) {
        System.out.println("The motorcycle pops a wheelie!");
        }
    }

    @Override
    public String toString() {
        return ("Brand: " + getBrand() + ", Year: " + getYear() + ", Color: " + getColor() + ", It Has A Side Car? " + hasSideCar);
        // it is getBrand(), getYear(), and getColor() because all these attributes were already determined in the Vehicle class.
    }
}
