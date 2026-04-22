package February.February_18_2026.Abstract_Example;

public class SmartRectangle extends Abstract_Example implements Resizable {
    // This class extends the abstract class Abstract_Example and implements the Resizable interface.
    private double length, width;

    @Override
    public double getArea() {
        return length * width; // Area of a rectangle = length × width
    }

    @Override
    public void resize(double percent) {
        width = width * percent;
        length = length * percent;
    }
}
