package February.February_3_2026;

import java.util.Scanner;
public class Substring_Work_2 {
    // Write a function that validates whether two strings are identical. Make it case insensitive. 
    // Examples:
    // match("hello", "hELLo") ➞ true 
    // match("motive", "emotive") ➞ false 
    // match("venom", "VENOM") ➞ true 
    // match("mask", "mAskinG") ➞ false 

    public static boolean match (String str1, String str2) {
        /**
         * LINES 17 TO 27 USED AI AND I NEED FURTHER GUIDANCE TO THIS QUESTION
         * VERY UNCLEAR AND NEED FURTHER GUIDANCE FROM TUTOR
         */
        // Handle Null Cases 
        if (str1 == null && str2 == null) { // TO DO: Tell Piyush on how to use null cases for future projects
            return true;
        }

        // Can we use else statements for the function before the main method?
        if (str1 == null || str2 == null) {
            return  false;
        }

        // Compares strings ignoring the case
        return str1.equalsIgnoreCase(str2);
    }

    public static void main(String[] args) {
        // All done via the solutions found the notebook
        Scanner sc = new Scanner(System.in);
        String word1, word2;
        System.out.println("Print out 2 words / strings to see if they're identical");
        word1 = sc.next();
        word2 = sc.next();
        System.out.println("Both Numbers = " + match(word1, word2)); // Sees if both numbers numbers match 
    }
}
