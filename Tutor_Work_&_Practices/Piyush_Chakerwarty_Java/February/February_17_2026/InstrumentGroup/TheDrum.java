package February.February_17_2026.InstrumentGroup;

public class TheDrum extends Instrument {
    private String drumSize = "Snare";

    // Constructor
    public TheDrum (String brand, String material, String drumSize) {
        super (brand, material);
        this.drumSize = drumSize;
    }

    public String getDrumSize() {
        return drumSize;
    }

    // Custom Method
    public void setDrumSize(String drumSize) {
        this.drumSize = drumSize;
    }

    // Overriding
    @Override
    public void playNote() {
        System.out.println("The drum produces a deep, rhythmic beat.");
    }

    // toString
    @Override
    public String toString() {
        return "Drum Brand: " + getBrand() + ", Drum Material: " + getMaterial() 
        + ", Size of the Drums: " + drumSize;
    }
}
