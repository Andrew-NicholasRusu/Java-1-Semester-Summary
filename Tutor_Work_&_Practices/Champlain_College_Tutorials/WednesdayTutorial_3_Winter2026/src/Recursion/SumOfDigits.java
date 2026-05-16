package Recursion;

// Find sum of digits of a number. add the last digit to the sum of the remaining digits. Work with absolute value so negatives behave the same.
// Signature: public static int sumDigits(int n)
// Examples: sumDigits(123) → 6, sumDigits(-49) → 13, sumDigits(0) → 0
// Constraint: base case when |n| < 10, no loops or string conversion

public class SumOfDigits {

    public static int sumDigits (int n) {
        n = Math.abs(n);

        if (n < 10) { // base case
            return n;
        }
        // Recursive case
        return (n % 10) + sumDigits(n / 10);
    }

    public static void main(String[] args) {
        System.out.println("Sum of 1, 2, and 3 is " + sumDigits(123));
        System.out.println("Sum of -4, and 9 is " + sumDigits(-49));
        System.out.println("Sum of 0 is " + sumDigits(0));
    }
}
