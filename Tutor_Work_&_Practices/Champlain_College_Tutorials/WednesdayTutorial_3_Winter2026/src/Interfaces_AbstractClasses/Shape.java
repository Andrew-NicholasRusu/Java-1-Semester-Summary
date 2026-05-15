package Interfaces_AbstractClasses;

public abstract class Shape {
    // Field
    private String color;

    // No-arg Constructor
    public Shape () {
        this.color = "";
    }

    // Arg Constructor
    public Shape(String color) {
        this.color = color;
    }

    // Getters and Setters
    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    // Abstract method
    public abstract void calculateArea();
}
