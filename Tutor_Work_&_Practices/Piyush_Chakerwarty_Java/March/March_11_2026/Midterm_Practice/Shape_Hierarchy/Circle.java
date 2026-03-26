public class Circle extends Shape {
    // Add radius field
    private int radius;

    // Constructor
    public Circle(String color, int radius) {
        super(color);
        this.radius = radius;
    }

    // Getters and Setters
    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    @Override
    double getArea() {
        return Math.PI * radius * radius;
    }

    @Override
    double getPerimeter() {
        return 2 * Math.PI * radius; 
    }

    @Override
    void draw() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

}
