package February.February_9_2026;

public class ThreeDArrayPractice {
    public static void main(String[] args) {
        // Declare and initialize the size of the array
        // dataType[][][] varName = new dataType[3d_Size][rows][columns];

        int[][][] arr3d = new int[2][3][4];
        // 2 = number of 2D arrays present within the outer bracket.
        // 3 = number of rows in the 2D array.
        // 4 = number of columns or number of elements in each row

        // Declared and initialize the array.
        int[][][] threeDArray = { // 3D array
            {   // First 2D array
                {1, 2, 3, 4},
                {11, 22, 33, 44},
                {10, 20, 30, 40}

            },
            {   // Second 2D array
                {-1, -2, -3, -4},
                {-11, -22, -33, -44},
                {-10, -20, -30, -40}

            }
        };
        for (int d = 0; d < threeDArray.length; d++) {
            for (int row = 0; row < threeDArray[d].length; row++) {
                for (int col = 0; col < threeDArray[d][row].length; col++) {
                    System.out.println(threeDArray[d][row][col]);
                }
            } 
        }
    }
}
