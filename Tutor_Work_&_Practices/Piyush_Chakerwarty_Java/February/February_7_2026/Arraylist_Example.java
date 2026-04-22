package February.February_7_2026;

import java.util.ArrayList;

public class Arraylist_Example {
    public static void main(String[] args) {
        // Declaring an ArrayList:
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        // Adding elements to the ArrayList
        numbers.add(2);
        numbers.add(4);
        numbers.add(6);
        numbers.add(8);
        numbers.add(10);
        numbers.add(12);
        numbers.add(14);
        numbers.add(16);
        numbers.add(18);
        numbers.add(20);
        numbers.add(22);

        // Traversing over the ArrayList using for loop
        for (int i = 0; i < numbers.size(); i ++) {
            System.out.println(numbers.get(i));
        }
        
        // Removing elements to the ArrayList:
        numbers.remove(1); // Removes 4
        numbers.remove(5); // Removes 12
        // Replaces numbers for other numbers
        numbers.set(3, 45);
        numbers.set(6, 67);
        numbers.set(7, 420);
        // Access elements from ArrayList:
        System.out.println(numbers.get(2)); // 8
        // Gets the size of the ArrayList 
        System.out.println(numbers.size()); // size = 9
        // size = the number of elements in the ArrayList

        // Prints all numbers
        System.out.println(numbers);

        /**
         * PRACTICE QUESTION ON FRUITS
         */
        // Create an ArrayList of Strings called fruits and add 5 different fruits to it
        System.out.println();
        System.out.println("Fruit ArrayList Question");
        ArrayList<String> fruits = new ArrayList<String>();
        fruits.add("Banana");
        fruits.add("Grapes");
        fruits.add("Watermelon");
        fruits.add("Mango");
        fruits.add("Orange");
        // Print the third element in the list
        String thirdFruit = fruits.get(2); 
        System.out.println(thirdFruit);
        // change the second element to "Blueberry" 
        fruits.set(1, "Blueberry"); // Replaces Grape with Blueberry
        // remove the fourth element from the list 
        fruits.remove(3); // Removes Mango
        System.out.println(fruits);
        System.out.println(fruits.size()); // size = 4
    }
    
}
