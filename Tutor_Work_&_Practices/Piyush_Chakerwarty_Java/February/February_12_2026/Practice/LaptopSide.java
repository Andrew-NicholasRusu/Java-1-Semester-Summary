package February.February_12_2026.Practice;

public class LaptopSide {
    // Instance variables
    private String brand;
    private int ram;
    private String color;

    public LaptopSide(String brand, int ram, String color) { // all argument constructor 
        this.brand = brand;
        this.ram = ram;
        this.color = color;
    }

    // Getters and Setters
    public String getBrand() {
        return brand;
    }

    public int getRam() {
        return ram;
    }

    public String getColor() {
        return color;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    // toString method to provide a string representation of the LaptopSide object
    public String toString() {
        return "LaptopSide: [brand=" + brand + ", ram=" + ram + ", color=" + color + "]";
    }  
}
