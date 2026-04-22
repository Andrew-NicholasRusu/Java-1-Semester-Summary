package February.February_9_2026;

public class Ragged_Array_Practice_1 {
    // Ragged arrays are 2D arrays where each row can have a different length
    public static void main(String[] args) {
        // Ragged Array showcase
        int[][] raggedArray = {
            {1, 2, 3, 4, 5},
            {6, 7, 8, 9},
            {10, 11, 12},
            {13, 14},
            {15}
        };
        int total = 0;
        for (int row = 0; row < raggedArray.length; row++) {
            for (int col = 0; col < raggedArray[row].length; col++) {
                System.out.print(raggedArray[row][col] + " ");
                total = total + raggedArray[row][col]; // Calculates the total 
            }
            System.out.println();
            // 1 2 3 4 5 
            // 6 7 8 9 
            // 10 11 12 
            // 13 14 
            // 15 
        }   
        System.out.println(total); // 120
    }
}
