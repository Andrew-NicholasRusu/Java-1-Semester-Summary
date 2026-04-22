package February_3_2026;



import java.util.Scanner;
public class Substring_Practice {
    // Create a function that takes a string, checks if it has the same number of "x"s and "o"s and returns either True or False. 
        // Return a boolean value (True or False). 
        // Return True if the amount of x's and o's are the same. 
        // Return False if they aren't the same amount. 
        // The string can contain any character. 
        // When "x" and "o" are not in the string, return True. 
        // Examples:
            // XO("ooxx") ➞ True 
            // XO("xooxx") ➞ False 
            // XO("ooxXm") ➞ True 
            // # Case insensitive. 
            // XO("zpzpzpp") ➞ True 
            // # Returns True if no x and o. 
            // XO("zzoo") ➞ False 
    public static boolean XO(String str) {
        // Convert the string to lowercase for case-insensitive comparison
        str = str.toLowerCase();
        int xCount = 0;
        int oCount = 0;

        // Count x's and o's
        for (int i = 0; i <str.length(); i++) {
            char c = str.charAt(i);
            if (c =='x') {
                xCount++;
            } else if (c == 'o') {
                oCount++;
            }
        }
        // Return true if counts are equal.
        return xCount == oCount;
    }

    
    public static void main(String[] args) {
        // Create a function that takes in a word and determines whether or not it is plural. A plural word is one that ends in "s". 
        // is_plural("changes") ➞ True 
        // is_plural("change") ➞ False 
        // is_plural("dudes") ➞ True 
        // is_plural("magic") ➞ False 
        Scanner sc = new Scanner (System.in);
        System.out.println("Type a word that is in the plurals");
        String word = sc.next();
        System.out.println(word.endsWith("s")); // true

        /**
         * Test cases from the examples
         */
        // NEEDED AI IN HERE, SHOW IT TO PIYUSH FOR A BETTER UNDERSTANDING
        System.out.println("XO(\"ooxx\") " + XO("ooxx")); // true
        System.out.println("XO(\"xooxx\") "+ XO("xooxx")); // false
        System.out.println("XO(\"ooxXm\") " + XO("ooxXm")); // true

        
    

    }
}

 

 
