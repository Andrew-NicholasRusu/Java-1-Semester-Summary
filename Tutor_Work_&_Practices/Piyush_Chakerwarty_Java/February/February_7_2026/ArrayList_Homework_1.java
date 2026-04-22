package February.February_7_2026;

import java.util.ArrayList;

public class ArrayList_Homework_1 {
    // Write a small program that does the following: 
    // Creates an ArrayList of String objects called inventory. 
    // Adds the items: "Hammer", "Saw", and "Wrench". 
    // Uses a for loop to print each item on a new line. 
    // Expected Sample Run: 
    // Hammer 
    // Saw 
    // Wrench 
    public static void main(String[] args) {
    // Creates an ArrayList of String objects called inventory
    ArrayList<String> inventory = new ArrayList<String>(); // <String> specifies that the ArrayList will hold String objects 
    // and new ArrayList<String>() creates a new instance of the ArrayList class that can hold String objects

    // Adds the items: "Hammer", "Saw", "Wrench"
    inventory.add("Hammer");
    inventory.add("Saw");
    inventory.add("Wrench");

    // The loop runs from i = 0 to i < inventory.size() (0, 1, 2 for 3 items)
    for (int i = 0; i < inventory.size(); i ++) {
            // inventory.get(i) retrieves the item at index i 
            System.out.println(inventory.get(i)); // Prints each item
        }

    // gadgetList ArrayList (Question 2)
    System.out.println();

    ArrayList<String> gadgetList = new ArrayList<String>();
    gadgetList.add("Laptop"); 
    gadgetList.add("Smartphone");
    gadgetList.add(1, "Tablet"); 
    gadgetList.set(0, "Smartwatch"); // Replaces Laptop with SmartWatch
    gadgetList.remove(2); // Removes Smartphone
    System.out.println(gadgetList);


    // Major Differences with ArrayList and Arrays
    // 1. Arrays have a fixed number of elements while ArrayList are dynamic (can be expanded or shrinked
    // EXAMPLE:

    // Arrays:
    String[] array = new String[3]; // Fixed size of 3 (cannot grow or shrink)
    
    // ArrayList:
    ArrayList<String> list = new ArrayList<>(); // Starts with default default
    list.add("Item"); // Automatically
    list.remove(0); // Can shrink / remove

    // 2. Arrays must manually track how many postions are filled while ArrayList automatically tracks its own size with the size() method
    // EXAMPLE:

    // Arrays:
    String[] manual = new String[10];
    manual[0] = "A"; // Size used: 1, but you must track this yourself
    manual[1] = "B"; // Size used; 2
    // No built-in way to know only 2 out of 10 positions are filled
    
    // ArrayList:
    ArrayList<String> automatic = new ArrayList<>();
    automatic.add("A"); // Size used: 1, but you must track this yourself
    automatic.add("B"); // Size used: 2
    }   
}

