package TwoD_Arrays;

import java.util.*;

public class TwoD_Exam_Review {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Creating an array
        int[][] matrix = { // matrix = name
                {1, 2, 3, 4, 5, 6, 7, 8, 9, 10},
                {2, 4, 6, 8, 10, 12, 14, 16, 18, 20},
                {3, 6, 9, 12, 15, 18, 21, 24, 27, 30},
                {4, 8, 12, 16, 20, 24, 28, 32, 36, 40},
                {5, 10, 15, 20, 25, 30, 35, 40, 45, 50},
                {6, 12, 18, 24, 30, 36, 42, 48, 54, 60},
                {7, 14, 21, 28, 35, 42, 49, 56, 63, 70},
                {8, 16, 24, 32, 40, 48, 56, 64, 72, 80},
                {9, 18, 27, 36, 45, 54, 63, 72, 81, 90},
                {10, 20, 30, 40, 50, 60, 70, 80, 90, 100}
        };

        // Finding Minimum:
        int min = matrix[0][0];
        for (int r = 0; r < matrix.length; r++) {
            for (int c = 0; c < matrix[r].length; c++) {
                if (matrix[r][c] < min) {
                    min = matrix[r][c]; // calculating minimum
                }
            }
        }
        System.out.println("Minimum value in the matrix is: " + min);

        // Finding Maximum
        int max = matrix[0][0];
        for (int r = 0; r < matrix.length; r++) {
            for (int c = 0; c < matrix[r].length; c++) {
                if (matrix[r][c] > max) {
                    max = matrix[r][c]; // calculating maximum
                }
            }
        }
        System.out.println("Maximum value in the matrix is: " + max);

        // Finding total
        int total = 0;
        for (int r = 0; r < matrix.length; r++) {
            for (int c = 0; c < matrix[r].length; c++) {
                total += matrix[r][c];
            }
        }
        System.out.println("Total sum of the matrix is: " + total);

        // Finding sum per any row
        int total2 = 0; // make it total2 to reset the total from the previous method
        System.out.println("Now, give me a row index, and I will sum only that in return: ");
        int rowGiven = sc.nextInt();

        for (int c = 0; c < matrix[rowGiven].length; c++) {
            total2 += matrix[rowGiven][c];
        }
        System.out.println("Sum of row " + rowGiven + " is: " + total2);

        // Finding sum per any column
        int total3 = 0; // make it total3 to reset the total from the previous method
        System.out.println("Now, give me a column index, and I will sum only that in return: ");
        int columnGiven = sc.nextInt();

        for (int r = 0; r < matrix[columnGiven].length; r++) {
            total3 += matrix[columnGiven][r];
        }
        System.out.println("Sum of column " + columnGiven + " is: " + total3);

        // Finding the sum of a forward diagonal
        System.out.println("Summing diagonal: ");
        int diagonalTotal = 0;
        if (matrix.length == matrix[0].length) {
            int N = matrix.length;
            for (int r = 0; r < matrix.length; r++) {
                for (int c = 0; c < matrix[r].length; c++) {
                    if ((r + c) == N - 1) {
                        diagonalTotal += matrix[r][c];
                    }
                }
            }
            System.out.println("Sum of diagonal is: " + diagonalTotal);
        } else {
            System.out.println("Matrix is not square; diagonal sum is undefined.");
        }

        // Finding overall
        int overallTotal = 0;

        for (int[] row : matrix) {
            for (int value : row) { // using nested loop to me more cleaner
                overallTotal += value;
            }
        }
        System.out.println("The overall total of the array is " + overallTotal);


    }
}
