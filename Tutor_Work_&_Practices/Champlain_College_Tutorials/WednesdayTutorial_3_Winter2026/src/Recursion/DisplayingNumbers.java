package Recursion;

/**
 * Convert the following iterative method into a recursive method.
 * public static void diplayNumbers(int n) {
 *     while (n <= 5) {
 *         System.out.println(n);
 *         n++;
 *     }
 *}
 */

public class DisplayingNumbers {
    public static void displayNumbers(int n) {
        if (n > 5) { // error case
            return;
        }
        if (n < 0) { // base case
            System.out.println("No value below 0");
            return;
        } else { // function case
            System.out.println(n);
            displayNumbers(n + 1);
            // displayNumbers(++n); (also works)
        }
    }

    public static void main(String[] args) {
    }
}
