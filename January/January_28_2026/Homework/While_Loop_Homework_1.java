// Write a program that repeatedly prompts the user to enter a string. 
// The program should continue to accept input until a string that starts with the # character is entered. 
// At that point, the program should print the total number of strings that were entered, including the terminating string. 
import java.util.Scanner;

public class While_Loop_Homework_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String character = "#";
        int count = 1;

        System.out.println("Enter a string:");
        String string = sc.next();
        
        while(!string.equals(character)) {
            System.out.println("Continue entering strings:");
            string = sc.next();
            count = count + 1;
            
        }
        System.out.println(+ count + " strings were entered.");
    }
}
