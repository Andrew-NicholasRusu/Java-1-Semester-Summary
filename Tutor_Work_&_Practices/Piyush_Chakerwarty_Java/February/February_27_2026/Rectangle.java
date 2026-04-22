public class Rectangle {
    // Attributes
    private double length; 
    private double width; 

    public void setLength (double newLength) throws IllegalArgumentException {
        if (newLength >= 0) {
            length = newLength;
        } else {
            throw new IllegalArgumentException("The sides of the rectangle can never be negativre: " + newLength);
        }
    }

    public void setWidth (double newWidth) throws IllegalArgumentException {
        if (newWidth >= 0) {
            width = newWidth;
        } else {
            throw new IllegalArgumentException("The sides of the rectangle can never be negativre: " + newWidth);
        }
    }

    public double getArea() {
        return length * width;
    }

    // Main Method
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle();

        // Test 1: Valid radius
        try {
            rectangle.setLength(8.0);
            rectangle.setWidth(9.0);
            System.out.println("Area of the rectangle: " + rectangle.getArea());
        } catch (IllegalArgumentException e) {
            System.out.println("ERROR: " + e.getMessage());
        }

        // Test 2: Invalid
        try { 
            rectangle.setLength(-3.0); 
            rectangle.setWidth(-6.0);
            System.out.println("Area: " + rectangle.getArea()); 
        } catch (IllegalArgumentException e) { 
            System.out.println("ERROR: "+e.getMessage()); 
        }
    }
} 

