import java.util.*;

public class GroceryList {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        // Use arrayList for fast random access and frequent iteration.
        // Time Complexity:
            // O(1) for get/set
            // O(n) for insert(add) and delete(remove)

        System.out.println("Current Grocery List:");
        list.add("Milk"); // add() adds an item to the end of the list
        list.add("Meat");
        list.add(0, "Bread"); // Adds bread to the list at the first index
        list.add("Bananas");
        list.add("Tomatoes");
        list.add("Doritos");
        list.add(6, "Chocolate"); // Adds chocolate to the the list at the last index.

        System.out.println("Our gorcery list is " + list + "\nThe size of it is " + list.size());
        System.out.println("Oops! I need Pears instead of Bananas! Let me modify it: " + list.set(3, "Pears"));
        System.out.println("Our updated grocery list is:" + list);

        System.out.println("I just got bread and milk.");
        System.out.println(list.get(0));
        System.out.println(list.get(1));

        System.out.println("Let me remove them on my list:");
        list.remove(0);
        list.remove(1); // After removing the first item (Bread), the second item (Milk) will now be at index 1, so we remove it using index 1
        System.out.println("Our updated grocery list is:" + list);

        // Removing by using objects
        System.out.println("I just got Pears as well.");
        list.remove("Pears"); // After removing the first item (Pears), the list will automatically shift the remaining items to fill the gap, so we can remove it by using its name instead of index
        System.out.println("Our updated grocery list is:" + list);

        list.contains("Milk"); // contains() checks if a specific item is in the list and returns true or false
        System.out.println("Is Milk still in my list? " + list.contains("Milk"));

        list.indexOf(list); // indexOf() returns the index of the first occurrence of the specified element in this list, or -1 if this list does not contain the element.
        list.lastIndexOf(list); // lastIndexOf() returns the index of the last occurrence of the specified element in this list, or -1 if this list does not contain the element. If the list contains multiple occurrences of the element, the index of the last occurrence is returned.
        System.out.println("What is now my first and last item to buy? " + list.indexOf(list) + " and " + list.lastIndexOf(list));

        list.addAll(list); // addAll() adds all of the elements in the specified collection to the end of this list, in the order that they are returned by the specified collection's iterator.
        System.out.println("I just realized I need to buy everything twice! My updated grocery list is: " + list);

        list.addAll(5, list); // addAll() with index adds all of the elements in the specified collection into this list at the specified position.
        // Shifts the element currently at that position (if any) and any subsequent elements to the right (increases their indices).
        System.out.println("I need to buy everything twice again! My updated grocery list is: " + list);

        // Sublist and iteration example:
        System.out.println("I just want to buy the first 5 items on my list. Let me create a sublist for that:");
        list.subList(0, 5); // subList() returns a view of the portion of this list between the specified fromIndex, inclusive, and toIndex, exclusive.
        System.out.println("My sublist of the first 5 items is: " + list.subList(0, 5));
        System.out.println(); // Space    

        System.out.println("Let me check my grocery list using an iterator:");
        Iterator<String> iterator = list.iterator();
        list.listIterator(); // listIterator() returns a list iterator over the elements in this list (in proper sequence), starting at the specified position in the list. 
        // The specified index indicates the first element that would be returned by an initial call to next. An initial call to previous would return the element with the specified index minus one.
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        list.removeAll(list); // removeAll() removes from this list all of its elements that are contained in the specified collection.
        System.out.println("I just bought everything! My updated grocery list is: " + list);
        System.out.println("Is my grocery list empty? " + list.isEmpty()); // isEmpty() checks if the list is empty and returns true or false]
    }
}
