// and performs the following actions:

import java.util.ArrayList;
import java.util.List;

public class Collection_2 {
    public static void main(String[] args) {

        // 1. Initialize the List: Create an ArrayList of Strings and add five initial items: 
        // "Laptop", "Smartphone", "Tablet", "Monitor", and "Keyboard". 
        List<String> devices = new ArrayList<>();
        devices.add("Laptop");
        devices.add("Smartphone");
        devices.add("Tablet");
        devices.add("Monitor");
        devices.add("Keyboard");

        // 2. Add a Priority Item: A new "Server" arrives and must be placed at the very 
        // beginning of the warehouse (index 0). 
        devices.add(0, "Server");

        // 3. Update an Item: The "Tablet" at index 3 is being upgraded to a "Pro Tablet". 
        // Use the appropriate method to replace it.  
        devices.set(3, "Pro Tablet");

        // 4. Remove a Damaged Item: The "Monitor" has been damaged and must be removed 
        // from the list using its index. 
        devices.remove(4);

        // 5. Check Stock: Check if a "Smartphone" is currently in the warehouse. 
        // If it is, print its location (index). 
        if (devices.contains("Smartphone")) {
            int position = devices.indexOf("Smartphone");
            System.out.println("Smartphone is found! It is at index: " + position);
        }

        // 6. Final Audit: Use an enhanced for-loop or an Iterator to print all items currently in the warehouse to the console.
        System.out.println("Welcome To Our Electronic Shop! What device will you be buying today?"); 
        for (String electronics : devices) {
            System.out.println("-" + electronics);
        }
    }
}
