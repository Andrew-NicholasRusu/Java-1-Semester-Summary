// Scenario: You are building an Educational Grade Tracker to monitor the weekly test scores of a tutoring student, Alfred. 
// You need to use a standard Java Array to store and analyze his marks. 

/*
1. Class & Array Initialization (3 Marks): 
*/

import java.util.ArrayList;
import java.util.List;

// Create a class named GradeTracker. 
public class GradeTracker {
    // Declare a private integer array named scores
    private final int scores[];

    // Create a constructor that takes an integer array as a parameter and assigns it to scores.
    public GradeTracker(int[] scores) {
        this.scores = scores;
    }

/*
2. Array Iteration & Logic
*/

// Write a public method called calculateAverage() that returns a double. 
// It must iterate through the scores array using a standard for loop, 
// calculate the sum, and return the exact decimal average. 
public double calculateAverage() {
    int total = 0;
    for (int i = 0; i < scores.length; i++) {
        total += scores[i]; // Adds the score
    }
    return (double) total / scores.length; // Casts to double to get decimal average
}

/*
3. Finding Extremes 
*/

// Write a public method called findHighestScore() that returns an int. 
// It must iterate through the array to find and return the maximum value. 
    public int findHighestScore() {
        int highest = scores[0]; // Start with first score / element
        for (int score : scores) {
            if (score > highest) {
                highest = score;
            }
        }
        return highest;
    }


/*
4. ArrayList Iteration
*/
    public void demonstrateFruitList() {
    List<String> fruits = new ArrayList<>();
    fruits.add("Apple");
    fruits.add("Banana");
    fruits.add("Orange");

    // Using enchanced for loop to iterate and print elements. 
    System.out.println("\n--- Fruits List ---");
    for (String fruit : fruits) {
        System.out.println(fruit);
        }
    }   

    public static void main(String[] args) {
        // Create sample scores for Alfred.
        int[] alfredScores = {85, 92, 78, 95, 88, 90};

        // Create GradeTracker object
        GradeTracker tracker = new GradeTracker(alfredScores);

        // Test calculateAverage()
        System.out.println("--- Grade Tracker Results ---");
        System.out.println("Scores:");
        for (int score : alfredScores) {
            System.out.println(score + " ");
        }
        System.out.println();
        System.out.println("Average: " + tracker.calculateAverage());

        // Test findHighestScore()
        System.out.println("Average: " + tracker.findHighestScore()); 

        // Test ArrayList iteration
        tracker.demonstrateFruitList();
    }
}
