import java.util.ArrayList;

public class ShapeDemo {
    public static void main(String[] args) {
        
        Rectangle rectangle = new Rectangle("Blue", 6, 8); // Color, Width, Height 
        Circle circle = new Circle("Red", 9); // Color, Radius

        // Create ArrayList of shapes
        ArrayList<Shape> shapes = new ArrayList<>();
        // Add different shapes
        shapes.add(rectangle);
        shapes.add(circle);

        for (Shape me  : shapes) {
            System.out.println(shapes);
        }

        // Calculate total area of all shapes
        rectangle.getArea(); // 48
        circle.getArea(); // 

    }

}
