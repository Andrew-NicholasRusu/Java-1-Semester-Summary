package February.February_15_2026.Devices;

public class Phone {
    // Attribute
    private String brand;

    // Constructor: Initialize the brand.
    public Phone(String brand){
        this.brand = brand;
    }

    // Getter and Setter
    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    // Method Overloading:
    // Create a method makeCall(String name). It should print: "Calling [name]..." 

    public void makeCall(String name) {
        System.out.println("Calling " + name + "...");
    }
    // Create a second method makeCall(int number). It should print: "Dialing [number]..." 
    
    public void makeCall(int number) {
        System.out.println("Dialing " + number + "...");
    }

    // Method to be Overridden:
    // Create a method powerOn(). It should print: "Phone is starting up..."
    
    public void powerOn() {
        // This method will be overridden in the Samsung class to provide 
        // a specific message for Samsung phones.
        System.out.println("Phone is starting up...");
    }

        

    
    
}
