package Connector_Applications;

public class IndustrialAutomation extends BaseConnector {

    // Constructor:
    public IndustrialAutomation(int dataTransfer, int power, int signal) {
        super(dataTransfer, power, signal);
    }

    @Override
    public void type() {
        System.out.println("This application is used for industrial automations.");
    }
}
