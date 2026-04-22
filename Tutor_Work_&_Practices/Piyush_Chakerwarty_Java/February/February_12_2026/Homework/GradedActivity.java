// This is a class that shows an example of protected members.
package February.February_12_2026.Homework;

public class GradedActivity {
    protected double score; // Numeric score

    public void setScore(double s) {
        // The setScore method stores its argument in the socre field.
        score = s;
    }

    public double getScore() {
        // The getScore method returns the value stored in the score field.
        return score;
    }

    public char getGrade() {
        char letterGrade; // To hold the grade

        if (score >= 90) {
            letterGrade = 'A';
        }
        else if (score >= 80) {
            letterGrade = 'B';
        }
        else if (score >= 70) {
            letterGrade = 'C';
        }
        else if (score >= 60) {
            letterGrade = 'D';
        }
        else {
            letterGrade = 'F';
        }
        return letterGrade;
    }
    // Because the score field is protected, it can be accessed directly by any subclass of GradedActivity, and it 
    // can also be accessed by any class in the same package as GradedActivity.
}