package February.February_6_2026;

import java.util.Arrays;
public class Array_Work_1 {
    // Create a function to multiply all of the values in an array by the amount of values in the given array. 
    // Examples:
    // MultiplyByLength([2, 3, 1, 0]) ➞ [8, 12, 4, 0] 
    // MultiplyByLength([4, 1, 1]) ➞ ([12, 3, 3]) 
    // MultiplyByLength([1, 0, 3, 3, 7, 2, 1]) ➞  [7, 0, 21, 21, 49, 14, 7] 
    // MultiplyByLength([0]) ➞ ([0]) 
    public static int[] multiplyByLength(int[] numbers) {
        int[] result = new int[numbers.length];
        for (int i = 0; i < numbers.length; i++) {
            result[i] = numbers[i] * numbers.length;
        }
        return result;
    }

    public static void main(String[] args) {
        // Arrays
        int[] numberRow1 = {2, 3, 1, 0};
        int[] numberRow2 = {4, 1, 1};
        int[] numberRow3 = {1, 0, 3, 3, 7, 2, 1};
        int[] numberRow4 = {};

        /**
         * Bonus: Visual representation of the arrays
         */
        int[] numberRow5 = {1, 5, 6, 6, 6, 7, 7, 7, 7, 7};
        int[] numberRow6 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int[] numberRow7 = {10, 9, 8, 7, 6, 5, 4, 3, 2, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};

        // Visual representation of the arrays
        // Visual Studio Code helped me past this line, but I don't know how to do it on my own.
        // TO DO: Show this code to Piyush and ask him how to do it on my own.
        int[] multiply = multiplyByLength(numberRow1);
        System.out.println(Arrays.toString(multiply)); // [8, 12, 4, 0]
        multiply = multiplyByLength(numberRow2);
        System.out.println(Arrays.toString(multiply)); // [12, 3, 3]
        multiply = multiplyByLength(numberRow3);
        System.out.println(Arrays.toString(multiply)); // [7, 0, 21, 21, 49, 14, 7]
        multiply = multiplyByLength(numberRow4);
        System.out.println(Arrays.toString(multiply)); // []

        /**
         * Bonus: Visual representation of the arrays
         */

        // (java.util.Arrays.toString(multiply)) METHOD (same output just like the code on top)
        multiply = multiplyByLength(numberRow5);
        System.out.println(java.util.Arrays.toString(multiply)); // [10, 50, 60, 60, 60, 70, 70, 70, 70, 70]
        multiply = multiplyByLength(numberRow6);
        System.out.println(java.util.Arrays.toString(multiply)); // [10, 20, 30, 40, 50, 60, 70, 80, 90, 100]
        multiply = multiplyByLength(numberRow7);
        System.out.println(java.util.Arrays.toString(multiply)); // [120, 108, 96, 84, 72, 60, 48, 36, 24, 12, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]
      

        
    }
}
