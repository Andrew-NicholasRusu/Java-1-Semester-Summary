/*
    3. Application Logic (3 Marks): 
*/

import java.util.ArrayList;
public class Main {
    public static void main(String[] args) {
        // In a Main class, create an ArrayList that stores objects of type RemoteControl.
        ArrayList<SmartLight> RemoteControl = new ArrayList<>();

        // Add a SmartLight instance to this list. 
        SmartLight smartLight = new SmartLight("AWS");
        SmartLight smartLight2 = new SmartLight("AWS");
        SmartLight smartLight3 = new SmartLight("AWS");
        SmartLight smartLight4 = new SmartLight("AWS");
        RemoteControl.add(smartLight);
        RemoteControl.add(smartLight2);
        RemoteControl.add(smartLight3);
        RemoteControl.add(smartLight4);

        // Iterate through the list and call the powerOn() method for each item. 
        for (SmartLight e : RemoteControl) {
            e.powerOn(); 
        }

        // Turning them all off:
        System.out.println();
        smartLight.performAction();
        smartLight.powerOff();
        smartLight2.powerOff();
        smartLight3.powerOff();
        smartLight4.powerOff();

        // Bonus Logic: Explain (in one sentence) why you can add a SmartLight object to
        // an ArrayList<RemoteControl>. 

        /*
        We can add a SmartLight object to the ArrayList<RemoteControl> because it extends the SmartLight class. 
        
         */
    }

}
