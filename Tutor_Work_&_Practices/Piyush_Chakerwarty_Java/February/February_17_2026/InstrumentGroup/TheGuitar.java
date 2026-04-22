package February.February_17_2026.InstrumentGroup;

public class TheGuitar extends Instrument {
    private boolean isElectric;

    // Constructor
    public TheGuitar(String brand, String material, boolean isElectric) {
        super (brand, material);
        this.isElectric = isElectric;
    }

    // Getter and Setter 
    public boolean isElectric() {
        return isElectric;
    }

    public void setElectric(boolean isElectric) {
        this.isElectric = isElectric;
    }    

    // Overriding
    @Override
    public void playNote() {
        System.out.println("The guitar strings vibrate to create a warm tone.");
    }

    // toString
    @Override
    public String toString() {
        return "Guitar Brand: " + getBrand() + ", Guitar Material: " + getMaterial() 
        + ", Is the Guitar an Electric Car? " + isElectric;
    }
}
