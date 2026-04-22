package February.February_5_2026.Array_Practices;

import java.util.Arrays; // Import arrays to use the toString method in line 25

public class Array_Practice_1 {

    public static int total(int[] numbers) {
        int total = 0;
        for (int i = 0; i < numbers.length; i++) {
            total += i;
        }
        return total;
        
    }
    public static void main(String[] args) {
        String[] names = {"Andrew", "Piyush", "Alex", "John"};
        // Accessing all items from the array individually.
        System.out.println(names[0]); // Andrew
        System.out.println(names[1]); // Piyush
        System.out.println(names[2]); // Alex
        System.out.println(names[3]); // John
        // Any number after the third index will be an error.
        /// ERROR:
        // System.out.println(names[4]);
        System.out.println(Arrays.toString(names)); // Displays array as a string

        System.out.println(names.length); // 4
        // Better method for finding all indexes in an array

        // Accessing all elements form the array using a for loop.
        for (int i = 0 ; i < names.length; i++) {
            System.out.println(names[i]);
        }

        // Calling/invoking/executing the function / method
        int[] numbers = {2, 4, 6, 8, 10}; // Declaring an Array
        int sum = total(numbers);
        System.out.println("Total = " + sum);



    }
}
