package February.February_2_2026;

import java.util.ArrayList; // imports an ArrayList
import java.util.Arrays;

public class Array_Examples {
    public static void main(String[] args) {
    
    double[] arraySample = new double[10]; // double[10]: creates an array with 10 elements
    final int ARRAY_SIZE = 10;
    long[] array1 = new long[ARRAY_SIZE];

    // Populating and displaying basic arrays:
    for (int i = 0; i < arraySample.length; i++) {
        arraySample[i] = i * 1.5; // Fill with sample values
    }

    System.out.println("Double array values:");
    for (double value : arraySample) {
        System.out.print(value + " ");
    }
    System.out.println("\n");

    // Filling and displaying long array.
    for (int i = 0; i < array1.length; i++) {
        array1[i] = 100L + i; // Fill with sample values
        }
        System.out.println("Long array values:");
        for (long value : array1) {  // nested for loop example
            System.out.print(value + " ");
        }
        System.out.println("\n");

        // ========= ARRAYLIST============
        System.out.println("===ARRAYLIST===");
        // Creating an ArrayList (dynamic array)
        ArrayList<String> fruits = new ArrayList<>();
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Orange");
        fruits.add("Mango");
        fruits.add("Grape");
        fruits.add("Plum");
        fruits.add("Strawberry");
        fruits.add("Blueberry");

        System.out.println("ArrayList of Fruits:");
        System.out.println("Size: " + fruits.size());
        System.out.println("Elements: " + fruits);

        // Accessing elements
        System.out.println("First fruit: " + fruits.get(0));
        System.out.println("Last fruit: " + fruits.get(fruits.size() - 1));

        // Modifying elements
        fruits.set(1, "Raspberry");
        System.out.println("After modification: " + fruits);

        // Removing elements
        fruits.remove(2);
        System.out.println("After remvoing index 2: " + fruits);

        // Converting ArrayList to array
        String[] fruitArray = fruits.toArray(new String[0]);
        System.out.println("Converted to array: " + Arrays.toString(fruitArray));
        System.out.println();

        // =============== MULTIDIMENSIONAL ARRAYS ===============
        System.out.println("=== MULTIDIMENSIONAL ARRAYS ===");

        // 2D Array - matrix example
        int[][] matrix = new int[3][4];

        // Populating 2D array
        System.out.println("2D Array (3x4 Matrix):");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = (i * 10) + j; // Fill with values
                System.out.print(matrix[i][j] + "\t");
            }
            System.out.println();
        }
        System.out.println();

        // Jagged array (irregular multidimensional array)
        int[][] jaggedArray = new int[3][];
        jaggedArray[0] = new int[2]; // First row has 2 columns
        jaggedArray[1] = new int[3]; // Second row has 3 columns
        jaggedArray[2] = new int[4]; // Third row has 4 columns

        // Populating jagged array
        System.out.println("Jagged Array:");
        int value = 1;
        for (int i = 0; i < jaggedArray.length; i++) {
            for (int j = 0; j < jaggedArray[i].length; j++) {
                jaggedArray[i][j] = value++;
                System.out.println(jaggedArray[i][j] + "\t");
            }
            System.out.println();
        }
        System.out.println();

        // ========== PRACTICAL EXAMPLE COMBINING ALL ==========
        System.out.println("=== PRACTICAL EXAMPLE ===");

        // Using arrays to store student grades
        double[] studentGrades = new double[5];
        ArrayList<String> studentNames = new ArrayList<>();
        double[][] subjectGrades = new double[3][10]; // 3 subjects, 4 students

        // Populate student names
        studentNames.add("Alice");
        studentNames.add("Bob");
        studentNames.add("Charlie");
        studentNames.add("Micheal");
        studentNames.add("Mike");
        studentNames.add("Andrew");
        studentNames.add("Diana");
        studentNames.add("Ethan");
        studentNames.add("Derrick");

        // Populate student grades 
        for (int i = 0; i < studentGrades.length; i++) {
            studentGrades[i] = 75.0 + (i * 5); // Sample grades
        }

        // Populate subject grades matrix
        for (int subject = 0; subject < subjectGrades.length; subject++) {
            for (int student = 0; student < subjectGrades[subject].length; student++) {
                subjectGrades[subject][student] = 60 + (subject * 10) + (student * 2);
            }
        }

        // Display student information
        System.out.println("Student Report: ");
        for (int = 0; i < studentNames.size(); i++) {
            System.out.println("Name: " + studentNames.get(i) + 
        ", Grade: " + studentGrades[i]);
        }

        // Calculate and display averages
        System.out.println("\n Subject Averages");
        for (int subject = 0; subject < subjectGrades; subject++) {
            double sum = 0;
            for (int student = 0; student < subjectGrades[subject].length; student++) {
                sum += subjectGrades[subject][student];
            }
            double average = sum / subjectGrades[subject].length;
            System.out.println("Subject " + (subject = 1) + 
        " Average: " + String.format("%.2f", average));
        }

    }
}