package February.February_3_2026;

public class Substring_Examples {
    public static void main(String[] args) {
        // Substring examples
        String s = "Andrew-Nicholas Rusu";
        System.out.println(s.substring(7));
        // Nicholas Rusu
        System.out.println(s.substring(0, 6));
        // Andrew

        // concat Example
        String firstName = "Silvia";
        String lastName = "Rusu";
        System.out.println(firstName.concat(lastName)); // concat method
        // SilviaRusu
        System.out.println(firstName + "" + lastName); // + method
        // Silvia Rusu


        // indexOf and lastIndexOf Example
        String text = "Andrew is Awesome";
        System.out.println(text.indexOf("A")); // 0
        System.out.println(text.lastIndexOf("A")); // 10
        System.out.println(text.lastIndexOf("P")); // -1

        // What else could you use the indexOf method in Java?
        // You could use the indexOf method to find the position of a specific character or substring
        // within a larger string, which can be useful for tasks such as parsing or searching for specific information in a text.
        // Example:
        String sentence = "The quick brown fox jumps over the lazy dog";
        String wordToFind = "fox";
        int index = sentence.indexOf(wordToFind);
        if (index != -1) {
            System.out.println("The word " + wordToFind + " is found at index: " + index);
        } else {
            System.out.println("The word " + wordToFind + " is not found in the sentence.");
        }

        // Equals Example
        String name = "Ludovic";
        String anotherName = "Ludovic";
        String yetanotherName = "Darius";
        System.out.println(name.equals(anotherName));
        System.out.println(name.equals(yetanotherName));

        //equalsIgnoreCase Example
        String name1 = "Andrew";
        String name2 = "andrew";

        System.out.println(name1.equals(name2)); // false
        System.out.println(name1.equalsIgnoreCase(name2)); // true

        // UpperCase and LowerCase Example
        String capital = "Raymond";
        String word = "boat";
        System.out.println(capital.toLowerCase());
        System.out.println(word.toUpperCase());

        // trim() Example
        String food = "         Burger          ";
        System.out.println(food.trim()); // Output with no spaces
        System.out.println(food); // Output with spaces

        // replace() Example
        // returns a new string where all instances of old characters will be replaced by the new characters. 
        String hall = "hall";
        System.out.println(hall.replace("l", "t")); // Returns a new string that 
        // means it will not affect the original string.

        // contains() Example
        // checks if the specified substring is present in the string or not.
        text = "Hamburger Cheeseburger Big Mac Whopper";
        System.out.println(text.contains("Hamburger")); // true
        System.out.println(text.contains("Pizza")); // false

        // What else could you use the contains method in Java?
        // You could use the contains method to check if a certain word or phrase is present in a larger string, such as checking if a user's input 
        // contains a specific keyword or if a document contains a certain term.
        // Example:
        String userInput = "I would like to order a pizza";
        if (userInput.contains("pizza")) {
            System.out.println("User wants to order a pizza.");
        } else {
            System.out.println("User does not want to order a pizza.");
        }
            

        // startsWith() Example
        // checks and returns true if the string starts with the specified substring or not
        String grandma = "Anica Rusu"; 
        System.out.println(grandma.startsWith("Anica"));// true  
        System.out.println(grandma.startsWith("A")); // true  

        // endsWith() Example
        // checks and returns true if the string ends with the specified substring or not 
        String user = "Dwane Rock Johnson";
        System.out.println(user.endsWith("Johnson")); // true 
        System.out.println(user.endsWith("n")); // true
        System.out.println(user.endsWith("o")); // false
    }   
}
