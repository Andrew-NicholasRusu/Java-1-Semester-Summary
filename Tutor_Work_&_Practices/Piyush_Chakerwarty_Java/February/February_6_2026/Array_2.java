package February.February_6_2026;

import java.util.Arrays;
public class Array_2 {
    // Create a function that goes through the array, incrementing (+1) for each odd-valued number 
    // and decrementing (-1) for each even-valued number. 
    // Examples:
    // transform([1, 2, 3, 4, 5]) ➞ [2, 1, 4, 3, 6] 
    // transform([3, 3, 4, 3]) ➞ [4, 4, 3, 4] 
    // transform([2, 2, 0, 8, 10]) ➞ [1, 1, -1, 7, 9] 
    public static int[] transform(int[] numbers) {
        int[] result = new int[numbers.length]; // Creates a new array to store the results
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 == 0) { // Checks if the number is even
                result[i] = numbers[i] - 1; // Decrements by 1 if it's even
            } else {
                result[i] = numbers[i] + 1; // Increments by 1 if it's odd
            } // What's with the [i] in the line above? 
            // It means that it will check each number in the array and increment or decrement it accordingly.
        }
        return result;
    }

    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};
        int[] numbers2 = {3, 3, 4, 3};
        int[] numbers3 = {2, 2, 0, 8, 10};

        // Remember to use java.util.Arrays.toString() to print the array in a readable format.
        // TO DO: Ask Piyush how to print the array in a readable format without using java.util.Arrays.toString().

        /// You can also do Arrays.toString(result) if you import the Arrays method at the beginning of the code
        int[] result = transform(numbers);
        System.out.println(Arrays.toString(result)); // [2, 1, 4, 3, 6]
        result = transform(numbers2);
        System.out.println(Arrays.toString(result)); // [4, 4, 3, 4]
        result = transform(numbers3);
        System.out.println(Arrays.toString(result)); // [1, 1, -1, 7, 9]

        // java.util.Arrays.toString(result) will make the same output just like the code on top. 
    }



 
    
}
