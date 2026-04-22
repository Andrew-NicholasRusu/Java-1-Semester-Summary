package February.February_5_2026.Array_Homework;

public class Array_Homework_2 {
    // Given an array and an index, return the value of the array with the given index. 
    // Examples:
    // valueAt([1, 2, 3, 4, 5, 6], 10 / 2) ➞ 6 
    // valueAt([1, 2, 3, 4, 5, 6], 8 / 2) ➞ 5 
    // valueAt([1, 2, 3, 4], 6.535355314 / 2) ➞ 4 

    public static int valueAt(int[] values, int index) {
        return values[index];
    }
    public static void main(String[] args) {
        int value = valueAt(new int[]{1, 2, 3, 4, 5, 6}, 10 / 2);
        System.out.println(value); // 6
        value = valueAt(new int[]{1, 2, 3, 4, 5, 6}, 8 / 2);
        System.out.println(value); // 5
        value = valueAt(new int[]{5, 10, 15, 20, 25, 30, 35, 40}, 20 / 4);
        System.out.println(value); // 30
        
    }
}
