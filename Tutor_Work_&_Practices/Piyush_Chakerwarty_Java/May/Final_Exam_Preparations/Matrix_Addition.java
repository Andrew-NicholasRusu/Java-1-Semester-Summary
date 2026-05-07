public class Matrix_Addition {
    // Write a method public static int[][] addMatrices(int[][] a, int[][] b) that performs matrix addition
    // The method should first check if both matrices have the same dimensions.
    // If they do, create and return a new matrix where each element result[i][j] = a[i][j] + b[i][j]
    // If they have different dimensions, return null.    
    public static int[][] addMatrices(int[][] a, int[][] b) {
        if (a.length != b.length || a[0].length != b[0].length) {
            return null; // Matrices have different dimensions
        }

        int[][] result = new int[a.length][a[0].length];

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[0].length; j++) {
                result[i][j] = a[i][j] + b[i][j];
            }
        }
        return result;
        }
        public static void main(String[] args) {
            // Test case 1: Valid matrices
            int[][] matrix1 = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
            };

            int[][] matrix2 = {
                {9, 8, 7},
                {6, 5, 4},
                {3, 2, 1}
            };

            int[][] result = addMatrices(matrix1, matrix2);

            if (result != null) {
                System.out.println("Result of matrix addition:");
                for (int i = 0; i < result.length; i++) {
                    for (int j = 0; j < result.length; j++) {
                        System.out.print(result[i][j] + " ");
                    }
                    System.out.println(); // space
                }
            } else {
                System.out.println("MAtrices cannot be added (dimenstions don't match)");
            }

            // Test case 2: MAtrices with different dimensions (should return null)
            int[][] matrix3 = {{1, 2}, {3, 4}};
            int[][] matrix4 = {{1, 2, 3}, {4, 5, 6}};

            int[][] badResult = addMatrices(matrix3, matrix4);

            if (badResult == null) {
                System.out.println("Cannot add matrices with different dimensions.");
        }
    }
}


