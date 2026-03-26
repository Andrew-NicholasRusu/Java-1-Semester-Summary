import java.util.InputMismatchException;
import java.util.Scanner;

public class RobustCalculator {
    // 1. Setup: Create a new class named RobustCalculator. 
    // Create a Scanner object to read input.
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    // 2. The Loop: Initialize a boolean variable called isValidInput to false. 
    // Wrap your logic in a do-while loop that continues as long as !isValidInput.
    boolean isValidInput = false;
    do {

    // 3. The Try Block: Prompt the user to "Enter the numerator" and "Enter the denominator" as integers. 
    // Perform the division and print the result. If successful, set isValidInput = true. 
    try {
        int numerator;
        int denominator;
        System.out.println("Enter the numerator:");
        numerator = sc.nextInt();
        System.out.println("Enter the denominator:");
        denominator = sc.nextInt();
        int result = numerator / denominator;
        System.out.println("Result = " + result);
        isValidInput = true;

    // 4. Catch Block 1 (Arithmetic): Catch ArithmeticException. 
    // Print a friendly message: "Error: Cannot divide by zero. Please try again."     
    } catch (ArithmeticException e) {
        System.out.println("Error: Cannot divide by zero. Please try again.");
    
    // 5. Catch Block 2 (Input Mismatch): Catch InputMismatchException. Print: "Error: Please enter whole numbers only." 
    // Crucial step: Add scanner.nextLine(); inside this catch block to clear the bad input from the scanner buffer (just like in your notes!).
    } catch (InputMismatchException e) {
        System.out.println("Error: Please enter whole numbers only.");
        sc.nextLine();

    // 6. Finally Block: Add a finally block that prints "Attempt finished." 
    } finally {
        System.out.println("Attempt Finished");
    }
    } while (!isValidInput);

    }
}
