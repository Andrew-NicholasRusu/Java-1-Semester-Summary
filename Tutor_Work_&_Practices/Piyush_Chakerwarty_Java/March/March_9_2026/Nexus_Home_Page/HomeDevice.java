// Create an abstract class named HomeDevice.

public abstract class HomeDevice {
    // Attributes: protected String deviceName and protected double powerUsage (in Watts). 
    protected String deviceName;
    protected double powerUsage;

    // Constructor: Initializes both fields. 
    public HomeDevice (String deviceName, double powerUsage) {
        this.deviceName = deviceName;
        this.powerUsage = powerUsage;
    }

    // Getters and Setters
    public String getDeviceName() {
        return deviceName;
    }

    public void setDeviceName(String deviceName) {
        this.deviceName = deviceName;
    }

    public double getPowerUsage() {
        return powerUsage;
    }

    public void setPowerUsage(double powerUsage) {
        this.powerUsage = powerUsage;
    }

    // Abstract Method: public abstract void operate(). (This represents the device performing its main function). 
    public abstract void operate();

    // Final Method: public final void logAction(String action) which prints: [Device: name] performing: [action]
    public final void logAction(String action) {
        System.out.println("Device: " + this.deviceName + "performing: " + this.powerUsage);
    }

    

}
