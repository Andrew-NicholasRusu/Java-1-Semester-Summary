package February.February_17_2026.InstrumentGroup;
import java.util.ArrayList;

public class InstrumentMain {
    public static void main(String[] args) {
        ThePiano piano1 = new ThePiano ("Steinway & Sons", "Steel", 88);
        TheGuitar guitar1 = new TheGuitar ("Fender", "Wood", false);
        TheDrum drum1 = new TheDrum("Tama", "Synthetics", "Snare");

        // Add an ArrayList of type Instrument
        ArrayList<Instrument> selection = new ArrayList<>();
        selection.add(piano1);
        selection.add(guitar1);
        selection.add(drum1);

        // Using toString to get 
        System.out.println(piano1);
        System.out.println(guitar1);
        System.out.println(drum1);
        System.out.println();

        // The Performance (The Loop): 
        // Write a for loop (or an enhanced for-each loop) that iterates through the array. 
        // Inside the loop, call the .playNote() method on each item. 
        // Observation: Notice how even though the items are stored in an Instrument array, 
        // each one "knows" to play its own specific sound (Piano, Guitar, or Drum). 
        for (int i = 0; i < selection.size(); i++) {
            selection.get(i).playNote();
        }
    }
}
