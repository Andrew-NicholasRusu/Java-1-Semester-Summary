import java.util.*;

public class EquipmentHashMap {
    public static void main(String[] args) {
        // Constructor for HashMap
        HashMap <String, Integer> equipmentMap = new HashMap<>(); // equipmentMap = name of the HashMap

        System.out.println("Let's manage the equipment from our shelter!");

        equipmentMap.put ("Wrenches", 10); // put() adds a key-value pair to the HashMap
        equipmentMap.put ("Screwdrivers", 15);
        equipmentMap.put ("Hammers", 5);
        equipmentMap.put ("Pliers", 8);
        equipmentMap.put ("Drills", 3);
        equipmentMap.put ("Ladders", 2);
        equipmentMap.put ("Paint Brushes", 20);
        equipmentMap.put ("Buckets", 12);
        // Whenever you make a hash or tree map, you use put instead of add when adding key-value pairs

        equipmentMap.containsKey("Dog Food"); // containsKey() checks if a specific key is in the HashMap and returns true or false
        equipmentMap.containsValue(10); // containsValue() checks if a specific value is in the HashMap and returns true or false
        System.out.println("Do we have ladders? " + equipmentMap.containsKey("Ladders")); // true
        System.out.println("Do we have dog food for our dog? " + equipmentMap.containsKey("Dog Food")); // false
        System.out.println("Do we have 10 wrenches? " + equipmentMap.containsValue(10)); // true
        System.out.println("Do we have 16 hammers? " + equipmentMap.containsValue(16)); // false

        System.out.println("Current equipment inventory: " + equipmentMap);
        System.out.println("The number of different types of equipment we have is: " + equipmentMap.size()); // size() returns the number of key-value pairs in the HashMap

        System.out.println("Let me get some screwdrivers for a project: " + equipmentMap.get("Screwdrivers"));
        System.out.println("Screwdrivers are no longer in my shelter: " + equipmentMap.remove("Screwdrivers") +
            "\nMy shelter now has: " + equipmentMap);
        


        // Bulk operations with initial capacity
        HashMap <String, Integer> animalProducts = new HashMap<>(5); // Constructor with initial capacity for the HashMap
        // inital capacity is the number of items in the HashMap. 
        // It is used to optimize the performance of the HashMap by reducing the number of rehashing operations needed as the HashMap grows.
        animalProducts.put("Dog Food", 50);
        animalProducts.put("Cat Food", 40);
        animalProducts.put("Bird Seed", 30);
        animalProducts.put("Fish Food", 20);
        animalProducts.put("Rabbit Food", 10);
        System.out.println("The 2nd HashMap has the following:" + animalProducts);

        // Default methods (Java 8 and later)

    }

}
