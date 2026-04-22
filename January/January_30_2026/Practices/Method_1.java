package January_30_2026.Practices;

public class Method_1 {
    public static char calculateGrade(int score) {
        if (score >= 90) {
            return 'A';
        } else if (score >= 80 && score <= 89) {
            return 'B';
        } else if (score >= 70 && score <= 79) {
            return 'C';
        } else if (score < 70) {
            return 'F';
        }
        return 0;
    }

    public static void main(String[] args) {
        char grade = calculateGrade(99);
        System.out.println(grade);
        grade = calculateGrade(88);
        System.out.println(grade);
        grade = calculateGrade(75);
        System.out.println(grade);
        grade = calculateGrade(68);
        System.out.println(grade);

    }
}
