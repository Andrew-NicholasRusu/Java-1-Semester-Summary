package February.February_17_2026.InstrumentGroup;

// Parent Class
public abstract class Instrument {
    private String brand;
    private String material;

    public Instrument (String brand, String material) {
        this.brand = brand;
        this.material = material;
    }

    // Getters and Setters
    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    // Method to Override
    public void playNote() {
        System.out.println("The instrument produces a generic sound...");
    }
}
