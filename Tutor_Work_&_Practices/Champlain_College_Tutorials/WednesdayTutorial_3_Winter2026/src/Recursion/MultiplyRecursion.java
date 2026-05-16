package Recursion;

/**
 * Find the Factorial of a number. return n! by multiplying n with the factorial of n-1. You must identify the stopping point and guard against invalid input.
 * Signature: public static long factorial(int n)
 * Examples: factorial(0) → 1, factorial(5) → 120
 * Constraint: throw IllegalArgumentException if n < 0, base case is n == 0
 */

public class MultiplyRecursion {
    public static long factorial (int n) {
        if (n < 0) { // error case
            throw new IllegalArgumentException();
        } else if (n == 0) {  // error case
            throw new IllegalArgumentException();
        } else if (n == 1) { // base case
            return 1;
        } else {
            return n * factorial(n - 1);
        }
    }

    // error case: defines an error
    // base case: exemplifies the default

    public static void main(String[] args) {
        System.out.println("Factorial of 5 is " + factorial(5));
        System.out.println("Factorial of 4 is " + factorial(4));
    }
}
