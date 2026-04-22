package February.February_6_2026;

public class Array_3 {
    // Create a function that searches for the index of a given item in an array. If the item is present, 
    // it should return the index, otherwise, it should return -1. 
    // Examples:
    // search([1, 2, 3, 4], 3) ➞ 2 
    // search([2, 4, 6, 8, 10], 8) ➞ 3 
    // search([1, 3, 5, 7, 9], 11) ➞ -1 
    public static int search(int[] numbers, int index) {
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == index) { // How can I remember this line?
                // By remembering what I need to do.
                return i; // Stores the index
            } 
        }
        return -1;
    }

    public static void main(String[] args) {
        int value = search(new int[]{1, 2, 3, 4}, 3); 
        System.out.println(value); // 2
        value = search(new int[]{2, 4, 6, 8, 10}, 8); 
        System.out.println(value); // 3
        value = search(new int[]{1, 3, 5, 7, 9}, 11); 
        System.out.println(value); // -1

        /**
         * Bonus searches
         */
        value = search(new int[]{4, 8, 12, 16, 20, 24, 28, 32, 36, 40}, 40);
        System.out.println(value); // 9
        value = search(new int[]{12, 24, 36, 48, 60, 72, 84, 96}, 60);
        System.out.println(value); // 4
        
    }

    
}
