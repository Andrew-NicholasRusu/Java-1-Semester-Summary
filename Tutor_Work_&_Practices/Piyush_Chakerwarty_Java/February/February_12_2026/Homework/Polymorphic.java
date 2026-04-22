package February.February_12_2026.Homework;

import February.February_12_2026.Homework.PassFailExam;
import February.February_12_2026.Homework.Final_Exam;
import February.February_12_2026.Homework.GradedActivity;

public class Polymorphic {
    // Polymorphism is the ability of an object to take on many forms. In Java, polymorphism allows us to perform a single action in different ways. 
    // It is one of the core concepts of object-oriented programming (OOP) and can be achieved through method overriding and method overloading.
    public static void main(String[] args) {
        // This class was made to understand how polymorphism works in Java, specifically through method overriding.

        // Create an array of GradedActivity references.
        GradedActivity[] tests = new GradedActivity[3];

        // The first test is a regular exam with a numeric socre of 95.
        tests[0] = new GradedActivity();
        tests[0].setScore(95);

        // The second test is a pass/fail test. The student missed 5 out of 20 questions, and the minimum passing grade is 60.
        tests[1] = new PassFailExam(20, 5, 60);

        // The third test is the final exam. There were 50 questions and the student missed 7. 
        tests[2] = new Final_Exam(50, 7);

        // Display the grades.
        for (int index = 0; index < tests.length; index++) {
            System.out.println("Test " + (index + 1) + ": " +
            "Score :" + tests[index].getScore() +
            ", Grade: " + tests[index].getGrade());
        }
    }
}
