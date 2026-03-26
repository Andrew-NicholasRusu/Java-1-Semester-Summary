package February.February_17_2026.InstrumentGroup;

public class ThePiano extends Instrument {
    private int numberOfKeys;

    // Constructor
    public ThePiano (String brand, String material, int numberOfKeys) {
        super (brand, material);
        this.numberOfKeys = numberOfKeys;
    }

    // Getter and Setter
    public int getNumberOfKeys() {
        return numberOfKeys;
    }

    public void setNumberOfKeys(int numberOfKeys) {
        this.numberOfKeys = numberOfKeys;
    }

    // Overriding
    @Override
    public void playNote() {
        System.out.println("The piano plays a crisp, melodic chord.");
    }

    // toString
    @Override
    public String toString() {
        return "Piano Brand: " + getBrand() + ", Piano Material: " + getMaterial() 
        + ", Number of Keys: " + numberOfKeys;
    }
}
