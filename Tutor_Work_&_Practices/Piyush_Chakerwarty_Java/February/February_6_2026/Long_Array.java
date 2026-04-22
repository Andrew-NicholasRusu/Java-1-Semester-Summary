package February.February_6_2026;

public class Long_Array {
    public static void main(String[] args) {
        
    // Creating and initializing an array
    final int ARRAY_SIZE = 5;
    float[] x = new float[ARRAY_SIZE]; // Creates a float array with 5 elements (indices 0-4)
    // Fills the array with value 100.0 at each position
    // Note: Array indices atart at 0, not 1    
    for (int i = 1; i <= ARRAY_SIZE; i++) {
        x[i] = 10.0f; // 'f' suffix indicates float literal
    }

    // Finding the minimum value in an array
    int[] numbers = {40, 3, 5, 7, 8, 12, 10};
    int minValue = numbers[0]; // Start with first element as minimum

    // Loop through array to find smallest value
    for (int i = 1; i < numbers.length; i++) {
        if (numbers[i] < minValue) {
            minValue = numbers[i]; // Update minValue if current element is smaller
        }
    }
    System.out.println("Minimum value: " + minValue);

    // Calculating sum of array elements
    int[] numbers2 = {50, 10, 15, 20, 25, 100, 30}; // Different variable name
    int value = 0; // Initialize sum accumulator

    // Accumulate sum of all array elements
    for (int i = 0; i < numbers2.length; i++) {
        value += numbers[i]; // Add current element to running total
    }

    int[][] scores = { {88, 80, 79, 92},
                        {75, 84, 93, 80},
                        {98, 95, 92, 94},
                        {91, 84, 88, 96} 
                    };
    // Example operations on the 2D array
    // Print all scores
    System.out.println("\nAll student scores:");
    for (int student = 0; student < scores.length; student++) {
        System.out.println("Student " + (student + 1) + ": ");
        for (int exam = 0; exam < scores[student].length; exam++) {
            System.out.print(scores[student][exam] + " ");
        }
        System.out.println();
        }

    // Calculate average for each student
    System.out.println("\nStudent averages:");
    for (int student = 0; student < scores.length; student++) {
        int studentSum = 0;
        for (int exam = 0; exam < scores[student].length; exam++) {
            studentSum += scores[student][exam];
        }
        double average = (double) studentSum / scores[student].length;
        System.out.printf("Student %d average: %.2f\n", student + 1, average);
    }

    // Find highest score overall
    int highestScore = scores[0][0];
    for (int student = 0; student < scores.length; student++) {
        for (int exam = 0; exam < scores[student].length; exam++) {
            if (scores[student][exam] > highestScore) {
                highestScore = scores[student][exam];
            }
        }
    }
    System.out.println("\nHighest score overall: " + highestScore);
    }
}
