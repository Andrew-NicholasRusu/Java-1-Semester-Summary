package February.February_13_2026;

public class Car extends Vehicle {
    // Create a Car class that extends Vehicle and adds specific attributes like numberOfDoors, 
    // and overrides the startEngine() method to print: "Car is starting...".
    private int numberOfDoors;

    // Constructor
    public Car (String brand, int year, String color, int numberOfDoors) {
        // super() - calls the parent (Vehicle) constructor.
        super(brand, year, color); // This will initialize the brand, year, and color attributes in the Vehicle class.
        this.numberOfDoors = numberOfDoors;
    }

    public int getNumberOfDoors() {
        return numberOfDoors;
    }

    public void setNumberOfDoors(int numberOfDoors) {
        this.numberOfDoors = numberOfDoors;
    }

    @Override
    public String toString() {
        return "Number of Doors: " + numberOfDoors + ", Brand: " + getBrand() + ", Year: " + getYear()
                + ", Color: " + getColor();
    }
    
    // Method Overriding: Override startEngine() to print: "Car is starting..."
    @Override
    public void startEngine() {
        System.out.println("Car is starting...");
    }

    // Child class specific Method
    public void honk() {
        System.out.println("Honk-Honk");
    }   
}
