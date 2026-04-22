package February.February_18_2026.Abstract_Example;

public class Rectangle extends Abstract_Example {
    private double length;
    private double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    @Override 
    public double getArea() {
        return length * width; // Area of a rectangle = length × width
    }
    
}
