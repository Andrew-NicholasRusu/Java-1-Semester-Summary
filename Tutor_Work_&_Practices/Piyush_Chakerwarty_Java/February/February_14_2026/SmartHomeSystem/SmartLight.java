package February.February_14_2026.SmartHomeSystem;

public class SmartLight extends SmartDevice {
    // Add a private int for brightness (range 0 - 100)
    private int brightness;

    // Ensure the SmartLight constructor can set the brand using the logic 
    // already defined in the parent class and sets the initial brightness to 50. 

    public SmartLight(String brand, boolean isOn) {
        super(brand, isOn); // Calls the constructor of the parent class (SmartDevice)
        this.brightness = 50; // Set initial brightness to 50
    }

    // Override the deviceStatus() method. It should now print: "The [brand] light is [ON/OFF] 
    // at [brightness]% brightness." 
    @Override
    public void deviceStatus() {
        String status = isOn() ? "ON" : "OFF";
        System.out.println("The " + getBrand() + " light is " + status + " at " + brightness + "% brightness.");
    }

    // Create a method called dimLight(int amount). 
    // If the light is OFF, it should print: "Cannot dim a device that is powered off." 
    // If the light is ON, subtract the amount from the current brightness (ensure it doesn't go below 0). 

    public void dimLight(int amount) {
        if (!isOn()) { // Check if the light is OFF
            System.out.println("Cannot dim a device that is powered off.");
        } else {
            brightness = Math.max(brightness - amount, 0); // Ensure brightness doesn't go below 0
            System.out.println("Dimmed the light. Current brightness: " + brightness + "%");
        }
    }

    
}
