public class GradeMatrix {

    // 2D array: students x subjects
    private int[][] grades;

    public GradeMatrix(int[][] grades) {
        this.grades = grades;
    }

    // Calculate the average for each student:
    public void studentAverages() {
        for (int i = 0; i < grades.length; i++) {
            int sum = 0;
            for (int j = 0; j < grades[i].length; j++) {
                sum += grades[i][j];
            }
            double avg = (double) sum / grades[i].length;
            System.out.println("Student " + (i + 1) + " Average: " + avg);
        }
    }

    // Calculate the average for each subject:
    public void subjectAverages() {
        for (int col = 0; col < grades[0].length; col++) {
            int sum = 0;
            for (int row = 0; row < grades.length; row++) {
                sum += grades[row][col];
            }
            double avg = (double) sum / grades.length;
            System.out.println("Subject " + (col + 1) + " Average: " + avg);
        }
    }

    // Find highest grade in entire matrix
    public int findHighest() {
        int highest = grades[0][0];
        for (int[] row : grades) {
            for (int grade : row) {
                if (grade > highest) {
                    highest = grade;
                }
            }
        }
        return highest;
    }

    public static void main (String[] args) {
        // 3 students, 4 subjects each
        int[][] grades = {
            {85, 90, 78, 92}, // Student 1
            {88, 95, 82, 89}, // Student 2
            {92, 88, 95, 90} // Student 3
        };

        GradeMatrix tracker = new GradeMatrix(grades);

        System.out.println("--- Student Averages ---");
        tracker.studentAverages();

        System.out.println("\n--- Subject Averages ---");
        tracker.subjectAverages();
        
        System.out.println("\nHighest Grade: " + tracker.findHighest());
    }
}
