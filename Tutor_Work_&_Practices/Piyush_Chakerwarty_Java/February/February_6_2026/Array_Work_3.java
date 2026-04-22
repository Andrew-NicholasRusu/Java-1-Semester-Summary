package February.February_6_2026;

public class Array_Work_3 {
    // Return the sum of all items in an array, where each item is multiplied by its index (zero-based). For empty arrays, return 0. 
    // Examples:
    // indexMultiplier([1, 2, 3, 4, 5]) ➞ 40 
    // // (1*0 + 2*1 + 3*2 + 4*3 + 5*4) 
    // indexMultiplier([-3, 0, 8, -6]) ➞ -2 
    // // (-3*0 + 0*1 + 8*2 + -6*3) 
    public static int indexMultiplier(int[] numbers) {
        int total = 0;
        for (int i = 0; i < numbers.length; i++) {
            total += numbers[i] * i; // Multiplies the number by its index
        }
        return total;
    }

    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};
        int[] numbers2 = {-3, 0, 8, -6};
        int[] emptyArray = {};

        int total = indexMultiplier(numbers);
        System.out.println(total); // 40
        total = indexMultiplier(numbers2);
        System.out.println(total); // -2
        total = indexMultiplier(emptyArray);
        System.out.println(total); // 0
    } 
}
