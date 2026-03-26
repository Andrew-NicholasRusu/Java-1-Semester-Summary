import java.util.*;

public class TestIterator_and_ForEachTest {
    public static void main(String[] args) {
        // Using Iterator:
        Collection<String> collection = new ArrayList<>();
        collection.add("New York");
        collection.add("Atlanta");
        collection.add("Dallas");
        collection.add("Madison");

        Iterator<String> iterator = collection.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next().toUpperCase() + " ");
        }
        System.out.println(); // NEW YORK ATLANTA DALLAS MADISON

        // Using the forEach method:
        collection.forEach(e -> System.out.print(e.toUpperCase() + ""));
        // NEW YORK ATLANTA DALLAS MADISON
    }
}
