// Create an abstract class named GeometricObject.
public abstract class GeometricObject {
    // Abstract Methods: Define two abstract methods: double getArea() and double getPerimeter(). These methods must have no bodies. 
     
    public abstract double getArea();
    public abstract double getPerimeter();

    // Concrete Method: Include a non-abstract method String whoAmI() that returns "I am a Geometric Object". 
    public static String whoAmI() {
        return "I am a Geometraic Object";
    }

    // Constraint: Ensure this class cannot be instantiated directly in your main program 

}
