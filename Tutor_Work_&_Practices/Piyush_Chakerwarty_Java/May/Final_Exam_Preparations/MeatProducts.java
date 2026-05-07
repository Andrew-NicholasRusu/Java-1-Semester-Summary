import java.util.ArrayList;

public class MeatProducts {
    public static void main(String[] args) {
        ArrayList<String> meatSelections = new ArrayList<>();
        meatSelections.add("Pork");
        meatSelections.add("Beef");
        meatSelections.add("Ham");
        meatSelections.add(1, "Duck");
        meatSelections.add(0, "Buffalo");
        meatSelections.add(5, "Bison");
        System.out.println("Welcome to our meat store! We have a total of " + meatSelections.size() + " options to choose from.");
        System.out.println("We have: " + meatSelections);

        // use the set(index, element) method to replace an item at a specific index.
        System.out.println("Thanks for buying " + meatSelections.get(1) + "!");
        meatSelections.set(1, "Chicken");
        System.out.println("We just ran out of pork, but restocked something new!");
        System.out.println("We now have: " + meatSelections + "\nWant to buy anything else?");

        // use the remove(index) method to delete the second item in the list
        meatSelections.remove(3);
        meatSelections.remove(4);
        System.out.println("Oops! Sorry, but some meat went expired!");
        System.out.println("We now-now have: " + meatSelections);

        // write an enhanced for loop to iterate through the list and print each item's description and units
        for (String meat : meatSelections) {
            System.out.println("We have " + meat + " in stock for a limited time only!");
        }
    }
}
