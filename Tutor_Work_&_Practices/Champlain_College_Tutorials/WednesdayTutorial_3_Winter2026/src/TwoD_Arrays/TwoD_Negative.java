package TwoD_Arrays;

/**
 * Write a method name countNegative that receives a 2D integer array and returns the number of negative values in the array.
 * The method should return 4
 */

public class TwoD_Negative {

    int[][] values = {
            {3, -1, 7},
            {-5, 9},
            {-2, -8}
    };

    public int countNegative(int[][] a) {
        int count = 0;
        for (int row = 0; row < a.length; row++) {
            for (int col = 0; col < a[row].length; col++) {
                if (a[row][col] < 0) {
                    count++;
                }
            }
        }
        return count;
    }
}
