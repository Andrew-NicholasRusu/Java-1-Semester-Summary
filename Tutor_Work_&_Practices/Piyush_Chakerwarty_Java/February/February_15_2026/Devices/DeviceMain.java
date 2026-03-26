package February.February_15_2026.Devices;

public class DeviceMain {
    public static void main(String[] args) {
        
    // Task 1 (Test Overloading): Create a Samsung object. Use it to call a contact by name, and then use it to dial a phone number.
    Samsung device1 = new Samsung("Samsung");
    device1.makeCall("Alice"); // Calling Alice...
    device1.makeCall(1234567890); //calling 1234567890...
    // Self-Check: Notice how the same method name makeCall works for both types of input. 

    // Task 2 (Test Overriding): Call the powerOn() method on your Samsung object. 
    device1.powerOn(); // Samsung Galaxy: Securely booting with Knox...
    // Self-Check: Does it print the generic "Phone" message or the specific "Samsung" message? 

    // Task 3 (Inheritance): Use the getBrand() method (inherited from Phone) to display the phone's brand. 
    System.out.println("Brand: " + device1.getBrand()); // Brand: Samsung
    // Self-Check: Does it correctly show "Samsung" as the brand?
    }
}
