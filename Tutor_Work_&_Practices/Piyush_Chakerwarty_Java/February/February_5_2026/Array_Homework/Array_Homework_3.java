package February.February_5_2026.Array_Homework;

public class Array_Homework_3 {
    // Create a function that takes an array and returns the sum of all numbers in the array. 
    // Examples:
    // sum([2, 7, 4]) ➞ 13 
    // sum([45, 3, 0]) ➞ 48 
    // sum([-2, 84, 23]) ➞ 105 

    public static int sum(int[] addAll) {
        int total = 0;
        for (int i = 0; i < addAll.length; i++) {
            total += addAll[i]; // Used to add all arrays in the main method
        }
        return total;
    }
    

    public static void main(String[] args) {
        // Arrays
        int[] numbers1 = {2, 7, 4};
        int[] numbers2 = {45, 3, 0};
        int[] numbers3 = {-2, 84, 23};
        int addition = sum(numbers1); // Calling the addition method
        System.out.println(addition); // 13
        addition = sum(numbers2);
        System.out.println(addition); // 48
        addition = sum(numbers3);
        System.out.println(addition); // 105
    }
}
