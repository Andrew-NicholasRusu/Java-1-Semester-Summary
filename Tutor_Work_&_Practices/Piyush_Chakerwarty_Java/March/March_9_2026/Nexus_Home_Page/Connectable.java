public interface Connectable {

    // Methods to extend in subclasses
    public void updateFirmware();
    public int getSignalStrength(); // Returns a value from 0 - 100.

}
