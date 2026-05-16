package Recursion;

/**
 * count how many decimal digits a number contains by stripping one digit per call.
 * Signature: public static int countDigits(int n)
 * Examples: countDigits(0) → 1, countDigits(758) → 3, countDigits(-1000) → 4
 * Constraint: treat 0 as one digit, use Math.abs, base case when |n| < 10
 */

public class CountTheDigits {
    public static int countDigits(int n) {
        int absN = Math.abs(n); // Returns the absolute value of n (removes the negative sign)
        if (absN < 10) { // Base case (single digit)
            return 1;
        } else { // Recursive case (remove last digit, add 1)
            return 1 + countDigits(absN / 10);
        }
    }

    public static void main(String[] args) {
        System.out.println("0 has a total of " + countDigits(0) + " digit.");     // 1
        System.out.println("758 has a total of " + countDigits(758) + " digit.");   // 3
        System.out.println("1000 has a total of " + countDigits(-1000) + " digit."); // 4

    }
}
