package February.February_5_2026.Array_Homework;

public class Array_Homework_4 {
    // Write a function to check if an array contains a particular number. 
    // Examples:
    // check([1, 2, 3, 4, 5], 3) ➞ true 
    // check([1, 1, 2, 1, 1], 3) ➞ false 
    // check([5, 5, 5, 6], 5) ➞ true 
    // check([], 5) ➞ false 
    public static boolean check(int[] numbers, int target) {
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == target) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        // Arrays
        int[] numbers1 = {1, 2, 3, 4, 5};
        int[] numbers2 = {1, 1, 2, 1, 1};
        int[] numbers3 = {5, 5, 5, 6};
        int[] emptyArray = {};

        /**
         * Bonus Array Checks (NOT PART OF THE QUESTION, JUST SHOWN FOR PRACTICE)
         */

        int[] numbersBonus = {5, 10, 15, 20, 25, 25, 30, 40, 50, 50, 60, 75, 75, 80};
        int[] numbersBonus2 = {2, 4, 6, 8, 10, 12, 14, 16, 18, 20, 22, 24, 26, 28, 30};


        // Checking number section 
        // TO DO: Explain Piyush on the boolean method used here in arrays

        boolean identify = check(numbers1, 3); // used boolean because int and String can't be inverted
        System.out.println(identify); // True
        identify = check(numbers2, 3); 
        System.out.println(identify); // False
        identify = check(numbers3, 5); 
        System.out.println(identify); // True
        identify = check(emptyArray, 5); // Calling the identify method in an empty array
        System.out.println(identify); // False

        /**
         * Bonus Number Sections (NOT PART OF THE QUESTION, JUST SHOWN FOR PRACTICE)
         */

        System.out.println();
        System.out.println("Bonus Identifiers:");
        System.out.println("--------------------");
        identify = check(numbersBonus, 50); // True
        System.out.println(identify);
        identify = check(numbersBonus2, 17); // False
        System.out.println(identify);
    }
}
