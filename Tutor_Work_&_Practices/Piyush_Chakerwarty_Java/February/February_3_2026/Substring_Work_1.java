package February.February_3_2026;

public class Substring_Work_1 {
    //  Create a function that takes a string (will be a person's first and last name) and returns a string with the first and last name swapped. 
    // Examples:
    // name_shuffle("Donald Trump") ➞ "Trump Donald" 
    // name_shuffle("Rosie O'Donnell") ➞ "O'Donnell Rosie" 
    // name_shuffle("Seymour Butts") ➞ "Butts Seymour" 

   public static String name_shuffle(String fullName) {
    int spaceIndex = fullName.indexOf(" ");
    String firstName = fullName.substring(0, spaceIndex);
    String lastName = fullName.substring(spaceIndex + 1);
    String shuffledName = lastName + " " + firstName;
    return shuffledName;
   }

   public static void main(String[] args) {

       System.out.println(name_shuffle("Donald Trump")); // "Trump Donald"
       System.out.println(name_shuffle("Rosie O'Donnell")); // "O'Donnell Rosie"
       System.out.println(name_shuffle("Seymour Butts")); // "Butts Seymour"

       /**
        * Extra Presidents (FOR FURTHER EVIDENCE)
        */
       System.out.println();
       System.out.println(name_shuffle("Barack Obama")); // "Obama Barack"
       System.out.println(name_shuffle("Vladimar Putin")); // "Putin Vladimar"
       System.out.println(name_shuffle("Justin Trudeau")); // Trudeau Justin



   }
}