package Recursion;

// What is needed: add the last considered element arr[n-1] to the sum of the first n-1 elements.
// Signature: public static int sumArray(int[] arr, int n)
// Examples: sumArray(new int[]{1,2,3}, 3) → 6, sumArray(new int[]{5}, 1) → 5, sumArray(new int[]{4,4}, 0) → 0
// Constraint: 0 ≤ n ≤ arr.length, base case n == 0 returns 0, do not use a loop or extra index parameter

public class Summing_First_n_Elements {
    public static int sumArray(int[] arr, int n) {
        // Validate input
        if (n < 0 || n > arr.length) {
            System.out.println("Error: n must be between 0 and " + arr.length);
            return -1;
        }
        // Base case
        if (n == 0) {
            return 0;
        } else {
            // Recursive case
            return arr[n - 1] + sumArray(arr, n - 1);
        }
    }

    public static void main(String[] args) {
        // Test case 1
        int[] array1 = {1, 2, 3};
        System.out.println("Array: [1,2,3]");
        System.out.println("Sum of first 3 elements: " + sumArray(array1, 3)); // 6
        System.out.println("Sum of first 2 elements: " + sumArray(array1, 2)); // 3
        System.out.println("Sum of first 1 element: " + sumArray(array1, 1));  // 1
        System.out.println("Sum of first 0 elements: " + sumArray(array1, 0)); // 0
        System.out.println(); // Space

        // Test case 2
        int[] array2 = {5};
        System.out.println("Sum of first 1 element [5]: " + sumArray(array2, 1)); // 5
        System.out.println(); // Space

        // Test case 3
        int[] array3 = {4, 4};
        System.out.println("Sum of first 0 elements [4,4]: " + sumArray(array3, 0)); // 0
        System.out.println("Sum of first 2 elements [4,4]: " + sumArray(array3, 2)); // 8
    }
}
