package February.February_6_2026;

import java.util.Arrays;

public class Array_Work_2 {
    // Create a function that returns a converted array of boolean values from a given bit string. 
    // Basically, a bit character 1 is true, otherwise, it's false. 
    // Examples:
    // integerBoolean("0110") ➞ [false, true, true, false] 
    // integerBoolean("100101") ➞ [true, false, false, true, false, true] 
    // integerBoolean("10") ➞ [true, false] 
    // integerBoolean("001") ➞ [false, false, true] 
    public static boolean[] integerBoolean(String bitString) {
        boolean [] result = new boolean[bitString.length()]; // Create a boolean array to store the results
        for (int i = 0; i < bitString.length(); i++) {
            if (bitString.charAt(i) == '1') { // Show this to Piyush and ask him how to remember this line.
                result[i] = true; // true if the character is 1
            } else {
                result[i] = false; // false if the character is not 1
            }
        }
        return result; // Default return value if the string is empty or does not contain 1
        // Explain line 19 to Piyush. I don't understand why we need it, but it needs to be there for the code to work. 
        // I think it's because we need to return something if the string is empty or does not contain 1, but I'm not sure.
    }
    
    public static void main (String[] args) {
        // Arrays method help us to show the array.
        boolean[] result = integerBoolean("0110");
        System.out.println(Arrays.toString(result)); // (false, true, true, false)
        result = integerBoolean("100101");
        System.out.println(Arrays.toString(result)); // (true, false, false, true, false, true) 
        result = integerBoolean("10");
        System.out.println(Arrays.toString(result)); // (true, false)
        result = integerBoolean("001");
        System.out.println(Arrays.toString(result)); // (false, false, true)
        
        

    }
}
