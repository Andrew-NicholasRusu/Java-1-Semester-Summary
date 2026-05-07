package Connector_Applications;

public abstract class BaseConnector implements ConnectorApplication {
    // Fields:
    private int power;
    private int dataTransfer;
    private int signal;

    // No-Arg Constructor
    public BaseConnector() {
        this.power = 0;
        this.dataTransfer = 0;
        this.signal = 0;
    }

    // Constructor:
    public BaseConnector(int dataTransfer, int power, int signal) {
        this.dataTransfer = dataTransfer;
        this.power = power;
        this.signal = signal;
    }

    public int getDataTransfer() {
        return dataTransfer;
    }

    // Getters and Setters
    public void setDataTransfer(int dataTransfer) {
        this.dataTransfer = dataTransfer;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public int getSignal() {
        return signal;
    }

    public void setSignal(int signal) {
        this.signal = signal;
    }

    // Methods for Child classes
    public abstract void type();


    @Override
    public void connect() {

    }
}
