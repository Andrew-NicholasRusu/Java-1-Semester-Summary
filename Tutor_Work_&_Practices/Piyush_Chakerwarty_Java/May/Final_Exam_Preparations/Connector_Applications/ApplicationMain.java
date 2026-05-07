package Connector_Applications;

import java.io.IOException;
import java.sql.SQLException;

public class ApplicationMain {
    public static void main(String[] args) {
        NetworkingAndDataIntegration dataIntegration = new NetworkingAndDataIntegration(60, 70, 40);
        IndustrialAutomation industrialAutomation = new IndustrialAutomation(40, 120, 80);

        // Store these objects in an array called systems.
        BaseConnector[] systems = new BaseConnector[2]; // Polymorphism
        systems[0] = dataIntegration;
        systems[1] = industrialAutomation;

        // Write a try-catch block that tries to connect both systems and handle a general Exception.
        for (int i = 0; i < systems.length; i++) {
            System.out.println();
            try {
                systems[i].connect();
            } catch (Exception e) { // General Exception
                System.out.println("Exception: " + e.getMessage());
            }
        }
    }
}
