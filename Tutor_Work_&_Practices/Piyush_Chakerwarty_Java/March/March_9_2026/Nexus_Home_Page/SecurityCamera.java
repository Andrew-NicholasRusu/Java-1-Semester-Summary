public class SecurityCamera extends HomeDevice implements Connectable {

    public SecurityCamera (String deviceName, double powerUsage) {
        super(deviceName, powerUsage);
    }

    @Override
    public void operate() {
        // operate(): Print "Recording 1080p video feed..." 
        System.out.println("Recording 1080p video feed...");

    }

    @Override
    public void updateFirmware() {
        // updateFirmware(): Print "Camera firmware is updating via encrypted server..." 
        System.out.println("Camera firmware is updating via encrypted server...");
    }

    @Override
    public int getSignalStrength() {
        // getSignalStrength(): Return a fixed value of 85. 
        return 85;
    }



}
