import java.util.HashMap;
import java.util.Map;

public class HashmapTest_number2 {

    public static void main(String[] args) {
        String input = "programming";

        HashMap<Character, Integer> charMap = new HashMap<>();

        // run the loop over the String to access each character
        for (char c: input.toCharArray()) {
            // check if the character is present as a key in the hash map
            if (!charMap.containsKey(c)) {
                // if it is present, get the current value of the key
                int currentCount = charMap.get(c);
                // update the count by 1
                charMap.put(c, currentCount + 1);
            } else {
                // if the key is not present, then create a new key valye pair with key as the character and value as 1.
                charMap.put(c, 1);
            }
        }
        // Display in the key value pair created in the hash
        // Display the character frequencies
         for (Map.Entry<Character, Integer> entry: charMap.entrySet()) { 
            System.out.println(entry.getKey() + " - " + entry.getValue()); 
        }
    }
}
