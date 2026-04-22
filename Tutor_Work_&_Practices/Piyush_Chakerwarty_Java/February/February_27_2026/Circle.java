public class Circle {
    private double radius; 

    public void setRadius (double newRadius) throws IllegalArgumentException {
        if (newRadius >= 0) {
            radius = newRadius;
        } else {
            throw new IllegalArgumentException("Radius cannot be negative: " + newRadius);
        }
    }

    public double getArea() {
        return Math.PI * radius * radius;
    }

    public static void main(String[] args) {
        Circle circle = new Circle();

        // Test 1: Valid radius
        try {
            circle.setRadius(5.0);
            System.out.println("Area: " + circle.getArea());
        } catch (IllegalArgumentException e) {
            System.out.println("ERROR: " + e.getMessage());
        }

        // Test 2: Invalid
        try { 
            circle.setRadius(-3.0); 
            System.out.println("Area: " + circle.getArea()); 
        } catch (IllegalArgumentException e) { 
            System.out.println("ERROR: "+e.getMessage()); 
        }
    }
} 