// Create a concrete class named Square that builds upon your previous work.
// Inheritance: Square must extend GeometricObject. 
// Interface Implementation: Square must also implement the Colorable interface.  
public class Square extends GeometricObject implements Colorable {
// Requirement: You are forced to provide implementations for 
// getArea(), getPerimeter(), and howToColor() because Square is a non-abstract subclass. 

	private double side;

	public Square(double side) {
		this.side = side;
	}

	@Override
	public double getArea() {
		return side * side;
	}

	@Override
	public double getPerimeter() {
		return 4 * side;
	}

	@Override
	public void howToColor() {
		System.out.println("Color all four sides of the square.");
	}
}
