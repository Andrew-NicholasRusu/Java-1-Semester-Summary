// In your public static void main method, demonstrate your understanding of Declared Types vs. Actual Types.

public class GeometricMain {
    public static void main(String[] args) {
    // 1. Array Creation: Create an array of type GeometricObject with a size of 3. 
    // 2. Storage: Fill the array with different objects: a Circle, a Rectangle, and a Square. 
    // 3. The Loop: Use a loop to iterate through the array. For each object: 
        //  Display the result of getArea(). 
        //  Logic Check: Check if the object is an instanceof Colorable. If it is, call the howToColor() method.
        
        Circle circle1 = new Circle(9);
        Rectangle rectangle1 = new Rectangle(8, 9);
        Square square1= new Square (6);
        
        GeometricObject[] Storage = new GeometricObject[3];
        Storage[0] = circle1;
        Storage[1] = rectangle1;
        Storage[2] = square1;

        for (GeometricObject geometricObject : Storage) {
            System.out.println("Area: " + geometricObject.getArea() + " | Perimeter: " + geometricObject.getPerimeter());
        }




        
    }
}
