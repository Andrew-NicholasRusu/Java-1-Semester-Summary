package February.February_12_2026.Practice;

public class MainLaptopDetails {
    // This code serves as a practice to classes and objects in Java, 
    // specifically for a Laptop class with details such as brand, RAM, and color.
    public static void main(String[] args) {
        LaptopSide lap1 = new LaptopSide("Acer", 16, "Grey");
        LaptopSide lap3 = new LaptopSide("MSI", 32, "Deep Blue");

        System.out.println(lap1.getBrand());
        System.out.println(lap1.getRam());
        System.out.println(lap1.getColor());

        // Printing all details in one line
        System.out.println(lap1.getBrand() + ", " + lap1.getRam() + "GB, " + lap1.getColor());
        // Updating the laptop details
        lap1.setBrand("Dell"); // replaces Acer with Dell
        System.out.println(lap1.getBrand() + ", " + lap1.getRam() + "GB, " + lap1.getColor());
        
        // Adding another laptop
        LaptopSide lap2 = new LaptopSide("HP", 8, "Black");
        System.out.println(lap2.getBrand() + ", " + lap2.getRam() + "GB, " + lap2.getColor());
        lap2.setBrand("Apple"); // calls / gets only the brand / name
        lap2.setRam(32);
        lap2.setColor("Silver");
        // Printing updated details of lap2
        System.out.println(lap2.getBrand() + ", " + lap2.getRam() + "GB, " + lap2.getColor());

        // Using the toString method to print the details of lap3
        System.out.println(lap3); // gets the string representation of lap3 using the toString method
    }
}