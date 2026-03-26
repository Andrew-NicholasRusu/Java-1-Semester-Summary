package February.February_12_2026.Homework;

import java.util.Scanner;
public class ProtectedDemo {
    public static void main(String[] args) {
        int questions, missed; // Number of questions and number of missed questions

        Scanner sc = new Scanner(System.in);

        // Get the number of questions on the final exam.
        System.out.print("How many questions are on the final exam? ");
        questions = sc.nextInt();

        // Create a FinalExam object.
        Final_Exam exam = new Final_Exam();

        // Display the test results.
        System.out.println("Each question counts " + exam.getPointsEach() + " points.");
        System.out.println("The exam score is " + exam.getScore());
        System.out.println("The exam grade is " + exam.getGrade());
    }
    
}
