package February.February_5_2026.Array_Practices;

public class Array_Practice_2 {
    // Create a function that takes an array containing only numbers and return the first element. 
    // Examples:
    // getFirstValue([1, 2, 3]) ➞ 1 
    // getFirstValue([80, 5, 100]) ➞ 80 
    // getFirstValue([-500, 0, 50]) ➞ -500 

    // Function For the class
    public static int getFirstValue(int[] numbers) {
        return numbers[0]; // Returns numbers from the first index (first element)
    }

    public static void main(String[] args) {
        int[] numbers = {1, 2, 3};
        int[] values = {80, 5, 100};
        int[] characters = {-500, 0, 50};
        int firstValue = getFirstValue(numbers); // 1
        System.out.println(firstValue);
        firstValue = getFirstValue(values); // 80
        System.out.println(firstValue);
        firstValue = getFirstValue(characters); // -500
        System.out.println(firstValue);

    }
}
