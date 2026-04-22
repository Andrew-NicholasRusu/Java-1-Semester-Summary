package February.February_8_2026;

public class TwoDArrayPractice1 {
    // 2 rows and 3 columns
    public static void main(String[] args) {
        int[][] arr = {
            {1,2,3}, 
            {4,5,6}
        };

        System.out.println(arr[0][0]); // 1
        System.out.println(arr[0][1]); // 2
        System.out.println(arr[0][2]); // 3
        System.out.println(arr[1][0]); // 4
        System.out.println(arr[1][1]); // 5
        System.out.println(arr[1][2]); // 6

        // Traversing over the 2D array
        System.out.println();
        int[][] arrTraverse = {{1,2,3}, {4,5,6}}; // Same as arr but with a different name, and a different way to write it.
        for (int i = 0; i < 2; i++) {  // i < 2 because there are 2 rows in the array
            for (int j = 0; j < 3; j++) { // i < 3 because there are 3 columns in the array
                System.out.println(arrTraverse[i][j]);
                // 1 
                // 2
                // 3
                // 4 
                // 5
                // 6
            }
        }

        // Question: 
        // Let’s start with a 3 x 3 grid of integers representing a simple game board. 
        // Initialization: Create a 2D integer array called grid with 3 rows and 3 columns. 
        // Manual Assignment: * Place the number 5 in the very center of the grid. 
        // Place the number 1 in the top-left corner. 
        // Place the number 9 in the bottom-right corner. 
        // Access: Print the value located at grid[0][1]. Which position on the board does this represent? 
        System.out.println();
        int[][] grid = {
            {1,2,3},
            {4,5,6},
            {7,8,9}
        };
        for (int row = 0; row < 3; row++) { // you can also use grid.length instead of 3, because it will bring all the rows in the array
            for (int column = 0; column < 3; column++) { // you can also use grid[row].length instead of 3, because it will bring all the columns in the array
                System.out.println(grid[row][column]);
            }
        }
        System.out.println(grid[0][1]); // 2
        //grid[0][1] represents the number 2, which is located in the first row and second column of the grid.
        // This represents at the 2nd position on the board.

        // Write a nested loop to print the grid in a square format (3 rows of 3 numbers) 
        for (int row = 0; row < grid.length; row++) {
            for (int column = 0; column < grid[row].length; column++) {
                System.out.print(grid[row][column] + " ");
            }
            System.out.println(); // Prints 3 numbers per each row
        }

        // Write a program to calculate the sum of all numbers in a 3 x 3 array. 
        int total = 0;
        for (int row = 0; row < grid.length; row++) { // grid.length brings all the columns
            for (int column = 0; column < grid[row].length; column++) {
                total = total + grid[row][column]; // Adds all the arrays
                // total = itself + grid[row][column] is the same as total += grid[row][column]
                // why the total is like this because it will add the first number to the total, then it will add the second number to the total, 
                // and so on until it adds all the numbers in the array.
            }
        }
        System.out.println(total); // Prints the total of all rows and columns

        // Write a loop that calculates and prints the sum of each row individually. 
        for (int row = 0; row < grid.length; row++) {
            int sum = 0; // Creates a new sum for each row
            for (int column = 0; column < grid[row].length; column++) {
                sum = sum + grid[row][column];                
            }
            System.out.println(sum); // Prints the total for each row.
            // 1 + 2 + 3 = 6
            // 4 + 5 + 6 = 15
            // 7 + 8 + 9 = 24
        }
    }
}
