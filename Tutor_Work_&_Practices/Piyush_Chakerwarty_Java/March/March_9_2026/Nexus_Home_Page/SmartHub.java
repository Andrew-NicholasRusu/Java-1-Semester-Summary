public class SmartHub {
    public static void main(String[] args) {
        
        // #1. Polymorphic Collection: Create an array of type HomeDevice with a size of 2. 
        HomeDevice[] devices = new HomeDevice[2];

        // #2. Storage: 
            // Store one SmartHeater ("LivingRoom_Heat", 1500.0). 
            // Store one SecurityCamera ("FrontDoor_Cam", 15.0). 
        SmartHeater smartHeater = new SmartHeater("LivingRoom_Heat", 1500.0, 22);
        SecurityCamera securityCamera = new SecurityCamera("FrontDoor_Cam", 15.0);

        devices[0] = smartHeater;
        devices[1] = securityCamera;

        // #3. The Processing Loop: 
            // Iterate through the array and call operate() for every item. 
            // Downcasting Check: Use instanceof to check if the current object is a SmartHeater. If it is, cast it and call setTemperature(22). 
            // Interface Check: Use instanceof to check if the item is Connectable. If it is, cast it and call updateFirmware().
        for (HomeDevice device : devices) {
            // Call operate() for every item
            device.operate();

            // Downcasting Check: SmartHeater
            if (device instanceof SmartHeater) {
                SmartHeater heater = (SmartHeater) device; // Downcast
                heater.setTemp(22);
                System.out.println("Temperature set to: " + heater.getTemp());
            }

            // Interface Check: Connectable
            if (device instanceof Connectable) {
                Connectable connectableDevice = (Connectable) device; // Cast
                connectableDevice.updateFirmware();
            }
        }

    }
}
