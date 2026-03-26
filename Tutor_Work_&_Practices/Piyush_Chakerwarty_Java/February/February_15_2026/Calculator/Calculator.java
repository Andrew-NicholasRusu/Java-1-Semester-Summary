package February.February_15_2026.Calculator;

public class Calculator {
    // What is the difference between method overloading and method overriding?

    // Method overloading is when you have multiple methods with the same name but different parameters (different type, number, or order of parameters) 
    // within the same class. It allows you to perform similar operations with different types of data. 
    // For example, in the Calculator class, we have multiple multiply methods that are overloaded to handle different types of input (integers, doubles, etc.).


    // Method overriding, on the other hand, is when a subclass provides a specific implementation of a method that is already defined in its superclass. 
    // The method in the subclass has the same name, return type, and parameters as the method in the superclass. 
    // This allows the subclass to provide a specific behavior for that method. 
    // For example, in the Samsung class, we override the powerOn() method to provide a specific message for Samsung phones instead of the generic message from the Phone class.


    static int multiply(int a, int b) {
        return a * b; // This method multiplies two integers and returns the result as an integer.
    }

    static double multiply(double a, double b) {
        return a * b; // This method multiplies two doubles and returns the result as a double.
    }

    static double multiply (double a, int b) {
        return a * b; // This method multiplies a double and an integer, and returns the result as a double (due to type promotion).
    }

    static double multiply(double a, double b, double c) {
        return a * b * c; // This method multiplies three doubles and returns the result as a double.
    }

}
