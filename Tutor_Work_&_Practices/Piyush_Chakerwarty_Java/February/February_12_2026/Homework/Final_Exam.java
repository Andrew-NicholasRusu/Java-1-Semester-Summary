package February.February_12_2026.Homework;

public class Final_Exam extends GradedActivity {
    // This class represents a final exam and inherits from GradedActivity.
    // It can use the protected score field and the methods defined in GradedActivity.
    private int numQuestions; // Number of questions on the final exam
    private double pointsEach; // Points for each question
    private int numMissed; // Number of questions missed

    public void FinalExam2 (int questions, int missed) {
        double numericScore; // To hold the numeric score
        this.numQuestions = questions;
        this.numMissed = missed;

        // Calculate the points for each question and 
        // the numeric score for this exam.
        pointsEach = 100.0 / questions;
        numericScore = 100.0 - (missed * pointsEach);

        // Call the superclass's setScore method to set the numeric score.
        setScore(numericScore);
        adjustScore();
    }

    /**
     * The getPointsEach method returns the pointsEach field.
     */

    public double getPointsEach() {
        return pointsEach;    
    }

    /**
     * The getNumMissed method returns the numMissed field.
     */

    public int getNumMissed() {
        return numMissed;
    }

    /**
     * The adjustScore method adjusts a numeric score. If score it within 0.5
     * points of the next whole number, it rounds the score up.
     */

    private void adjustScore() {
        double fraction; // To hold the fractional part of the score

        // Get the fractional part of the score.
        fraction = score - (int)score;

        // If the fractional part is 0.5 or greater, round the score up to the next whole number.
        if (fraction >= 0.5) {
            score = score + (1.0 - fraction);
        }
    }
}
