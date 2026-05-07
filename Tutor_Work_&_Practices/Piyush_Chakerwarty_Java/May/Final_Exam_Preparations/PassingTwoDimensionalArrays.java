import java.util.Scanner;

public class PassingTwoDimensionalArrays {
    public static void main(String[] args) {
    int[][] m = getArray(); // Get an array

    // Display sum of elements
    System.out.println("\nSum of all elements is " + sum(m));
    }

    public static int[][] getArray() {
        // Create a Scanner
        Scanner sc = new Scanner(System.in);

        // Enter array values
        int[][] m = new int[3][4];
        System.out.println("Enter " + m.length + " row and " + m[0].length + " columns: ");
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {
                m[i][j] = sc.nextInt();
            }
        }
        /** You can also use nested loop for better results: */
        // for (int[] row : m) {
        //     for (int i = 0; i < row.length; i++) {
        //         row[i] = sc.nextInt();
        //     }
        // }
        return m;
    }

    public static int sum(int[][] m) {
        int total = 0;
        for (int row = 0; row < m.length; row++) {
            for (int column = 0; column < m[row]. length; column++) {
                total += m [row][column];
            }
        }
        /** You can also use nested loop for better results: */
        // for (int[] row : m) {
        //     for (int value : row) {
        //         total += value;
        //     }
        // }
        return total;
    }
}
