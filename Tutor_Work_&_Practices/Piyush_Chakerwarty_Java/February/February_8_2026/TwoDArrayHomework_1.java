package February.February_8_2026;

public class TwoDArrayHomework_1 {
    public static void main(String[] args) {
    // Question 1: Create a 2D array called matrix of 3x3 (3 rows and 3 columns) by taking integers as user input. 
    int[][] matrix = {
        {7, 14, 21},
        {8, 16, 24},
        {9, 18, 27}
    };
    System.out.println();

    // Question 2: You have a 10 x 10 matrix of integers. You need to find the sum of all elements in a specific row provided by the user.  
    // Task: Write the for loop logic that would calculate the total for rowGiven 
    int[][] rowMatrix = {
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
    // Specific User Input
    int rowGiven = 2; // User wants row 2, which is the 3rd row in Arrays.
    int total = 0;
    for (int row = 0; row < 10; row++) {
            total += rowMatrix[rowGiven][row];
        }
        System.out.println("Question 2 Answer:");
        System.out.println(total); // 3+6+9+12+15+18+21+24+27+30 = 165 as the output

    // Question 3: Task: Create a 2D array of integers (e.g., 3 x 3) and write a method that prints 
    // the sum of the diagonal (where the row index equals the column index). 
    // Expected Sample Run (for a 1-9 matrix): 
    // Matrix: 
    // 1 2 3 
    // 4 5 6 
    // 7 8 9 
    // Sum of diagonal is: 15 

    int[][] diagonalSum = {
        {1, 2, 3},
        {4, 5, 6},
        {7, 8, 9}
    };
    int diagonalTotal = 0;
    for (int i = 0; i < 3; i++) {
        for (int j = 0; j < 3; j++) {
            if (i == j) { // if the row is equal to the column 
                diagonalTotal = diagonalTotal + diagonalSum[i][j]; // diagonal total will add itself by the diagonal sum of 
                // the diagonal row and column.
            }
        }
    }
    System.out.println("Question 3 Answer:");
    System.out.println(diagonalTotal); // Prints the diagonal total (15)

    // Question 4: You have a 10 x 10 matrix of integers. You need to find the sum of all elements in a specific column provided by the user.  
    // Task: Write the for loop logic that would calculate the total for colGiven 
    int[][] columnMatrix = {
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
    int columnTotal = 0; // Total value
    // Column Total Change Below
    int columnGiven = 0; // User wants column 0, which is the 1st column in Arrays.
    for (int column = 0; column < 10; column++) {
            columnTotal += columnMatrix[columnGiven][column];
        }
        System.out.println("Question 4 Answer:");
        System.out.println(columnTotal); // 1+2+3+4+5+6+7+8+9=10 = 55 as the output
    }  
}  
