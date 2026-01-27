import java.util.Scanner;

public class Decision_Structure_Homework_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int grade;
        System.out.println("Give me your mark so I can give you your grade.");
        grade = sc.nextInt();
        if (grade >= 90 && grade <= 100) {
            System.out.println("Grade = A");
        } else if (grade >= 70 && grade <= 89) {
            System.out.println("Grade = B");
        } else if (grade >= 50 && grade <= 69) {
            System.out.println("Grade = C");
        } else if (grade >= 30 && grade <= 49) {
            System.out.println("Grade = D");
        } else if (grade <= 30 && grade >= 0) {
            System.out.println("Grade = F");
        } else {
            System.out.println("Invalid marks");
        }
    }
}