package CustomExceptions;

public class CircleWithCustomExceptions{ 

    private double radius; 
    public void setRadius(double radius) throws InvalidRadiusException { 
        if (radius < 0) { 
            throw new InvalidRadiusException(radius); 
        } 
        this.radius = radius; 
    } 
    public double getArea() { 
        return Math.PI * radius * radius; 
    } 

    public static void main(String[] args) { 
        CircleWithCustomExceptions c = new CircleWithCustomExceptions(); 
        try { 
            c.setRadius(-5); 
        } catch (InvalidRadiusException e) { 
            System.out.println("Error: " + e.getMessage()); 
            System.out.println("Bad radius was: " + e.getRadius()); 
        } 

        try { 
            c.setRadius(10); 
            System.out.println("Area: " + c.getArea()); 
        } catch (InvalidRadiusException e) { 
            System.out.println("Error: " + e.getMessage()); 
        } 
    } 
} 
