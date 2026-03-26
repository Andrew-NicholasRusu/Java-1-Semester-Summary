
// Create a class SmartLight that extends SmartDevice and implements RemoteControl. 
public class SmartLight extends SmartDevice implements RemoteControl {

    // Constructor
    public SmartLight (String deviceName) {
        super(deviceName);
    }

    // performAction() should print "Adjusting brightness...". 
    @Override
    public void performAction() {
        System.out.println("Adjusting brightness...");
    }

    // powerOn() and powerOff() should print "Light is ON" and "Light is OFF" respectively. 
    @Override
    public void powerOn() {
        System.out.println("Light is ON.");
    }

    @Override
    public void powerOff() {
        System.out.println("Light is OFF.");
    }

}
