package February.February_13_2026;

public class Vehicle {
    // Create a base class called Vehicle with common attributes like brand, year, and color, and methods like startEngine() and stopEngine().
    // The Vehicle class will serve as the parent class for specific vehicle types like Car, Truck, and Motorcycle.
    private String brand;
    private int year;
    private String color;

    // Constructor
    public Vehicle(String brand, int year, String color) {
        this.brand = brand;
        this.year = year;
        this.color = color;
    }

    // Getters and Setters
    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    // Methods
    public void startEngine() {
        System.out.println("Vehicle engine is starting...");
    }

    public void stopEngine() {
        System.out.println("Vehicle stopped...");
    }
}