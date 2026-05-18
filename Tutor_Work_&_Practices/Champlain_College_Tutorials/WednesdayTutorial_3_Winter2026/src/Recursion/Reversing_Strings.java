package Recursion;

/**
 * What is needed: move the first character to the end after reversing the rest.
 * Signature: public static String reverse(String s)
 * Examples: reverse("abc") → "cba", reverse("a") → "a", reverse("") → ""
 * Constraint: base case length ≤ 1, no StringBuilder.reverse, build with concatenation
 */

public class Reversing_Strings {
    public static String reverse(String s) {
        // Base case
        if (s.length() <= 1) {
            return s;
        }
        // Recursive case
        char lastChar = s.charAt(s.length() - 1);
        String rest = s.substring(0, s.length() - 1);
        return lastChar + reverse(rest);
    }

    public static void main(String[] args) {
        System.out.println(reverse("abc"));
        System.out.println(reverse("Java"));
        System.out.println(reverse("Pizza"));
        System.out.println(reverse("Andrew"));
        System.out.println(reverse("Tiramisu"));
        System.out.println(reverse("Spaghetti"));
        System.out.println(reverse("A"));
        System.out.println(reverse(""));
        System.out.println(reverse("abcdefghijklmnopqrstuvwzyz"));
    }
}
