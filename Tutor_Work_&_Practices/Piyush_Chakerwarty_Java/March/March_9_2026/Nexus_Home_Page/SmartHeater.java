public class SmartHeater extends HomeDevice {

    private int temp;

    public SmartHeater (String deviceName, double powerUsage, int temp) {
        super(deviceName, powerUsage);
        this.temp = temp;
    }

    public int getTemp() {
        return temp;
    }

    public void setTemp(int temp) {
        this.temp = temp;
    }

    // Implementation:
    // operate(): Print "The heater is warming the room using [powerUsage] Watts." 
    @Override
    public void operate() {
        System.out.println("The heater is warming the room using " + getPowerUsage() + " Watts.");
    }

    // Unique Feature:
    // Add a method setTemperature(int temp) that prints "Target temperature set to [temp] degrees." 
    public int setTemperature() {
        System.out.println("Target temperature set to " + temp + " degrees.");
        return 0;
    }

}
