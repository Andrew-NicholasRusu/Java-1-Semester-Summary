package Connector_Applications;

public class NetworkingAndDataIntegration extends BaseConnector {

    // Constructor:
    public NetworkingAndDataIntegration(int dataTransfer, int power, int signal) {
        super(dataTransfer, power, signal);
    }

    @Override
    public void type() {
        System.out.println("This key connector application is a data transmission.");
    }
}
