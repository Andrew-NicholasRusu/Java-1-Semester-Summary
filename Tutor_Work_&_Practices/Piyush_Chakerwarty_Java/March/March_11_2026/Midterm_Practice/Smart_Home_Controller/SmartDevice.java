
// Create an abstract class named SmartDevice. It should have: 
public abstract class SmartDevice {
    // A private attribute String deviceName. 
    private String deviceName;

    // A constructor and a getter for deviceName. 
    public SmartDevice (String deviceName) {
        this.deviceName = deviceName;
    }

    // Getter and Setter
    public String getDeviceName() {
        return deviceName;
    }

    public void setDeviceName(String deviceName) {
        this.deviceName = deviceName;
    }

    // An abstract method void performAction(). 
    public abstract void performAction();

}
