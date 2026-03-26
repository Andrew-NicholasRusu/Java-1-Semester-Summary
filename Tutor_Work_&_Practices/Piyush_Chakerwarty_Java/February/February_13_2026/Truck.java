package February.February_13_2026;

public class Truck extends Vehicle {
    private int enginePower;
    private int numberOfDoors;

    public Truck(String brand, int year, String color, int numberOfDoors, int enginePower) {
        super(brand, year, color);
        this.enginePower = enginePower;
        this.numberOfDoors = numberOfDoors;
        // When we use truck in the main, we can have a value for brand, year, color, numberOfDoors, and enginePower
    }

    // Getters and Setters
    public int getEnginePower() {
        return enginePower;
    }

    public void setEnginePower(int enginePower) {
        this.enginePower = enginePower;
    }

    // We have to make a getter and a setter for doors again for Truck because numberOfDoors was a property for the car Class,
    // which is the child class of the Vehicle Class. 
    // Truck is also the child class of the vehicle class.
    // The relationship between truck and car is that they're both siblings (not connected to each other directly).
    // child class can only use the attributes and behaviours / methods form the parent class.
    public int getNumberOfDoors() {
        return numberOfDoors; 
    }

    public void setNumberOfDoors(int numberOfDoors) {
        this.numberOfDoors = numberOfDoors;
    }

    //toString method
    @Override
    public String toString() {
        return "Truck's Engine Power: " + enginePower + ", Brand: " + getBrand() + ", Year: " + getYear()
                + ", Color: " + getColor();
    }


    
}
