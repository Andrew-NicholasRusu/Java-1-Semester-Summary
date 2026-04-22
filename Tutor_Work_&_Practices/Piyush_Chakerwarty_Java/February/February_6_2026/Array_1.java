package February.February_6_2026;

public class Array_1 {
    // Create a function that takes in an array of numbers and returns the sum of its cubes. 
    // Examples:
    // sumOfCubes([1, 5, 9]) ➞ 855 
    // // Since 1^3 + 5^3 + 9^3 = 1 + 125 + 729 = 855 
    // sumOfCubes([3, 4, 5]) ➞ 216 
    // sumOfCubes([2]) ➞ 8 
    // sumOfCubes([]) ➞ 0 
    public static int sum(int[] powerOfThree) { // Created a method that takes in an array of numbers and returns the sum of its cubes
        // sum(int[] powerOfThree) is the method that takes in an array of numbers and returns the sum of its cubes
        // How to remember this method is to think of it as a way to sum the cubes of the numbers in the array.

        int total = 0;
        for (int i = 0; i < powerOfThree.length; i++) {
            total += powerOfThree[i] * powerOfThree[i] * powerOfThree[i]; // Used to add all arrays in the main method 
            // Multiplied by 3 times to get the answers at the main
        }
        return total;
    }

    public static void main(String[] args) {
        int[] numbers1 = {1, 5, 9};
        int[] numbers2 = {3, 4, 5};
        int[] number1 = {2};
        int[] noNumber = {};
        int squareThree = sum(numbers1);
        System.out.println(squareThree); // 855
        squareThree = sum(numbers2);
        System.out.println(squareThree); // 216
        squareThree = sum(number1);
        System.out.println(squareThree); // 8
        squareThree = sum(noNumber);
        System.out.println(squareThree); // 0


        
    }
}
