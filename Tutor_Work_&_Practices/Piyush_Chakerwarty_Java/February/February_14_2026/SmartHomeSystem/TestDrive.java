package February.February_14_2026.SmartHomeSystem;

public class TestDrive {
    public static void main(String[] args) {
        // 1. Create one SmartLight object (Brand: Lutron) 
        SmartLight light1 = new SmartLight ("Lutron", true);

        // 2. Call deviceStatus() immediately. It should show the device is OFF
        light1.deviceStatus(); // The Lutron light is OFF at 50% brightness.
        
        // 3. Call togglePower()
        light1.togglePower(); // Turns the Device ON.
        light1.deviceStatus(); // The Lutron light is ON at 50% brightness.
        System.out.println();

        // 4. Call deviceStatus() again. Ensure it now shows the brightness level in the message.
        SmartDevice device = new SmartDevice("Energizer", false);
        device.deviceStatus(); // The Energizer device currently false

        // 5. Test Logic:
        // Try to dimLight by 20
        light1.dimLight(20); // Dimmed the light. Current brightness: 30%
        // It is not device.dimLight because dimLight is not included in the SmartDevice class. 

        // Print the status again to confirm the new brightness is 30.
        device.deviceStatus();

        // 6. Turn the power OFF and try to dimLight again. Verify the "Cannot dim"
        // error message if it appears.
        light1.togglePower(); // Turned the Power OFF
        light1.dimLight(20); // Cannot dim a device that is powered off

    }
    
}
