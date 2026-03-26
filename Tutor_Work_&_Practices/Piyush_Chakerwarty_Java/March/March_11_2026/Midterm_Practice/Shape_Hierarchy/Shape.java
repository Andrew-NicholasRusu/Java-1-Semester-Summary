
// TO DO: Complete this abstract class
public abstract class Shape {
    protected String color;

    // Constructor
    public Shape (String color) {
        this.color = color; 
    }

    // Abstract methods - implement in subclasses
    abstract double getArea();
    abstract double getPerimeter();
    abstract void draw();

    // Concrete method
    public String getColor() {
        return color;
    }

}
