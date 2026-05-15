package Interfaces_AbstractClasses;

public class Circle extends Shape implements Drawable {

    public Circle(String color) {
        super(color);
    }

    @Override
    public void draw() {
        System.out.println("Drawing circle...");
    }

    @Override
    public void calculateArea() {
        System.out.println("Calculating circle area...");
    }
}
