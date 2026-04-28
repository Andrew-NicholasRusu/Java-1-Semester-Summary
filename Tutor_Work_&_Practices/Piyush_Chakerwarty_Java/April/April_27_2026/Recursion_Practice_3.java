public class Recursion_Practice_3 {
    public static int[] generateNumbers(int start, int end) {
        int length = end - start + 1;

        if (length <= 0) {
            // throw an exception
        }

        int[] numbers = new int[length];
        generateNumbers(start, end, 0, numbers);
        return numbers;
    }

    public static void generateNumbers(int start, int end, int index, int[] numbers) {
        if (start > end) {
            return;
        }
        numbers[index] = start;

        generateNumbers(start + 1, end, index + 1, numbers);
    }

    public static void main(String[] args) {
        
    }
    
}
