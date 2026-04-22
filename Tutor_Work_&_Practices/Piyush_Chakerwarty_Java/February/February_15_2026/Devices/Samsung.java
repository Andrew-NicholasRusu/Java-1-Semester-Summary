package February.February_15_2026.Devices;

public class Samsung extends Phone {

    // Constructor: Pass the brand "Samsung" to the parent constructor
    public Samsung(String brand) {
        super(brand);
        brand = "Samsung"; // Ensure the brand is set to "Samsung"
    }

    // Method Overriding: 
    // Override the powerOn() method. It should print: 
    // "Samsung Galaxy: Securely booting with Knox..." 
    @Override
    public void powerOn() {
        System.out.println("Samsung Galaxy: Securely booting with Knox...");
    }

    // Unique Method:
    // Create a method enableDex() that prints: "Desktop mode enabled."
    public void enableDex() {
        System.out.println("Desktop mode enabled");
    }
    
}
