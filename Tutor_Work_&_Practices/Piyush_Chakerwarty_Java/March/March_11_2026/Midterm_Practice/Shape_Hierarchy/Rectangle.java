
// TO DO: Implement Rectangle Class
public class Rectangle extends Shape {
    
    // Add the width and height fields
    private double width;
    private double height;

    // Implement the constructor
    public Rectangle (String color, double width, double height) {
        super(color);
        this.width = width;
        this.height = height;
    }

    @Override
    double getArea() {
        return width * height;
    }

    @Override
    double getPerimeter() {
        return 2 * (width) + 2 * (height);
    }

    @Override
    void draw() {
        throw new UnsupportedOperationException("Not supported yet.");
    }
}
