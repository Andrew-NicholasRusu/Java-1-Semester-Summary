import java.util.InputMismatchException;
import  java.util.Scanner;

public class ExceptionExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean continueInput = true;
        do { 
            try {
            System.out.println("Enter 2 integers");
            int num1 = sc.nextInt();
            int num2 = sc.nextInt();
            System.out.println(num1 + " / " + num2 + " is " + num1/num2);
            continueInput = false;
            // If 0 was inputed as the second number, it will make an ArithmeticException error 
            // because we cannot divide any number by zero.

            // However, if we do the try and catch methods...
            } catch (ArithmeticException e) {
                System.out.println("Exception: an integer cannot be divide by zero.");
                // This will be printed out whenever the second number is 0, making an error no longer happen.

            // Solution to fix MismatchException
            } catch (InputMismatchException e) {
                System.out.println("EXCEPTION: Enter the value of appropriate data type.");
                sc.nextLine();

            // finally method:
            } finally { // ALWAYS executes — exception or not
                System.out.println("Execution Completed.");
            }
        } while (continueInput);      
        
        /*
        Exception Class Hierarchy
        */

        // Object
        // |__ Throwable
        // |__ Error    <- System Errors (JVM level)
        // |    |__ LinkageError
        // |    |__ VirtualMachineError
        // |    |__ ... many more
        // |
        // |
        // |__ Exception   <- Application-level errors
        //      |__ ClassNotFountException  <- Checked
        //      |__ IOException <- Checked
        //      |
        //      |__ RuntimeException  <- Unchecked
        //              |__ ArithmeticException
        //              |__ NullPointerException
        //              |__ IndexOutOfBoundsException
        //              |__ IllegalArgumentException
        //                      |__ NumberFormatException
        //              |__ InputMismatchException
        //              |__ ... many more
    }
}