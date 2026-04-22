package February.February_5_2026.Array_Homework;

public class Array_Homework_1 {
    // Create a method that accepts an array and returns the last item in the array. 
    // Examples:
    // getLastItem([1, 2, 3]) ➞ 3 
    // getLastItem([0]) ➞ 0 
    // getLastItem([-1, -3]) ➞ -3 
    public static int getLastValue(int[] numbers) {
        // TO DO: Ask Piyush about line 11 and how I can use it again to remember it.
        // Line 12 was the only line used by AI to help find return the last item
        return numbers[numbers.length - 1];
    }

    public static void main(String[] args) {
        // Arrays
        int[] numbers1 = {1, 2, 3}; // Always gets the last digit
        int[] numbers2 = {0};
        int[] numbers3 = {-1, -3};

        /**
         * Practice Arrays (TO UNDERSTAND MORE OF THE CODE)
         */
        int[] numbersBonus = {3, 6, 9, 12, 15, 18, 21, 24, 27, 30, 33, 36, 39, 42};
        int[] numbersBonus2 = {100, 200, 300, 400, 500, 600, 700, 800, 900, 1000};
        int[] numbersBonus3 = {25, 50, 75, 100, 120, 140, 160, 180, 200};

        int lastValue = getLastValue(numbers1); 
        System.out.println(lastValue); // 3
        lastValue = getLastValue(numbers2); 
        System.out.println(lastValue); // 0
        lastValue = getLastValue(numbers3); 
        System.out.println(lastValue); // -3

        /**
         * Practice Functions (TO UNDERSTAND MORE OF THE CODE)
         */

        lastValue = getLastValue(numbersBonus);
        System.out.println(lastValue); // 42
        lastValue = getLastValue(numbersBonus2);
        System.out.println(lastValue); // 1000
        lastValue = getLastValue(numbersBonus3);
        System.out.println(lastValue); // 200

    }
}
