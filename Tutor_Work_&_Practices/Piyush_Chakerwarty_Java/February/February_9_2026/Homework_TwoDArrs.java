package February.February_9_2026;

import java.util.Scanner;

public class Homework_TwoDArrs {
    public static void main(String[] args) {
    
        // Which row has the largest sum in a 2D array?
        int[][] matrix = {
                {1, 2, 3}, 
                {4, 5, 6}, 
                {7, 8, 9}
            };
        int max = 0;
        int maxRow = 0;
        int sum = 0;
        for (int i = 0; i < matrix.length; i++) {
        sum = 0; // reset sum for each row 
            for (int j = 0; j < matrix[i]. length; j++) { // iterate through columns of the current row
                sum = sum + matrix[i][j]; // sum will add itself by the value of the current element in the row
                // sum = sum + matrix[i][0] + matrix[i][1] + matrix[i][2] for each row
                // For row 0: sum = 0 + 1 + 2 + 3 = 6
                // For row 1: sum = 0 + 4 + 5 +
                // For row 2: sum = 0 + 7 + 8 + 9 = 24
            }
            System.out.println(sum); // Prints the sum of each row (6, 15, 24)
            // Checking for maximum value and capturing the row with the max value
            if (sum > max) {
                maxRow = i; // Update maxRow to the current row index if the current sum is greater than the max
            }
        }
        System.out.println("Row with Maximum Sum: " + maxRow); // Row 2 has the largest sum (24)
    
        // Create an array of 4x3 size by taking integers as user input 
        int[][] array = new int[4][3];
        Scanner scannerInput = new Scanner(System.in);
        System.out.println("Enter 12 integers to fill a 4x3 array:"); // Prompt the user to enter 12 integers
        for (int row = 0; row < 4; row++) { // iterate through 4 rows
            for (int col = 0; col < 3; col++) { // iterate through 3 columns
                array[row][col] = scannerInput.nextInt();
            }
        }
        System.out.println("The 4x3 array you entered is:");
        for (int row = 0; row < 4; row++) { // iterate through 4 rows
            for (int col = 0; col < 3; col++) { // iterate through 3 columns
                System.out.print(array[row][col] + " "); // print the element followed by a space
            }
            System.out.println();
        }

        // find the sum of each border(first row, first column) of the 2D array of integers 
        // 2D array of integers
        int[][] border = {
            {7, 14, 21, 28, 35},
            {8, 16, 24, 32, 40},
            {9, 18, 27, 36, 45}
        };
        System.out.print("Summing border: ");
        int total = 0;
        for (int row = 0; row < border.length; row++) {
            for (int col = 0; col < border[row].length; col++) {
                // Check if we are in the first or last row, or first or last column
                if ((row==0 || row==(border.length-1) || // first or last row
                col==0 || col==(border[row].length-1))) { // first or last column
                    total += border[row][col]; // add to total
                }
            }
        }
        System.out.println("Sum of diagonal is: " + total); // Output the total sum of the border

        // Summing other areas
        // 2D array of integers
        int[][] otherArea = {
            {1, 2, 3, 4, 5},
            {6, 7, 8, 9, 10},
            {11, 12, 13, 14, 15},
            {16, 17, 18, 19, 20}
        };
        System.out.println("Summing other areas: ");
        int otherTotal = 0;
        for (int otherRow = 0; otherRow < otherArea.length; otherRow++) { // iterate through rows
            for (int otherCol = 0; otherCol < otherArea[otherRow].length; otherCol++) { // iterate through columns
                // Check if we are NOT in the first or last row, or first or last column
                if ((otherRow >= 1 && otherRow <= 3) && (otherCol >= 2 && otherCol <= 5)) { // not first or last row/column
                    // otherRow 1 to 2 (2nd and 3rd row)
                    // otherCol 1 to 3 (2nd to 4th column)
                    otherTotal += otherArea[otherRow][otherCol]; // add to total
                }
            }
        }
        System.out.println("Sum of diagonal is: " + otherTotal); // Output the total sum of the other areas

        // Take an integer as user input and display the row and column number of the value in the 2D array 
        int[][] userInputArray = {
            {2, 4, 6, 8}, // 8 = row 0, column 3
            {10, 12, 14, 16},
            {18, 20, 22, 24}, // 24 = row 2, column 3
            {26, 28, 30, 32},
            {34, 36, 38, 40}
        };
        System.out.println("Enter the value to search for:");
        Scanner input = new Scanner(System.in);
        int userValue = input.nextInt();
        for (int ROW = 0; ROW < userInputArray.length; ROW++) { // iterate through rows
            for (int COL = 0; COL < userInputArray[ROW].length; COL++) { // iterate through columns of the current row
                if (userInputArray[ROW][COL] == userValue) { // if the current element matches the user input value
                    // Output the row and column number where the value is found
                    System.out.println("Value found at row: " + ROW + ", column: " + COL);
                    return;
                }
            }
        }
        System.out.println("Value " + userValue + " not found in the array.");

        // find the minimum and maximum value in each row of the 2D array. 
        int[][] minMaxArray = {
            {5, 10, 15, 20, 25, 30},
            {3, 6, 9, 12, 15, 18},
            {4, 8, 12, 16, 20, 24},
            {8, 16, 24, 32, 40, 48}
        };
        System.out.println("Enter the row index to start searching for the max and min values (0-3):");
        Scanner scanner = new Scanner(System.in);
        int rowIt = scanner.nextInt();
        int maxArr = minMaxArray[rowIt][0]; // Initialize max to the first element of the specified row
        for (int row = 0; row < minMaxArray.length; row++) {
            for (int col = 0; col < minMaxArray[row].length; col++) {
                if (row==rowIt && minMaxArray[row][col] > maxArr) { // Check if we are in the specified row and if the current element is greater than the current max
                    maxArr = minMaxArray[row][col]; // Update max if the current element is greater
                }
            }
        }
        System.out.println("Maximum value in row " + rowIt + " is: " + maxArr);

        // Searching A 2D Array for a Specific Value
        int[][] searchArray = {
            {3, 6, 9, 12}, // 12 = row 0, column 3
            {15, 18, 21, 24},
            {27, 30, 33, 36}, // 36 = row 2, column 3
            {15, 18, 21, 24},
            {27, 30, 33, 36}
        };
        System.out.println("Enter the value to search for:");
        Scanner sc = new Scanner(System.in);
        int valueToFind = sc.nextInt();
        for (int r = 0; r < searchArray.length; r++) {
            for (int c = 0; c < searchArray[r].length; c++) {
                if (searchArray[r][c] == valueToFind) { // if the current element matches the user input value
                    // Output the row and column number where the value is found
                    System.out.println("Value found at row: " + r + ", column: " + c); // Output the row and column number where the value is found
                    return;
                }
            }
        }
        System.out.println("Value " + valueToFind + " not found in the array."); // Output if the value is not found in the array
    }
}
