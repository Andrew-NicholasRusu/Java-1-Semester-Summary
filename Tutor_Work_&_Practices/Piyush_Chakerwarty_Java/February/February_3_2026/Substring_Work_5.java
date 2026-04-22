package February.February_3_2026;

public class Substring_Work_5 {
    // Create a method that takes a string and returns the word count. The string will be a sentence. 
    // Examples: 
    // countWords("Just an example here move along") ➞ 6 
    // countWords("This is a test") ➞ 4 
    // countWords("What an easy task, right") ➞ 5 

    public static int countWords (String wordCount) {
        int count = 0;
        for (int i = 1; i <= wordCount.length; i++) {
            count = count + 1;            
        }
        return count;
    }
    public static void main(String[] args) {
        
    }
 
    
}
