// Your task is to build a management system for smart devices in a modern home. 
// You will start with a general device and then create a specialized version for a smart light. 

package February.February_14_2026.SmartHomeSystem;

public class SmartDevice {
    // Attributes
    private String brand;
    private boolean isOn;

    // Constructor: Initializes the brand and sets isOn to false by default:
    public SmartDevice (String brand, boolean isOn) {
        this.brand = brand;
        this.isOn = false;
    }

    // Getters and Setters
     public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public boolean isOn() {
        return isOn;
    }

    public void setOn(boolean isOn) {
        this.isOn = isOn;
    }
    

    // Methods:
    // togglePower(): Flips the isOn status (if it was true, it becomes false, and vice versa)
    public void togglePower() {
        if (!isOn) {
            this.isOn = true;
        } else {
            this.isOn = false;
        }
    }

    // deviceStatus(): Prints a message saying: "The [brand] device is currently [ON/OFF]"
    public void deviceStatus() {
        System.out.println("The " + brand + " device is currently " + isOn);
    }
}