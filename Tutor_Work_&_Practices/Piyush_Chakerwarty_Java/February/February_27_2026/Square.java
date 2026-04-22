public class Square {
    private double side; 

    public void setSide (double newSide) throws IllegalArgumentException {
        if (newSide >= 0) {
            side = newSide;
        } else {
            throw new IllegalArgumentException("Side of the Square cannot be negative: " + newSide);
        }
    }

    public double getArea() {
        return side * side;
    }

    public static void main(String[] args) {
        Square square = new Square();

        // Test 1: Valid radius
        try {
            square.setSide(4.0);
            System.out.println("Area of the square: " + square.getArea());
        } catch (IllegalArgumentException e) {
            System.out.println("ERROR: " + e.getMessage());
        }

        // Test 2: Invalid
        try { 
            square.setSide(-3.0); 
            System.out.println("Area: " + square.getArea()); 
        } catch (IllegalArgumentException e) { 
            System.out.println("ERROR: "+e.getMessage()); 
        }
    }
} 
