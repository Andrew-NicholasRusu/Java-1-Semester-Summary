import java.util.Scanner;
public class TwoD_Array_Summary {
    public static void main(String[] args) {
        
        // Initializing arrays with input values
        int[][] matrix = new int[10][10];

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter " + matrix.length + " rows and " + matrix[0].length + " columns: " );
        for (int row = 0; row < matrix.length; row++) {
            for (int column = 0; column < matrix[row].length; column++) {
                matrix[row][column] = sc.nextInt();
            }
        }

        // Initializing arrays with random values
        int[][] randomMatrix = new int [10][10];
        for (int r = 0; r < randomMatrix.length; r++) {
            for (int c = 0; c < randomMatrix[r].length; c++) {
                randomMatrix[r][c] = (int)(Math.random() * 100);
            }
        }

        // Printing arrays
        int[][] printArrays = new int [10][10];
        for (int line = 0; line < printArrays.length; line++) {
            for (int pillar = 0; pillar < printArrays[line].length; pillar++) {
                System.out.println(printArrays[line][pillar] + " ");
            }
            System.out.println();
        }

        // Summing all elements
        int[][] sumElements = new int[10][10];
        int total = 0;
        for (int arrayR = 0; arrayR < sumElements.length; arrayR++) {
            for (int arrayC = 0; arrayC < sumElements[arrayR].length; arrayC++) {
                total += sumElements[arrayR][arrayC];
            }
        }

        /*
        Summing Elements by Column
        */

        // Summing a given column:
        /// Method 1:
        int colGiven = sc.nextInt();
        int totalGiven = 0;
        for (int rowGiven = 0; rowGiven < matrix.length; rowGiven++) {
            totalGiven += matrix[rowGiven][colGiven];
        }

        /// Method 2:
        int[][] colGiven2 = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };
        System.out.print("Enter column index to sum: ");
        int COLGIVEN = sc.nextInt();
        int totalGiven2 = 0;

        for (int row = 0; row < matrix.length; row++) {
            totalGiven2 += matrix[row][COLGIVEN];
        }
        System.out.println("Sum of column " + COLGIVEN + " is: " + totalGiven2);


        // Summing by column
        int[][] columnMatrix = new int[10][10];
        for (int columnOnly = 0; columnOnly < columnMatrix[0].length; columnOnly++) {
            int columnTotal = 0;
            for (int rowWhat = 0; rowWhat < columnMatrix.length; rowWhat++) {
                columnTotal += columnMatrix [rowWhat][columnOnly];
                System.out.println("Sum for column " + columnOnly + " is " + columnTotal);
            }
        }

        /*
        Summing elements by row
        */

        // Summing a given row
        int[][] rowMatrix = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };
        System.out.println("Enter row index to sum: ");
        int rowGiven = sc.nextInt();
        int rowTotal = 0;

        for (int Col = 0; Col < rowMatrix[rowGiven].length; Col++) {
            rowTotal += rowMatrix[rowGiven][Col];
        }
        System.out.println("Sum of row " + rowGiven + " is: " + rowTotal);

        // Another approach using if
        System.out.print("Enter row index to sum (IF ADDITION): ");
        int rowGiven2 = sc.nextInt();
        int rowTotal2 = 0;
        for (int row  = 0; row < rowMatrix.length; row++) {
            for (int col = 0; col < rowMatrix[row].length; col++) {
                if (row == rowGiven) {
                    rowTotal2 += rowMatrix[rowGiven2][col];
                }
            }
        }
        System.out.println("Sum of row " + rowGiven2 + " is: " + rowTotal2);

        // Random Shuffling
        int[][] randomShuffle = new int[10][10];
        for (int i = 0; i < randomShuffle.length; i++) {
            for (int j = 0; j < randomShuffle[i].length; j++) {
                int i1 = (int)(Math.random() * matrix.length);
                int j1 = (int)(Math.random() * matrix[i].length);

                // Swap randomShuffle[i][j] with randomShuffle[i1][j1]
                int temp = randomShuffle[i][j];
                randomShuffle[i][j] = randomShuffle[i1][j1];
                randomShuffle[i1][j1] = temp;
            }
        }

        // Summing Diagonals Backwards
        System.out.print("Summing diagonal: ");
        int diagonalTotalBackward = 0;
        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[row].length; col++) {
                if (row == col) {
                    diagonalTotalBackward += matrix[row][col];
                }
            }
        }
        System.out.println("Sum of diagonal is: " + diagonalTotalBackward);

        // Summing Diagonals Forward
        System.out.print("Summing diagonal: ");
        int diagonalTotalForward = 0;
        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[row].length; col++) {
                if ((row == col) == N - 1) { // N is the size of the array
                    diagonalTotalForward += matrix[row][col];
                }
            }
        }
        System.out.println("Sum of diagonal is: " + diagonalTotalForward);

        // Summing other areas
        System.out.print("Summing diagonal: ");
        int diagonalOtherArea = 0;
        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[row].length; col++) {
                if ( ( row >= 1 && row <= 3) && (col >= 2 && col <= 5) ) {
                    diagonalOtherArea += matrix[row][col];
                }
            }
        }
        System.out.println("Sum of diagonal is: " + diagonalOtherArea);

        // Summing the boarder
        System.out.print("Summing diagonal: ");
        int boarderSum = 0;
        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[row].length; col++) {
                if ( ( row==0 || row==(N-1) || col==0) || col==(N-1) )  {
                    boarderSum += matrix[row][col];
                }
            }
        }
        System.out.println("Sum of diagonal is: " + boarderSum);

        // Finding minimum
        int min = matrix[0][0];
        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[row].length; col++) {
                if (matrix[row][col] < min) {
                    min = matrix[row][col];
                }
            }
        }
        System.out.println("Minimum value in the matrix is: " + min);

        // Finding maximum
        int max = matrix[0][0];
        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[row].length; col++) {
                if (matrix[row][col] > max) {
                    max = matrix[row][col];
                }
            }
        }
        System.out.println("Minimum value in the matrix is: " + max);

        // Finding minimum / maximum by row or col
        System.out.println("Enter the row index to start searching for the maximum value: ");
        int r = sc.nextInt();
        int maxRow = matrix[r][0];
        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[row].length; col++) {
                if (row==r && matrix[row][col] > max) {
                    maxRow = matrix[row][col];
                }
            }
        }
        System.out.println("Maximum value in the matrix row is: " + maxRow); // Can we make this more efficient?

        // Searching a 2D array
        System.out.print("Enter the value to search for: ");
        int value = sc.nextInt();
        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[row].length; col++) {
                if (matrix[row][col] == value) {
                    System.out.println("Value " + value + " found at position (" + row + ", " + col + ")");
                    return;
                }
            }
        }
        System.out.println("Value " + value + " not found in the matrix.");


    }
}
