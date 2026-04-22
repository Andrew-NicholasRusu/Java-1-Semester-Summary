public class Circle extends GeometricObject{
    // Extending the Abstract_Example class means we must provide an implementation 
    // for the getArea() method, as it is declared abstract in the parent class.
    private double radius;

    public Circle (double radius) {
        this.radius = radius;
    }

    @Override 
    public double getArea() {
        return Math.PI * Math.pow(radius, 2); // Area of a circle = πr²
        // return Math.PI * radius * radius; // Alternative way to calculate area without using Math.pow
    }
    
    @Override
	public double getPerimeter() {
		return 2 * Math.PI * radius;
	}
}
