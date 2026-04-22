package February.February_17_2026.AnimalGroup;
import java.util.ArrayList;

public class AnimalMain {
    public static void main(String[] args) {
        
        Lion lion1 = new Lion("Lion", "Male", "Orange", 39000, false, "strength");
        Panda panda1 = new Panda("Panda", "Female", "Black & White", 1864, false, "Bamboo");
        WoollyMammoth woollymammoth1 = new WoollyMammoth("Woolly Mammoth", "Make", "Brown", 0, true, 10);

        // Used in the ArrayList
        Panda panda2 = new Panda("Red Panda", "Male", "Red and Black", 900, false, "Bamboo");

        System.out.println(lion1);
        System.out.println();
        System.out.println(panda1);
        System.out.println();
        System.out.println(woollymammoth1);
        System.out.println();

        // Overriding the Fun Facts!
        lion1.FunFact();
        panda1.FunFact();
        woollymammoth1.FunFact();

        System.out.println();
        // Overriding the other species!
        lion1.OtherSpecies();
        panda1.OtherSpecies();
        woollymammoth1.OtherSpecies();

        ArrayList<Animal> zoo = new ArrayList<>();
        zoo.add(lion1);
        zoo.add(panda1);
        zoo.set(1, panda2);      
    }
}
