package RestaurantClass;

import java.util.ArrayList;
public class RestaurantDemo {
    public static void main(String[] args) {

        // Create 2 sandwich objects
        ClubSandwich sandwich1 = new ClubSandwich("Wheat");
        ClubSandwich sandwich2 = new ClubSandwich("Rye");

        // Create 1 salad object
        GardenSalad salad = new GardenSalad("Balsamic");

        // Create an Arraylist of Preparable
        ArrayList<Preparable> list = new ArrayList<Preparable>();

        // Add the sandwich objects to the list
        list.add(sandwich1);
        list.add(sandwich2);
        // Add the salad object to the list
        list.add(salad);

        // Loop through the list and call the prepare() method on each object
        for (Preparable p : list) {
            // Call the toast() method on the sandwich object
            if (p instanceof ClubSandwich) {
                ((ClubSandwich) p).toast();
            }
            p.prepare();

            // OUTPUT:
            // Toasting the Wheat Sandwich... Adding turkey, lettuce, and tomato to the Wheat Sandwich.
            // Toasting the Rye Sandwich... Adding turkey, lettuce, and tomato to the Rye Sandwich.
            // Preparing a Garden Salad with Balsamic dressing.

        }
    }
}
