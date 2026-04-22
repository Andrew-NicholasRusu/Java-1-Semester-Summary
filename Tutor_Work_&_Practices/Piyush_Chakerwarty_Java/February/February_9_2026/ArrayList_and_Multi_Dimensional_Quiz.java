package February.February_9_2026;

import java.util.ArrayList;

public class ArrayList_and_Multi_Dimensional_Quiz {
    public static void main(String[] args) {

        // Question 1:
        // Find the error

            // ArrayList<Integer> numbs = new ArrayList<>();
            // numbs.add(10); // index 0
            // numbs.add(20); // index 1
            // numbs.add(30); // index 2
            // System.out.println(numbs.get(3));

        // IndexOutOfBoundsException because we are trying to access an index that does not exist in the list 
        // (index 3 is out of bounds since the list has indices 0, 1, and 2).

        // Question 2:
        // Find the error (compile-time or runtime).

            // int[][] arr = new int[3][3];
            // arr[0] = {1, 2, 3};
            // arr[1] = {4, 5, 6};
            // arr[2] = {7, 8, 9};

        // The error is that we cannot assign values to a 2D array using curly braces after it has been declared.
        // To fix this, we should initialize the array with the values directly when declaring it:

        // Question 3:
        // Find the error 

            // ArrayList<String> names = new ArrayList<>();
            // names.add("John"); // index 0
            // names.add("Jane"); // index 1
            // names.remove(2);  // index 2 does not exist in the list
            // System.out.println(names.get(0)); // The output would be "John" if the code runs

        // The error is that we are trying to remove an element at index 2, which does not exist in the list.

        // Question 4:
        // What is the output?
        System.out.println("Question 4");
        int[][] matrixROW = {
            {5, 10, 15}, 
            {20, 25, 30}, // Array of 3 rows and 3 columns
            {35, 40, 45}
        }; 
        int sumPLS = 0;
        for(int i = 0; i < matrixROW[0].length; i++) { // Iterates through the first column (0) of the matrix
            sumPLS += matrixROW[0][i];
        }
        System.out.println(sumPLS); // The output is 30 (5 + 10 + 15)

        // Question 5:
        // What is the output?
        System.out.println("Question 5");
        ArrayList<Integer> list1 = new ArrayList<>();
        list1.add(1);
        list1.add(2);
        ArrayList<Integer> list2 = new ArrayList<>(list1); // Creates a new ArrayList (list2) that is a copy of list1
        list2.add(3); 
        System.out.println(list1.size() + " " + list2.size()); 
        // The output is "2 3" because list1 has 2 elements and list2 has 3 elements (1, 2, and 3).

        // Question 6:
        // Find the error

            // int[][] matrixERROR = {{1, 2, 3}, {4, 5, 6}};
            // for(int i = 0; i < matrixERROR.length; i++) {
            //     for(int j = 0; j < matrixERROR.length; j++) {
            //         System.out.print(matrixERROR[i][j] + " ");
            //     }
            // }
            
        // The error is that we are using matrixERROR.length to determine the number of columns, but the number of columns 
        // is actually determined by matrixERROR[i].length.

        // Question 7:
        // Find the error (what happens when this code runs)?

            // ArrayList<Integer> list = new ArrayList<>();
            // list.add(5);
            // list.add(10);
            // int sum = 0;
            // for(int i = 0; i <= list.size(); i++) {
            //     sum += list.get(i);
            // }

        // The error is that we are using <= in the loop condition, 
        // which will cause an IndexOutOfBoundsException when i equals list.size().

        // Question 8:
        // Find the error (what happens when this code runs)?

            // int[][] arr = {
            // {10, 20}, 
            // {30, 40}, 
            // {50, 60}
            // };
            // int total = 0;
            // for(int i = 0; i < arr.length; i++) {
            //     total += arr[2][i];
            // }

        // The error is that we are trying to access arr[2][i], which will cause an IndexOutOfBoundsException


        // Question 9
        // Find the error (logical or runtime).
        ArrayList<Double> prices = new ArrayList<>();
        prices.add(10.5);
        prices.add(20.0);
        double min = 0;
        for(int i = 0; i < prices.size(); i++) {
            if (prices.get(i) < min) {
                min = prices.get(i); 
        }
    }
        // The error is that min is initialized to 0, which is less than any price in the list.
        // To fix this, we should initialize min to the first element of the list:

        // Question 10
            // Find the error (what happens when this code runs)?
            ArrayList<Integer> numbers = new ArrayList<>();
            numbers.add(5); // index 0
            numbers.add(10); // index 1
            numbers.add(15); // index 2
            // THE LINE BELOW IS THE ERROR
            // numbers.set(3, 20);

        // The error is that we are trying to set an element at index 3, which does not exist in the list.
        // IndexOutOfBoundsException will be thrown when this line runs.

        // Question 11
        // Find the error (what happens when this code runs)?

            // int[][] array = {
            // {1, 2, 3}, 
            // {4, 5}, 
            // {6, 7, 8, 9}
            // };
            // int sumOfAll = 0;
            // for(int i = 0; i < array.length; i++) {
            //     for(int j = 0; j < array[0].length; j++) {
            //         sumOfAll += array[i][j];
            //     }
            // }

        // ArrayIndexOutOfBoundsException - rows have different lengths
        // The error is that we are using array[0].length to determine the number of columns, 
        // but the rows have different lengths (ragged array).
        // To fix this, we should use array[i].length instead of array[0].
        
        // Question 12
        // What is the output?

        int[][] array = {
            {1, 2, 3}, 
            {4, 5, 6}, 
            {7, 8, 9}
        };
        int fullTotal = 0;
        for(int i = 0; i < array.length; i++) {
            fullTotal += array[i][i]; // Adds the elements on the main diagonal (1, 5, 9)
        }
        System.out.println(fullTotal); // The output is 15 (1 + 5 + 9)

        // Question 13
        // What is the output?

        ArrayList<String> manyNames = new ArrayList<>();
        manyNames.add("Alice");
        manyNames.add("Bob");
        manyNames.add("Charlie");
        manyNames.set(1, "David"); // Replaces the element at index 1 from "Bob" to "David"
        System.out.println(manyNames.size() + " " + manyNames.get(1)); 
        // The output is "3 David" because the size of the list is 3 and the element at index 1 has been changed to "David".

        // Question 14
        // What is the output?
        ArrayList<Integer> muchMoreNums = new ArrayList<>();
        muchMoreNums.add(5);
        muchMoreNums.add(10);
        muchMoreNums.add(15);
        muchMoreNums.add(1, 20);
        System.out.println(muchMoreNums.get(2));
        // The output is 10 because we added 20 at index 1, which shifted the original elements to the 
        // right (5 is at index 0, 20 is at index 1, 10 is at index 2, and 15 is at index 3).

        // Question 15
        System.out.println("Question 15");
        int[][] arr = {
            {2, 4, 6}, // 0
            {8, 10, 12}, // 1
            {14, 16, 18} // 2
        };
        int sum = 0;
        for(int j = 0; j < arr[1].length; j++) {
            sum += arr[1][j]; // Adds the elements of the second row (8, 10, 12) to the sum
        }
        System.out.println(sum); // 30

        // Question 16
        // Output?
        System.out.println("Question 16");
        ArrayList<Double> prices2 = new ArrayList<>();
        prices2.add(10.5);
        prices2.add(20.0);
        prices2.add(15.5);
        double max = prices2.get(0); // Initialize max to the first element of the list
        for(int i = 1; i < prices2.size(); i++) { // Start from index 1 since we already used index 0 to initialize max
            if(prices2.get(i) > max) // If the current price is greater than max, update max
                max = prices2.get(i); // The output is 20.0 because it is the largest value in the list.
        }
        System.out.println(max); // Prints the max.

        // Question 17
        // Output?
        int[][] grid = {
            {1, 2, 3, 4}, 
            {5, 6, 7, 8}
        };
        System.out.println(grid.length + " " + grid[0].length); 
        // The output is "2 4" because grid.length gives the number of rows (2) 
        // and grid[0].length gives the number of columns in the first row (4).

        // Question 18
        // Output?
        ArrayList<Integer> list = new ArrayList<>();
        list.add(100);
        list.add(50);
        list.add(75);
        list.add(25);
        int minimal = list.get(0); // Initialize minimal to the first element of the list
        for(Integer num : list) {
            if(num < min) minimal = num; // If the current number is less than min, update minimal to that number
        }
        System.out.println(minimal); // The output is 25 because it is the smallest value in the list.

        // Question 19
        // What is the output?
        int[][] matrix = {
            {1, 2, 3}, 
            {4, 5, 6}, 
            {7, 8, 9}
        };
        int sumIt = 0;
        for(int i = 0; i < matrix.length; i++) { // Iterates through each row of the matrix
            sumIt += matrix[i][matrix.length - 1 - i]; // Adds the elements from the anti-diagonal (3, 5, 7)
        }
        System.out.println(sumIt); // 15 (3 + 5 + 7)

        // Question 20
        // What is the output?
        ArrayList<String> words = new ArrayList<>(); // we put <String> to specify that this ArrayList will hold String objects
        words.add("Java");
        words.add("Python");
        words.add("C++");
        words.remove("Python"); // Removes the element "Python" from the list
        words.add("JavaScript");
        System.out.println(words.get(1)); // C++

        // Question 21
        // What is the output?
        System.out.println("Question 21");
        int[][] arrMeMatey = {
            {10, 20, 30}, 
            {40, 50, 60}
        };
        int total = 0;
        for (int i = 0; i < arrMeMatey.length; i++) {
            for (int j = 0; j < arrMeMatey[i].length; j++) {
                total += arrMeMatey[i][j]; // Adds up all the elements in the 2D array (10 + 20 + 30 + 40 + 50 + 60)
            }
        }
        System.out.println(total); // 210

        // Question 22
        // Output?
        System.out.println("Question 22");
        ArrayList<Integer> nums = new ArrayList<>(); // we put <Integer> to specify that this ArrayList will hold Integer objects
        nums.add(3);
        nums.add(6);
        nums.add(9);
        nums.add(12);
        nums.remove(Integer.valueOf(6)); // Removes the element with the value 6 from the list
        System.out.println(nums.size()); // 3 
        // (3, 9, and 12 are left in the list)
    }
}
